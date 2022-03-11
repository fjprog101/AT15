package org.fundacionjala.at15.katas.pokerhands.adrian;

public class FourOfAKind  extends Hand {

    public int[] valueFourOfAKind(String hand) {
        int[] result = new int[2];
        int indexFour = 0;
        for (int index = 0; index < 2; index++) {
            if (sortedHand(hand)[index] == sortedHand(hand)[index + 1]
                && sortedHand(hand)[index] == sortedHand(hand)[index + 2]
                && sortedHand(hand)[index] == sortedHand(hand)[index + INDEX_THREE]) {
                indexFour = index;
                result[0] = sortedHand(hand)[index];
            }
        }
        int[] proxyArray = new int[1];
        for (int ind = 0, knd = 0; ind < sortedHand(hand).length; ind++) {
            if (ind != indexFour && ind != (indexFour + 1) && ind != (indexFour + 2) && ind != (indexFour + INDEX_THREE)) {
                proxyArray[knd++] = sortedHand(hand)[ind];
            }
        }
        result[1] = proxyArray[0];
        return result;
    }

    public boolean theHandHasFourOfAKind(String hand) {
        boolean result = false;
        if (valueFourOfAKind(hand)[0] != 0) {
            result = true;
        }
        return result;
    }

    public String compareHandsFourOfAKind(String hand1, String hand2) {
        String winner = "Tie";
        if (valueFourOfAKind(hand1)[0] == valueFourOfAKind(hand2)[0]) {
            if (valueFourOfAKind(hand1)[1] > valueFourOfAKind(hand2)[1]) {
                winner = hand1;
            }
            if (valueFourOfAKind(hand2)[1] > valueFourOfAKind(hand1)[1]) {
                winner = hand2;
            }
        }
        if (valueFourOfAKind(hand1)[0] > valueFourOfAKind(hand2)[0]) {
            winner = hand1;
        }
        if (valueFourOfAKind(hand2)[0] > valueFourOfAKind(hand1)[0]) {
            winner = hand2;
        }
        return winner;
    }
}
