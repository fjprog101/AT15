package org.fundacionjala.at15.katas.pokerhands;

public class Cards {
    private final int numberOfCards = 13;
    private String[] clubs;

    public String[] cards(String suit) {
        clubs = new String[numberOfCards];
        int valueCard = 2;
        final int value10 = 10;
        final int value11 = 11;
        final int value12 = 12;
        final int value13 = 13;
        final int value14 = 14;
        for (int ind = 0; ind < numberOfCards; ind++) {
            clubs[ind] = valueCard + suit;
            if (valueCard == value10) {
                String valueC = "T";
                clubs[ind] = valueC + suit;
            } else if (valueCard == value11) {
                String valueC = "J";
                clubs[ind] = valueC + suit;
            } else if (valueCard == value12) {
                String valueC = "Q";
                clubs[ind] = valueC + suit;
            } else if (valueCard == value13) {
                String valueC = "K";
                clubs[ind] = valueC + suit;
            } else if (valueCard == value14) {
                String valueC = "A";
                clubs[ind] = valueC + suit;
            }
            valueCard++;
        }
        return clubs;
    }
}