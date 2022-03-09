package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Card extends Deck {
    private final int cardValue2 = 2;
    private final int cardValue3 = 3;
    private final int cardValue4 = 4;
    private final int cardValue5 = 5;
    private final int cardValue6 = 6;
    private final int cardValue7 = 7;
    private final int cardValue8 = 8;
    private final int cardValue9 = 9;
    private final int cardValue10 = 10;
    private final int cardValueJ = 11;
    private final int cardValueQ = 12;
    private final int cardValueK = 13;
    private final int cardValueA = 14;

    public Card(String newValue, String newSuit) {
        super(newValue, newSuit);
    }

    public String combination() {
        return value + suit;
    }

    public int getValue() {
        int num = 0;
        switch (value) {
            case "2":
                num = cardValue2;
            case "3":
                num = cardValue3;
            case "4":
                num = cardValue4;
            case "5":
                num = cardValue5;
            case "6":
                num = cardValue6;
            case "7":
                num = cardValue7;
            case "8":
                num = cardValue8;
            case "9":
                num = cardValue9;
            case "10":
                num = cardValue10;
            case "J":
                num = cardValueJ;
            case "Q":
                num = cardValueQ;
            case "K":
                num = cardValueK;
            case "A":
                num = cardValueA;
            default:
                break;
        }
        return num;
    }

    public String getSuit() {
        return suit;
    }
}
