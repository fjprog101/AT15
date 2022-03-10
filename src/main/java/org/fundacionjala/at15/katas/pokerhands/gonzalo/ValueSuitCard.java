package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueSuitCard {
    private final int cardsInHand = 5;
    private char valueThisCard;
    private char[] cardsValue;

    public char[] valueCard(String[] hand, int value) {
        cardsValue = new char[cardsInHand];
        for (int ind = 0; ind < hand.length; ind++) {
            valueThisCard = hand[ind].charAt(value);
            cardsValue[ind] = valueThisCard;
        }
        return cardsValue;
    }

    public char[] suitCards(String[] hand, int suit) {
        cardsValue = new char[cardsInHand];
        for (int ind = 0; ind < hand.length; ind++) {
            valueThisCard = hand[ind].charAt(suit);
            cardsValue[ind] = valueThisCard;
        }
        return cardsValue;
    }
}
