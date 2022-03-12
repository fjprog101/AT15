package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandFlush extends RankedHand {
    private Compare compare = new Compare();
    private String isFlush;

    public String rankedHand(String[] hand) {
        if (compare.compareSuit(hand) && !compare.isStraight(hand)) {
            isFlush = "is Flush";
        }
        return isFlush;
    }
}