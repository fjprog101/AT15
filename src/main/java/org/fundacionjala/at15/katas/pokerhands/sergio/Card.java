package org.fundacionjala.at15.katas.pokerhands.sergio;

public class Card {
    private int value;
    private String suit;
    private String stringValue;

    public Card(String newStringValue, String suit) {
        this.stringValue = newStringValue;
        this.suit = suit;
        correctStringValue();
        stringValueToInt();
    }

    public void correctStringValue() {
        if (stringValue.equals("T")) {
            this.stringValue = "10";
        } else if (stringValue.equals("J")) {
            this.stringValue = "11";
        } else if (stringValue.equals("Q")) {
            this.stringValue = "12";
        } else if (stringValue.equals("K")) {
            this.stringValue = "13";
        } else if (stringValue.equals("A")) {
            stringValue = "14";
        }
    }

    public void stringValueToInt() {
        this.value = Integer.parseInt(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
