package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandStraight extends RankedHand {
    private Compare compare = new Compare();
    private String isStraight;

    public String rankedHand(String[] hand) {
        if (!compare.compareSuit(hand) && compare.compareCard1(hand) && compare.compareCard2(hand)
            && compare.compareCard3(hand) && compare.compareCard4(hand) && compare.isStraight(hand)) {
            isStraight = "is Straight";
        }
        return isStraight;
    }
}