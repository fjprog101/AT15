package org.fundacionjala.at15.katas.pokerhands.adrian;

public class HighCard extends HandHandler {
    private int score1;
    private int score2;

    public String compareHandsWithHigherCard(String hand1, String hand2) {
        String winner = "Tie";
        for (int index = INDEX_FOUR; index >= 0; index--) {
            if (sortedHand(hand1)[index] > sortedHand(hand2)[index]) {
                winner = hand1;
                score1 = score1 + 1;
                break;
            }
            if (sortedHand(hand2)[index] > sortedHand(hand1)[index]) {
                winner = hand2;
                score2 = score2 + 1;
                break;
            }
        }
        return winner;
    }

    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
