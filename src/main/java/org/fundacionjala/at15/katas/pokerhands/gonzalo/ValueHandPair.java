package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandPair extends RankedHand {

    //private char[] cardsValue;
    private int count = 0;
    private int pair = 1;
    private String valueHand;
    private Converter valueCard = new Converter();

    public String rankedHand(String[] hand) {
        char[] value = valueCard.converterCharValue(hand);
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