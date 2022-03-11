package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class HandsComparation {
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
        } else {
            return "White hand wins";
        }
    }

    public int handTipe(Hand hand) {
        int value = 0;
        HighCard highCard = new HighCard();
        Pair pair = new Pair();
        TwoPairs twoPairs = new TwoPairs();
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        Straight straight = new Straight();
        Flush flush = new Flush();
        FullHouse fullHouse = new FullHouse();
        Poker poker = new Poker();
        StraightFlush straightFlush = new StraightFlush();
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
