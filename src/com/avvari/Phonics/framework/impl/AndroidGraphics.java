package com.avvari.Phonics.framework.impl;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.avvari.Phonics.framework.Graphics;
import com.avvari.Phonics.framework.Pixmap;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
 class AndroidGraphics implements Graphics {
    AssetManager assetManager;
    Bitmap frameBuffer;
    Canvas canvas;
    public AndroidGraphics(AssetManager assetManager, Bitmap frameBuffer) {
        this.assetManager = assetManager;
        this.frameBuffer = frameBuffer;
        this.canvas = new Canvas(frameBuffer);
    }

    @Override
    public Pixmap newPixmap(String fileName, PixmapFormat format) {
        Bitmap.Config config = null;
        if(format == PixmapFormat.RGB567) {
            config = Bitmap.Config.RGB_565;
        } else if(format == PixmapFormat.ARGB4444) {
            config = Bitmap.Config.ARGB_4444;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;

        InputStream in = null;
        Bitmap bitmap = null;

        try {
            in = assetManager.open(fileName);
            bitmap = BitmapFactory.decodeStream(in, null, options);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {}
            }
        }

        return new AndroidPixmap(bitmap, format);
    }

    @Override
    public void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY, int srcWidth, int srcHeight) {
        Rect srcRect = new Rect();
        Rect dstRect = new Rect();

        srcRect.left = srcX;
        srcRect.top = srcY;
        srcRect.right = srcX + srcWidth - 1;
        srcRect.bottom = srcY + srcHeight - 1;

        dstRect.left = x;
        dstRect.top = y;
        dstRect.right = x + srcWidth - 1;
        dstRect.bottom = y + srcHeight - 1;

        canvas.drawBitmap(((AndroidPixmap)pixmap).bitmap, srcRect, dstRect, null);
    }
}
