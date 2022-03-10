package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Pair extends Hand {

    public int valueOfPairCard(String hand) {
        int result = 0;
        for (int index = 0; index < INDEX_FOUR; index++) {
            if (sortedHand(hand)[index] == sortedHand(hand)[index + 1]) {
                result = sortedHand(hand)[index];
            }
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
}
