package org.fundacionjala.at15.katas.pokerhands.adrian;

import java.util.Arrays;

public class HighCard extends Hand {
    private static final int INDEX_CERO = 0;
    private static final int INDEX_THREE = 3;
    private static final int INDEX_FOUR = 4;
    private static final int INDEX_SIX = 6;
    private static final int INDEX_NINE = 9;
    private static final int INDEX_TWELVE = 12;

    public String compareHandsWithHigherCard(String hand1, String hand2) {
        String winner = "Tie";
        for (int index = INDEX_FOUR; index >= 0; index--) {
            if (sortedHand(hand1)[index] > sortedHand(hand2)[index]) {
                winner = hand1;
                break;
            }
            if (sortedHand(hand2)[index] > sortedHand(hand1)[index]) {
                winner = hand2;
                break;
            }
        }
        return winner;
    }

    public int[] sortedHand(String hand) {
        int number1 = valueOfCard(hand.charAt(INDEX_CERO));
        int number2 = valueOfCard(hand.charAt(INDEX_THREE));
        int number3 = valueOfCard(hand.charAt(INDEX_SIX));
        int number4 = valueOfCard(hand.charAt(INDEX_NINE));
        int number5 = valueOfCard(hand.charAt(INDEX_TWELVE));
        int[] array = {number1, number2, number3, number4, number5};
        Arrays.sort(array);
        return array;
    }
}
