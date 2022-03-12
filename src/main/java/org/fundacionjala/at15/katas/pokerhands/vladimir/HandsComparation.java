package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class HandsComparation extends PokerHands {
    private HighCard highCard = new HighCard();
    private Pair pair = new Pair();
    private TwoPairs twoPairs = new TwoPairs();
    private ThreeOfAKind threeOfAKind = new ThreeOfAKind();
    private Straight straight = new Straight();
    private Flush flush = new Flush();
    private FullHouse fullHouse = new FullHouse();
    private Poker poker = new Poker();
    private StraightFlush straightFlush = new StraightFlush();

    private Hand blackHand;
    private Hand whiteHand;

    public HandsComparation() {

    }

    public HandsComparation(Hand newBlackHand, Hand newWhiteHand) {
        this.blackHand = newBlackHand;
        this.whiteHand = newWhiteHand;
    }

    public String compare() {
        if (handTipe(blackHand) > handTipe(whiteHand)) {
            return "Black hand wins";
        } else if (handTipe(blackHand) < handTipe(whiteHand)) {
            return "White hand wins";
        } else {
            return sameHandComparation(blackHand, whiteHand);
        }
    }

    public String sameHandComparation(Hand blackHandSame, Hand whiteHandSame) {
        SameKindOfHand sameKindOfHand = new SameKindOfHand();
        if (highCard.isHighCard(blackHandSame) == handValue1) {
            return sameKindOfHand.sameHand(highCard, blackHandSame, whiteHandSame);
        } else if (pair.isPair(blackHandSame) == handValue2) {
            return sameKindOfHand.sameHand(pair, blackHandSame, whiteHandSame);
        } else if (twoPairs.isTwoPair(blackHandSame) == handValue3) {
            return sameKindOfHand.sameHand(twoPairs, blackHandSame, whiteHandSame);
        } else if (threeOfAKind.isThreeOfAKind(blackHandSame) == handValue4) {
            return sameKindOfHand.sameHand(threeOfAKind, blackHandSame, whiteHandSame);
        } else if (straight.isStraight(blackHandSame) == handValue5) {
            return sameKindOfHand.sameHand(straight, blackHandSame, whiteHandSame);
        } else if (flush.isFlush(blackHandSame) == handValue6) {
            return sameKindOfHand.sameHand(flush, blackHandSame, whiteHandSame);
        } else if (fullHouse.isFullHouse(blackHandSame) == handValue7) {
            return sameKindOfHand.sameHand(fullHouse, blackHandSame, whiteHandSame);
        } else if (poker.isPoker(blackHandSame) == handValue8) {
            return sameKindOfHand.sameHand(poker, blackHandSame, whiteHandSame);
        } else if (straightFlush.itStraightFlush(blackHandSame) == handValue9) {
            return sameKindOfHand.sameHand(straightFlush, blackHandSame, whiteHandSame);
        }
        return null;
    }

    public int handTipe(Hand hand) {
        int value = 0;
        if (highCard.isHighCard(hand) != 0) {
            return highCard.isHighCard(hand);
        } else if (pair.isPair(hand) != 0) {
            return pair.isPair(hand);
        } else if (twoPairs.isTwoPair(hand) != 0) {
            return twoPairs.isTwoPair(hand);
        } else if (threeOfAKind.isThreeOfAKind(hand) != 0) {
            return threeOfAKind.isThreeOfAKind(hand);
        } else if (straight.isStraight(hand) != 0) {
            return straight.isStraight(hand);
        } else if (flush.isFlush(hand) != 0) {
            return flush.isFlush(hand);
        } else if (fullHouse.isFullHouse(hand) != 0) {
            return fullHouse.isFullHouse(hand);
        } else if (poker.isPoker(hand) != 0) {
            return poker.isPoker(hand);
        } else if (straightFlush.itStraightFlush(hand) != 0) {
            return straightFlush.itStraightFlush(hand);
        }
        return value;
    }
}
