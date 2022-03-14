package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Pair extends HandHandler {
    private int score1;
    private int score2;

    public int valueOfPairCard(String hand) {
        int result = 0;
        for (int index = 0; index < INDEX_FOUR; index++) {
            if (sortedHand(hand)[index] == sortedHand(hand)[index + 1]) {
                result = sortedHand(hand)[index];
            }
        }
        return result;
    }

    public boolean theHandHasAPair(String hand) {
        boolean result = false;
        if (valueOfPairCard(hand) != 0) {
            result = true;
        }
        return result;
    }

    public String compareHandsWithPairs(String hand1, String hand2) {
        String winner = "Tie";
        if (valueOfPairCard(hand1) == valueOfPairCard(hand2)) {
            return winner;
        }
        if (valueOfPairCard(hand1) > valueOfPairCard(hand2)) {
            winner = hand1;
        }
        if (valueOfPairCard(hand2) > valueOfPairCard(hand1)) {
            winner = hand2;
        }
        return winner;
    }

    public void compareHandPairs(String hand1, String hand2) {
        if (theHandHasAPair(hand1) && theHandHasAPair(hand2)) {
            String winner = compareHandsWithPairs(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + 2;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + 2;
            }
        } else if (theHandHasAPair(hand1)) {
            score1 = score1 + 2;
        } else if (theHandHasAPair(hand2)) {
            score2 = score2 + 2;
        }
    }

    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
