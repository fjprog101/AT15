package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Score {
    private int score1 = 0;
    private int score2 = 0;
    private final int points3 = 3;
    private final int points4 = 4;
    private final int points5 = 5;
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

        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        winner = threeOfAKind.compareHandsWithThreeOfAKind(hand1, hand2);
        if (winner.equals(hand1)) {
            score1 = score1 + points4;
        }
        if (winner.equals(hand2)) {
            score2 = score2 + points4;
        }

        Straight straight = new Straight();
        if (straight.theHandIsStraight(hand1) && straight.theHandIsStraight(hand2)) {
            winner = straight.compareStraightsHands(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + points5;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + points5;
            }
        } else if (straight.theHandIsStraight(hand1)) {
            score1 = score1 + points5;
        } else if (straight.theHandIsStraight(hand2)) {
            score2 = score2 + points5;
        }
    }

    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
