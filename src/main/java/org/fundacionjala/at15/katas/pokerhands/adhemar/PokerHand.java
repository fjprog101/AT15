package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class PokerHand extends Pattern {
    public PokerHand(Card[] cards) {
        super(cards);
    }

    public String defineHand() {
        HandsList hand = this.isStraightFlush() ? HandsList.STRAIGHT_FLUSH
                    : this.isFourOfAKind() ? HandsList.FOUR
                    : this.isFullHouse() ? HandsList.FULL
                    : this.isOnlyFlush() ? HandsList.FLUSH
                    : this.isOnlyStraight() ? HandsList.STRAIGHT
                    : this.isThreeOfAKind() ? HandsList.THREE
                    : this.isTwoPairs() ? HandsList.TWO_PAIRS
                    : this.isPair() ? HandsList.PAIR
                    : this.isHighCard() ? HandsList.HIGH
                    : HandsList.NONE;
        return hand.getHandName();
    }
}