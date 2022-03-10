package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandPair {

    private final int cardsInHand = 5;
    private char[] cardsValue;
    private char valueThisCard;
    private int count = 0;
    private int pair = 1;
    private String valueHand;

    public char[] valueCards(String[] hand) {
        cardsValue = new char[cardsInHand];
        for (int ind = 0; ind < hand.length; ind++) {
            valueThisCard = hand[ind].charAt(0);
            cardsValue[ind] = valueThisCard;
        }
        return cardsValue;
    }

    public String comare(String[] hand) {
        char[] value = valueCards(hand);
        final int nextCard = 1;
        for (int ind = 0; ind < value.length; ind++) {
            final int aux = ind + nextCard;
            for (int indB = aux; indB < value.length; indB++) {
                if (cardsValue[ind] == value[indB]) {
                    count++;
                }
            }
        }
        if (count == pair) {
            valueHand = "pair";
        }
        return valueHand;
    }
}