package org.fundacionjala.at15.katas.pokerhands.mauricio;

public abstract class Card {
    private String value;

    public Card(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value1) {
        this.value = value1;
    }

    public abstract String getCompletCard();

    public int getValueOfCard() {
        int result = 0;
        switch (value) {
            case "A":
                result = 13;
                break;
            case "2":
                result = 1;
                break;
            case "3":
                result = 2;
                break;
            case "4":
                result = 3;
                break;
            case "5":
                result = 4;
                break;
            case "6":
                result = 5;
                break;
            case "7":
                result = 6;
                break;
            case "8":
                result = 7;
                break;
            case "9":
                result = 8;
                break;
            case "10":
                result = 9;
                break;
            case "J":
                result = 10;
                break;
            case "Q":
                result = 11;
                break;
            case "K":
                result = 12;
                break;

            default:
                break;
        }
        return result;
    }
}
