package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class Converter {
    private final int cardsInHand = 5;
    private final int cardNumber = 0;
    private final int cardSuit = 1;
    private char valueThisCard;
    private char[] cardsValue;
    private int[] cardsValueInt;
    private int auxMax = 0;
    private int auxMin = 0;
    private int major = 0;
    private int less = 14;

    public char[] converterCharValue(String[] hand) {
        cardsValue = new char[cardsInHand];
        for (int ind = 0; ind < hand.length; ind++) {
            valueThisCard = hand[ind].charAt(cardNumber);
            cardsValue[ind] = valueThisCard;
        }
        return cardsValue;
    }

    public char[] converterCharSuit(String[] hand) {
        cardsValue = new char[cardsInHand];
        for (int ind = 0; ind < hand.length; ind++) {
            valueThisCard = hand[ind].charAt(cardSuit);
            cardsValue[ind] = valueThisCard;
        }
        return cardsValue;
    }

    public int[] converterInt(char[] hand) {
        cardsValueInt = new int[cardsInHand];
        final int cardT = 10;
        final int cardJ = 11;
        final int cardQ = 12;
        final int cardK = 13;
        final int cardA = 14;
        for (int ind = 0; ind < hand.length; ind++) {
            if (hand[ind] == 'T') {
                cardsValueInt[ind] = cardT;
            } else if (hand[ind] == 'J') {
                cardsValueInt[ind] = cardJ;
            } else if (hand[ind] == 'Q') {
                cardsValueInt[ind] = cardQ;
            } else if (hand[ind] == 'K') {
                cardsValueInt[ind] = cardK;
            } else if (hand[ind] == 'A') {
                cardsValueInt[ind] = cardA;
            } else {
                cardsValueInt[ind] = Character.getNumericValue(hand[ind]);
            }
        }
        return cardsValueInt;
    }

    public int getPositionMinorCard(int[] hand) {
        for (int ind = 0; ind < hand.length; ind++) {
            if (hand[ind] < less) {
                less = hand[ind];
                auxMin = ind;
            }
        }
        return auxMin;
    }

    public int getPositionMajorCard(int[] hand) {
        for (int ind = 0; ind < hand.length; ind++) {
            if (hand[ind] > major) {
                major = hand[ind];
                auxMax = ind;
            }
        }
        return auxMax;
    }
}