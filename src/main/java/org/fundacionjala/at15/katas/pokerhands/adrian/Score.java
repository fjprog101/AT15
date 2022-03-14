package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Score {
    private int score1;
    private int score2;
    private final int straightFlushPoints = 100;
    public Score(String hand1, String hand2) {
        HighCard checkHighCard = new HighCard();
        String winner = checkHighCard.compareHandsWithHigherCard(hand1, hand2);
        score1 = checkHighCard.getScore1();
        score2 = checkHighCard.getScore2();

        Pair checkPairs = new Pair();
        checkPairs.compareHandPairs(hand1, hand2);
        score1 = score1 + checkPairs.getScore1();
        score2 = score2 + checkPairs.getScore2();

        TwoPair checkTwoPairs = new TwoPair();
        checkTwoPairs.compareHandTwoPairs(hand1, hand2);
        score1 = score1 + checkTwoPairs.getScore1();
        score2 = score2 + checkTwoPairs.getScore2();

        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        threeOfAKind.compareHandsThreeOfAKind(hand1, hand2);
        score1 = score1 + threeOfAKind.getScore1();
        score2 = score2 + threeOfAKind.getScore2();

        Straight straight = new Straight();
        straight.compareStraightHands(hand1, hand2);
        score1 = score1 + straight.getScore1();
        score2 = score2 + straight.getScore2();

        Flush flush = new Flush();
        flush.compareHandFlush(hand1, hand2);
        score1 = score1 + flush.getScore1();
        score2 = score2 + flush.getScore2();

        FullHouse fullHouse = new FullHouse();
        fullHouse.compareFullHouse(hand1, hand2);
        score1 = score1 + fullHouse.getScore1();
        score2 = score2 + fullHouse.getScore2();

        FourOfAKind fourOfAKind = new FourOfAKind();
        fourOfAKind.compareFourOfAKind(hand1, hand2);
        score1 = score1 + fourOfAKind.getScore1();
        score2 = score2 + fourOfAKind.getScore2();

        if (straight.theHandIsStraight(hand1) && flush.theHandIsFlush(hand1)) {
            score1 = score1 + straightFlushPoints;
        }
        if (straight.theHandIsStraight(hand2) && flush.theHandIsFlush(hand2)) {
            score2 = score2 + straightFlushPoints;
        }
    }

    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
