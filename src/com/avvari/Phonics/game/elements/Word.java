package com.avvari.Phonics.game.elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
public class Word {
    private List<Letter> letters;
    private String img;

    public Word(String word) {
        letters = createLettersList(word);
    }

    public Word(String word, String img) {
        letters = createLettersList(word);
        this.img = img;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public String getImg() {
        return img;
    }

    public String toString() {
        StringBuffer strBuffer = new StringBuffer();
        for(Letter letter : letters) {
            strBuffer.append(letter.getC());
        }

        return strBuffer.toString();
    }

    private List<Letter> createLettersList(String word) {
        List<Letter> lettersList = new ArrayList<Letter>();

        int len = word.length();
        for(int i=0; i<len; i++) {
            Letter letter = new Letter(word.charAt(i));
            lettersList.add(letter);
        }

        return lettersList;
    }
}
