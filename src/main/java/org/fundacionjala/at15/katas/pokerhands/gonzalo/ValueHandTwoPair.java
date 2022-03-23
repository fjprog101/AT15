package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandTwoPair extends RankedHand {

    private int count = 0;
    private final int twoPair = 2;
    private boolean valueTwoPair;
    private Converter valueCard = new Converter();
    private Compare compare = new Compare();

    public boolean rankedHand(String[] hand) {
        char[] value = valueCard.converterCharValue(hand);
        for (int ind = 0; ind < value.length; ind++) {
            count = count + compare.xCardsHaveTheSameValue(value, ind);
        }
        if (count == twoPair) {
            valueTwoPair = true;
        }
        return valueTwoPair;
    }
}