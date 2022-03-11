package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class PokerHand extends Pattern {
    public PokerHand(Card[] cards) {
        super(cards);
    }

    public String defineHand() {
        String hand = this.isStraightFlush() ? "straight flush"
                    : this.isFourOfAKind() ? "four of a kind"
                    : this.isFullHouse() ? "full house"
                    : this.isOnlyFlush() ? "flush"
                    : this.isOnlyStraight() ? "straight"
                    : this.isThreeOfAKind() ? "three of a kind"
                    : this.isTwoPairs() ? "two pairs"
                    : this.isPair() ? "pair"
                    : this.isHighCard() ? "high card"
                    : "It doesn't match";
        return hand;
    }
}