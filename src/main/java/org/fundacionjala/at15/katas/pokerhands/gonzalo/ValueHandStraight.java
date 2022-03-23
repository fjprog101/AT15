package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandStraight extends RankedHand {
    private Compare compare = new Compare();
    private boolean isStraight;

    public boolean rankedHand(String[] hand) {
        if (!compare.compareSuit(hand) && compare.isStraight(hand) && compare.cardNoSameValue(hand)) {
            isStraight = true;
        }
        return isStraight;
    }
}