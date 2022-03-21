package org.fundacionjala.at15.katas.pokerhands.adrian;

public class ThreeOfAKind extends HandHandler {
    private final int threeKindPoints = 4;
    private int score1;
    private int score2;
    public int valueOfThree(String hand) {
        int result = 0;
        for (int index = 0; index < INDEX_THREE; index++) {
            if (sortedHand(hand)[index] == sortedHand(hand)[index + 1]
                && sortedHand(hand)[index] == sortedHand(hand)[index + 2]) {
                result = sortedHand(hand)[index];
            }
        }
        return result;
    }

    public boolean theHandHasThreeOfAKind(String hand) {
        boolean result = false;
        if (valueOfThree(hand) != 0) {
            result = true;
        }
        return result;
    }

    public String compareHandsWithThreeOfAKind(String hand1, String hand2) {
        String winner = "Tie";

        if (valueOfThree(hand1) == valueOfThree(hand2)) {
            return winner;
        }
        if (valueOfThree(hand1) > valueOfThree(hand2)) {
            winner = hand1;
        }
        if (valueOfThree(hand2) > valueOfThree(hand1)) {
            winner = hand2;
        }
        return winner;
    }

    public void compareHandsThreeOfAKind(String hand1, String hand2) {
        if (theHandHasThreeOfAKind(hand1) && theHandHasThreeOfAKind(hand2)) {
            String winner = compareHandsWithThreeOfAKind(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + threeKindPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + threeKindPoints;
            }
        } else if (theHandHasThreeOfAKind(hand1)) {
            score1 = score1 + threeKindPoints;
        } else if (theHandHasThreeOfAKind(hand2)) {
            score2 = score2 + threeKindPoints;
        }
    }
    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
