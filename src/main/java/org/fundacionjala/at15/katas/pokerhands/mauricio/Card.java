package org.fundacionjala.at15.katas.pokerhands.mauricio;

public abstract class Card {
    private String value;

    private final int number1 = 1;
    private final int number2 = 2;
    private final int number3 = 3;
    private final int number4 = 4;
    private final int number5 = 5;
    private final int number6 = 6;
    private final int number7 = 7;
    private final int number8 = 8;
    private final int number9 = 9;
    private final int number10 = 10;
    private final int number11 = 11;
    private final int number12 = 12;
    private final int number13 = 13;

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
                result = number13;
                break;
            case "2":
                result = number1;
                break;
            case "3":
                result = number2;
                break;
            case "4":
                result = number3;
                break;
            case "5":
                result = number4;
                break;
            case "6":
                result = number5;
                break;
            case "7":
                result = number6;
                break;
            case "8":
                result = number7;
                break;
            case "9":
                result = number8;
                break;
            case "10":
                result = number9;
                break;
            case "J":
                result = number10;
                break;
            case "Q":
                result = number11;
                break;
            case "K":
                result = number12;
                break;

            default:
                break;
        }
        return result;
    }
}
