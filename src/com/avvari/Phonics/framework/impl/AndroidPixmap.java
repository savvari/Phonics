package com.avvari.Phonics.framework.impl;

import android.graphics.Bitmap;
import com.avvari.Phonics.framework.Graphics;
import com.avvari.Phonics.framework.Pixmap;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 */
public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    Graphics.PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, Graphics.PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.PixmapFormat getFormat() {
        return format;
    }
    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
