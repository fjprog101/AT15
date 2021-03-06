package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Straight extends HandHandler {
    private final int straightPoints = 5;
    private int score1;
    private int score2;
    public int valueOfStraight(String hand) {
        int result = 0;
        if (sortedHand(hand)[0] == sortedHand(hand)[1] - 1
            && sortedHand(hand)[1] == sortedHand(hand)[2] - 1
            && sortedHand(hand)[2] == sortedHand(hand)[INDEX_THREE] - 1
            && sortedHand(hand)[INDEX_THREE] == sortedHand(hand)[INDEX_FOUR] - 1) {

            result = sortedHand(hand)[INDEX_FOUR];
        }
        return result;
    }

    public boolean theHandIsStraight(String hand) {
        boolean result = false;
        if (valueOfStraight(hand) != 0) {
            result = true;
        }
        return result;
    }

    public String compareStraightsHands(String hand1, String hand2) {
        String winner = "Tie";
        if (valueOfStraight(hand1) == valueOfStraight(hand2)) {
            return winner;
        }
        if (valueOfStraight(hand1) > valueOfStraight(hand2)) {
            winner = hand1;
        }
        if (valueOfStraight(hand2) > valueOfStraight(hand1)) {
            winner = hand2;
        }
        return winner;
    }

    public void compareStraightHands(String hand1, String hand2) {
        if (theHandIsStraight(hand1) && theHandIsStraight(hand2)) {
            String winner = compareStraightsHands(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + straightPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + straightPoints;
            }
        } else if (theHandIsStraight(hand1)) {
            score1 = score1 + straightPoints;
        } else if (theHandIsStraight(hand2)) {
            score2 = score2 + straightPoints;
        }
    }
    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
