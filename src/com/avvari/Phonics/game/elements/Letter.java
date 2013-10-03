package com.avvari.Phonics.game.elements;

/**
 * Created with IntelliJ IDEA.
 * User: sridharavvari
 * Date: 02/10/2013
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class Letter {
    char c;
    int code;

    public Letter(int code) {
        this.code = code;
        this.c = (char) code;
    }

    public Letter(char c) {
        this.c = c;
        this.code = (int) c;
    }

    public char getC() {
        return c;
    }

    public int getCode() {
        return code;
    }
}