package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandFlush extends RankedHand {
    private Compare compare = new Compare();
    private boolean isFlush;

    public boolean rankedHand(String[] hand) {
        if (compare.compareSuit(hand) && !compare.isStraight(hand)) {
            isFlush = true;
        }
        return isFlush;
    }
}