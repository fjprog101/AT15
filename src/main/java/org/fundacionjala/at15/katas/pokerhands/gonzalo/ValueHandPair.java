package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandPair {

    //private char[] cardsValue;
    private int count = 0;
    private int pair = 1;
    private int cardNumber = 0;
    private String valueHand;
    private ValueSuitCard valueCard = new ValueSuitCard();

    public String comare(String[] hand) {
        char[] value = valueCard.valueCard(hand, cardNumber);
        final int nextCard = 1;
        for (int ind = 0; ind < value.length; ind++) {
            final int aux = ind + nextCard;
            for (int indB = aux; indB < value.length; indB++) {
                if (value[ind] == value[indB]) {
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