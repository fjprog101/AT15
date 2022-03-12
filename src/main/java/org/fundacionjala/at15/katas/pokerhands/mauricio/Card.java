package org.fundacionjala.at15.katas.pokerhands.mauricio;

public  class Card {
    private String value;
    private String suit;
    private final int cardValue1 = 1;
    private final int cardValue2 = 2;
    private final int cardValue3 = 3;
    private final int cardValue4 = 4;
    private final int cardValue5 = 5;
    private final int cardValue6 = 6;
    private final int cardValue7 = 7;
    private final int cardValue8 = 8;
    private final int cardValue9 = 9;
    private final int cardValue10 = 10;
    private final int cardValue11 = 11;
    private final int cardValue12 = 12;
    private final int cardValue13 = 13;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getValueOfCard() {
        int result = 0;
        switch (value) {
            case "A":
                result = cardValue13;
                break;
            case "2":
                result = cardValue1;
                break;
            case "3":
                result = cardValue2;
                break;
            case "4":
                result = cardValue3;
                break;
            case "5":
                result = cardValue4;
                break;
            case "6":
                result = cardValue5;
                break;
            case "7":
                result = cardValue6;
                break;
            case "8":
                result = cardValue7;
                break;
            case "9":
                result = cardValue8;
                break;
            case "10":
                result = cardValue9;
                break;
            case "J":
                result = cardValue10;
                break;
            case "Q":
                result = cardValue11;
                break;
            case "K":
                result = cardValue12;
                break;

            default:
                break;
        }
        return result;
    }
}
