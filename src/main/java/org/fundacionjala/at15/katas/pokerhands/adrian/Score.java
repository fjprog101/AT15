package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Score {
    private int score1 = 0;
    private int score2 = 0;
    private final int points3 = 3;
    public Score(String hand1, String hand2) {
        HighCard checkHighCard = new HighCard();
        String winner = checkHighCard.compareHandsWithHigherCard(hand1, hand2);
        if (winner.equals(hand1)) {
            score1 = score1 + 1;
        }
        if (winner.equals(hand2)) {
            score2 = score2 + 1;
        }

        Pair checkPairs = new Pair();
        winner = checkPairs.compareHandsWithPairs(hand1, hand2);
        if (winner.equals(hand1)) {
            score1 = score1 + 2;
        }
        if (winner.equals(hand2)) {
            score2 = score2 + 2;
        }

        TwoPair checkTwoPairs = new TwoPair();
        winner = checkTwoPairs.compareHandsWithTwoPairs(hand1, hand2);
        if (winner.equals(hand1)) {
            score1 = score1 + points3;
        }
        if (winner.equals(hand2)) {
            score2 = score2 + points3;
        }
    }

    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
