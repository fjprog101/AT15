package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandFullHouse extends RankedHand {

    private int count = 0;
    private final int full = 4;
    private boolean valueFull;
    private Converter valueCard = new Converter();
    private Compare compare = new Compare();

    public boolean rankedHand(String[] hand) {
        char[] value = valueCard.converterCharValue(hand);
        for (int ind = 0; ind < value.length; ind++) {
            count = count + compare.xCardsHaveTheSameValue(value, ind);
        }
        if (count == full) {
            valueFull = true;
        }
        return valueFull;
    }
}
