package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Pattern {
    private Card[] cards;

    public Pattern(Card[] cards) {
        this.cards = cards;
    }

    public boolean isAllSameSuit() {
        String prevSuit = this.cards[0].getSuit();
        for (Card card : this.cards) {
            if (prevSuit != card.getSuit()) {
                return false;
            }
            prevSuit = card.getSuit();
        }
        return true;
    }

    public boolean isContinuous() {
        int prevValue = this.cards[0].calculateValue() - 1;
        for (Card card : this.cards) {
            if (card.calculateValue() != prevValue + 1) {
                return false;
            }
            prevValue = card.calculateValue();
        }
        return true;
    }

    public int calculateTheHighestCard() {
        int high = this.cards[0].calculateValue();
        for (Card card : this.cards) {
            high = card.calculateValue() > high ? card.calculateValue() : high;
        }
        return high;
    }

    public int countSameValue() {
        int sameCards = 0;
        int value = this.cards[0].calculateValue();
        for (Card card : this.cards) {
            if (card.calculateValue() == value) {
                sameCards++;
            }
        }
        return sameCards;
    }
}
