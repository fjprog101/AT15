package org.fundacionjala.at15.katas.pokerhands.adrian;

public class ThreeOfAKind extends Hand {

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
}
