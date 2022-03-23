package org.fundacionjala.at15.katas.pokerhands.jimy;

public class Card {
    private int value;
    private char suit;
    private final int ten = 10;
    private final int elev = 11;
    private final int twel = 12;
    private final int thert = 13;
    private final int ace = 14;
    private String inp;
    public Card(String input) {
        this.inp = input;
    }
    public int getValue() {
        suit = inp.charAt(inp.length() - 1);
        String aux = inp.substring(0, inp.length() - 1);
        if (Character.isDigit(aux.charAt(0))) {
            value = Integer.valueOf(aux);
        } else {
            switch (aux.charAt(0)) {
                case 'T':
                    value = ten;
                    break;
                case 'J':
                    value = elev;
                    break;
                case 'Q':
                    value = twel;
                    break;
                case 'K':
                    value = thert;
                    break;
                case 'A':
                    value = ace;
                    break;
                default:
                    value = 0;
                    break;
            }
        }
        return value;
    }
    public char getSuit() {
        return suit;
    }
}
