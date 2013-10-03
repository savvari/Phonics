package com.avvari.Phonics.framework;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public interface Graphics {
    public static enum PixmapFormat {
        ARGB8888, ARGB4444, RGB567
    }

    Pixmap newPixmap(String fileName, PixmapFormat format);
    void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY,
                    int srcWidth, int srcHeight);
}
