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
        switch (value) {
            case "2":
                return cardValue2;
            case "3":
                return cardValue3;
            case "4":
                return cardValue4;
            case "5":
                return cardValue5;
            case "6":
                return cardValue6;
            case "7":
                return cardValue7;
            case "8":
                return cardValue8;
            case "9":
                return cardValue9;
            case "10":
                return cardValue10;
            case "J":
                return cardValueJ;
            case "Q":
                return cardValueQ;
            case "K":
                return cardValueK;
            case "A":
                return cardValueA;
            default:
                break;
        }
        return 0;
    }

    public String getSuit() {
        return suit;
    }
}
