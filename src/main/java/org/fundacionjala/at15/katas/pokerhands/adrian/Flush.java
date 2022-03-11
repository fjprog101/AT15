package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Flush extends Hand {

    public boolean theHandIsFlush(String hand) {
        boolean result = false;
        int counter = 0;
        for (int ind = 0; ind < INDEX_FOUR; ind++) {
            if (handSuit(hand)[ind] == handSuit(hand)[ind + 1]) {
                counter++;
            }
        }
        if (counter == INDEX_FOUR) {
            result = true;
        }
        return result;
    }

    public String compareHandsWithFlush(String hand1, String hand2) {
        String winner = "Tie";
        for (int ind = INDEX_FOUR; ind >= 0; ind--) {
            if (sortedHand(hand1)[ind] > sortedHand(hand2)[ind]) {
                winner = hand1;
                break;
            }
            if (sortedHand(hand2)[ind] > sortedHand(hand1)[ind]) {
                winner = hand2;
                break;
            }
        }
        return winner;
    }
}
