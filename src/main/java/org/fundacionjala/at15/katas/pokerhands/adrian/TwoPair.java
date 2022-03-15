package org.fundacionjala.at15.katas.pokerhands.adrian;

public class TwoPair extends HandHandler {
    private final int twoPairPoints = 3;
    private int valuePair1 = 0;
    private int valuePair2 = 0;
    private int score1;
    private int score2;
    public int[] valueOfTwoPairs(String hand) {
        int[] result = new int[2];
        int indexPair1 = 0;

        for (int index = 0; index < INDEX_FOUR; index++) {
            if (sortedHand(hand)[index] == sortedHand(hand)[index + 1]) {
                indexPair1 = index; //because the array is sorted, the highest pair index will be saved here
                valuePair1 = sortedHand(hand)[index];
            }
        }

        int[] proxyArray = new int[INDEX_THREE];
        for (int ind = 0, knd = 0; ind < sortedHand(hand).length; ind++) {
            if (ind != indexPair1 && ind != (indexPair1 + 1)) {
                proxyArray[knd++] = sortedHand(hand)[ind];
            }
        }

        for (int indx = 0; indx < 2; indx++) {
            if (proxyArray[indx] == proxyArray[indx + 1]) {
                valuePair2 = proxyArray[indx];
            }
        }

        result[0] = valuePair1;
        result[1] = valuePair2;

        return result;
    }

    public boolean theHandHasTwoPairs(String hand) {
        boolean result = false;
        if ((valueOfTwoPairs(hand)[1] != 0) /*&& (valueOfTwoPairs(hand)[0] != 0)*/) {
            result = true;
        }
        return result;
    }

    public String compareHandsWithTwoPairs(String hand1, String hand2) {
        String winner = "Tie";

        if (valueOfTwoPairs(hand1)[0] == valueOfTwoPairs(hand2)[0]) {
            if (valueOfTwoPairs(hand1)[1] == valueOfTwoPairs(hand2)[1]) {
                return winner;
            }
            if (valueOfTwoPairs(hand1)[1] > valueOfTwoPairs(hand2)[1]) {
                winner = hand1;
            }
            if (valueOfTwoPairs(hand2)[1] > valueOfTwoPairs(hand1)[1]) {
                winner = hand2;
            }
        }
        if (valueOfTwoPairs(hand1)[0] > valueOfTwoPairs(hand2)[0]) {
            winner = hand1;
        }
        if (valueOfTwoPairs(hand2)[0] > valueOfTwoPairs(hand1)[0]) {
            winner = hand2;
        }

        return winner;
    }

    public void compareHandTwoPairs(String hand1, String hand2) {
        if (theHandHasTwoPairs(hand1) && theHandHasTwoPairs(hand2)) {
            String winner = compareHandsWithTwoPairs(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + twoPairPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + twoPairPoints;
            }
        } else if (theHandHasTwoPairs(hand1)) {
            score1 = score1 + twoPairPoints;
        } else if (theHandHasTwoPairs(hand2)) {
            score2 = score2 + twoPairPoints;
        }
    }
    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
