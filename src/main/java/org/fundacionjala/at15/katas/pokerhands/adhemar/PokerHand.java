package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class PokerHand extends Pattern {
    private Hand hand;

    public PokerHand(Card[] cards) {
        super(cards);
        defineHand();
    }

    public void defineHand() {
        this.hand = this.isStraightFlush() ? Hand.STRAIGHT_FLUSH
            : this.isFourOfAKind() ? Hand.FOUR
            : this.isFullHouse() ? Hand.FULL
            : this.isOnlyFlush() ? Hand.FLUSH
            : this.isOnlyStraight() ? Hand.STRAIGHT
            : this.isThreeOfAKind() ? Hand.THREE
            : this.isTwoPairs() ? Hand.TWO_PAIRS
            : this.isPair() ? Hand.PAIR
            : this.isHighCard() ? Hand.HIGH
            : Hand.NONE;
    }

    public Hand getHand() {
        return this.hand;
    }
}