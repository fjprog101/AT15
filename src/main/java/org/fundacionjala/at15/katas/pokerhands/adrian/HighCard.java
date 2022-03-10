package org.fundacionjala.at15.katas.pokerhands.adrian;

public class HighCard extends Hand {

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
}
