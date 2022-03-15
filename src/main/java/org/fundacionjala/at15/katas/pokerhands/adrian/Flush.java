package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Flush extends HandHandler {
    private final int flushPoints = 10;
    private int score1;
    private int score2;
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

    public void compareHandFlush(String hand1, String hand2) {
        if (theHandIsFlush(hand1) && theHandIsFlush(hand2)) {
            String winner = compareHandsWithFlush(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + flushPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + flushPoints;
            }
        } else if (theHandIsFlush(hand1)) {
            score1 = score1 + flushPoints;
        } else if (theHandIsFlush(hand2)) {
            score2 = score2 + flushPoints;
        }
    }
    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
