package org.fundacionjala.at15.katas.pokerhands.adhemar;

import org.fundacionjala.at15.katas.pokerhands.adhemar.pattern.*;

public class PokerHand {
    private Card[] cards;
    private Hand hand;

    public PokerHand(Card[] cards) {
        this.cards = cards;
        defineHand();
    }

    public void defineHand() {
        this.hand = new StraightFlushPattern(cards).match() ? Hand.STRAIGHT_FLUSH
            : new FourOfAKindPattern(cards).match() ? Hand.FOUR
            : new FullHousePattern(cards).match() ? Hand.FULL
            : new FlushPattern(cards).match() ? Hand.FLUSH
            : new StraightPattern(cards).match() ? Hand.STRAIGHT
            : new ThreeOfAKindPattern(cards).match() ? Hand.THREE
            : new TwoPairsPattern(cards).match() ? Hand.TWO_PAIRS
            : new PairPattern(cards).match() ? Hand.PAIR
            : new HighCardPattern(cards).match() ? Hand.HIGH
            : Hand.NONE;
    }

    public Hand getHand() {
        return this.hand;
    }

    public Card[] getCards() {
        return this.cards;
    }
}