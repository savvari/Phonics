package com.avvari.Phonics.framework;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public interface Pixmap {
    int getWidth();
    int getHeight();
    Graphics.PixmapFormat getFormat();
    void dispose();
}