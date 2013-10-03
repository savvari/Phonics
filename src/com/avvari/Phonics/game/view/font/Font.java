package com.avvari.Phonics.game.view.font;

import com.avvari.Phonics.framework.Graphics;
import com.avvari.Phonics.game.elements.Letter;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public interface Font {
    void drawLetter(Letter letter, Graphics g);
}
