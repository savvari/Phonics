package com.avvari.Phonics.game.view.font.impl;

import com.avvari.Phonics.framework.Graphics;
import com.avvari.Phonics.framework.Pixmap;
import com.avvari.Phonics.game.elements.Letter;
import com.avvari.Phonics.game.view.font.Font;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class AtbFont implements Font {
    Pixmap atbFontPixmap;
    static Map alphabetPositionMap = new HashMap();
    {
        alphabetPositionMap.put(101, new AlphabetPosition(0, 0, 57, 57));
        alphabetPositionMap.put(102, new AlphabetPosition(57, 0, 57, 57));
        alphabetPositionMap.put(103, new AlphabetPosition(114, 0, 46, 57));
        alphabetPositionMap.put(104, new AlphabetPosition(160, 0, 50, 57));
        alphabetPositionMap.put(105, new AlphabetPosition(210, 0, 54, 57));
        alphabetPositionMap.put(106, new AlphabetPosition(265, 0, 48, 57));
        alphabetPositionMap.put(107, new AlphabetPosition(313, 0, 56, 57));
        alphabetPositionMap.put(110, new AlphabetPosition(369, 0, 59, 57));
        alphabetPositionMap.put(111, new AlphabetPosition(428, 0, 35, 57));
        alphabetPositionMap.put(112, new AlphabetPosition(463, 0, 48, 57));
        alphabetPositionMap.put(113, new AlphabetPosition(511, 0, 59, 57));
        alphabetPositionMap.put(114, new AlphabetPosition(570, 0, 50, 57));
        alphabetPositionMap.put(115, new AlphabetPosition(620, 0, 76, 57));
        alphabetPositionMap.put(116, new AlphabetPosition(696, 0, 68, 57));
        alphabetPositionMap.put(117, new AlphabetPosition(764, 0, 45, 57));
        alphabetPositionMap.put(120, new AlphabetPosition(809, 0, 51, 57));
        alphabetPositionMap.put(121, new AlphabetPosition(860, 0, 47, 70));
        alphabetPositionMap.put(122, new AlphabetPosition(907, 0, 57, 57));
        alphabetPositionMap.put(123, new AlphabetPosition(964, 0, 42, 57));
        alphabetPositionMap.put(124, new AlphabetPosition(1006, 0, 49, 57));
        alphabetPositionMap.put(125, new AlphabetPosition(1055, 0, 63, 57));
        alphabetPositionMap.put(126, new AlphabetPosition(1118, 0, 57, 57));
        alphabetPositionMap.put(127, new AlphabetPosition(1175, 0, 74, 57));
        alphabetPositionMap.put(130, new AlphabetPosition(1249, 0, 52, 57));
        alphabetPositionMap.put(131, new AlphabetPosition(1301, 0, 58, 57));
        alphabetPositionMap.put(132, new AlphabetPosition(1359, 0, 41, 47));
    }

    public AtbFont(Pixmap atbFontPixmap) {
        this.atbFontPixmap = atbFontPixmap;
    }

    @Override
    public void drawLetter(Letter letter, Graphics g) {
    }

    class AlphabetPosition {
        int x, y, width, height;
        AlphabetPosition(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        int getX() {
            return x;
        }

        int getY() {
            return y;
        }

        int getWidth() {
            return width;
        }

        int getHeight() {
            return height;
        }
    }
}
