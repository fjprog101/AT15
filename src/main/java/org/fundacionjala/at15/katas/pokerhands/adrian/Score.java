package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Score {
    private int score1 = 0;
    private int score2 = 0;
    private final int twoPairPoints = 3;
    private final int threeKindPoints = 4;
    private final int straightPoints = 5;
    private final int flushPoints = 10;
    private final int fullHousePoints = 20;
    private final int fourOfAKindPoints = 30;
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
        if (checkPairs.theHandHasAPair(hand1) && checkPairs.theHandHasAPair(hand2)) {
            winner = checkPairs.compareHandsWithPairs(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + 2;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + 2;
            }
        } else if (checkPairs.theHandHasAPair(hand1)) {
            score1 = score1 + 2;
        } else if (checkPairs.theHandHasAPair(hand2)) {
            score2 = score2 + 2;
        }


        TwoPair checkTwoPairs = new TwoPair();
        if (checkTwoPairs.theHandHasTwoPairs(hand1) && checkTwoPairs.theHandHasTwoPairs(hand2)) {
            winner = checkTwoPairs.compareHandsWithTwoPairs(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + twoPairPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + twoPairPoints;
            }
        } else if (checkTwoPairs.theHandHasTwoPairs(hand1)) {
            score1 = score1 + twoPairPoints;
        } else if (checkTwoPairs.theHandHasTwoPairs(hand2)) {
            score2 = score2 + twoPairPoints;
        }


        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        if (threeOfAKind.theHandHasThreeOfAKind(hand1) && threeOfAKind.theHandHasThreeOfAKind(hand2)) {
            winner = threeOfAKind.compareHandsWithThreeOfAKind(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + threeKindPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + threeKindPoints;
            }
        } else if (threeOfAKind.theHandHasThreeOfAKind(hand1)) {
            score1 = score1 + threeKindPoints;
        } else if (threeOfAKind.theHandHasThreeOfAKind(hand2)) {
            score2 = score2 + threeKindPoints;
        }


        Straight straight = new Straight();
        if (straight.theHandIsStraight(hand1) && straight.theHandIsStraight(hand2)) {
            winner = straight.compareStraightsHands(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + straightPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + straightPoints;
            }
        } else if (straight.theHandIsStraight(hand1)) {
            score1 = score1 + straightPoints;
        } else if (straight.theHandIsStraight(hand2)) {
            score2 = score2 + straightPoints;
        }

        Flush flush = new Flush();
        if (flush.theHandIsFlush(hand1) && flush.theHandIsFlush(hand2)) {
            winner = flush.compareHandsWithFlush(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + flushPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + flushPoints;
            }
        } else if (flush.theHandIsFlush(hand1)) {
            score1 = score1 + flushPoints;
        } else if (flush.theHandIsFlush(hand2)) {
            score2 = score2 + flushPoints;
        }

        FullHouse fullHouse = new FullHouse();
        if (fullHouse.theHandIsFullHouse(hand1) && fullHouse.theHandIsFullHouse(hand2)) {
            winner = fullHouse.compareHandsFullHouse(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + fullHousePoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + fullHousePoints;
            }
        } else if (fullHouse.theHandIsFullHouse(hand1)) {
            score1 = score1 + fullHousePoints;
        } else if (fullHouse.theHandIsFullHouse(hand2)) {
            score2 = score2 + fullHousePoints;
        }

        FourOfAKind fourOfAKind = new FourOfAKind();
        if (fourOfAKind.theHandHasFourOfAKind(hand1) && fourOfAKind.theHandHasFourOfAKind(hand2)) {
            winner = fourOfAKind.compareHandsFourOfAKind(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + fourOfAKindPoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + fourOfAKindPoints;
            }
        } else if (fourOfAKind.theHandHasFourOfAKind(hand1)) {
            score1 = score1 + fourOfAKindPoints;
        } else if (fourOfAKind.theHandHasFourOfAKind(hand2)) {
            score2 = score2 + fourOfAKindPoints;
        }
    }

    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
