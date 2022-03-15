package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandPair extends RankedHand {

    //private char[] cardsValue;
    private int count = 0;
    private int pair = 1;
    private boolean valuePair;
    private Converter valueCard = new Converter();
    private Compare compare = new Compare();

    public boolean rankedHand(String[] hand) {
        char[] value = valueCard.converterCharValue(hand);
        for (int ind = 0; ind < value.length; ind++) {
            count = count + compare.xCardsHaveTheSameValue(value, ind);
        }
        if (count == pair) {
            valuePair = true;
        }
        return valuePair;
    }
}