package org.fundacionjala.at15.katas.pokerhands.adhemar;

public abstract class Pattern extends Grouper {
    public Pattern(Card[] cards) {
        super(cards);
    }

    public abstract boolean match();

    public boolean isStraight() {
        Card[] sortedCards = HandFunctions.sort(this.cards);
        int prevValue = sortedCards[0].getIntValue() - 1;
        for (Card card : sortedCards) {
            if (card.getIntValue() != prevValue + 1) {
                return false;
            }
            prevValue = card.getIntValue();
        }
        return true;
    }

    public boolean isFlush() {
        String prevSuit = this.cards[0].getSuit();
        for (Card card : this.cards) {
            if (!prevSuit.equals(card.getSuit())) {
                return false;
            }
            prevSuit = card.getSuit();
        }
        return true;
    }
}
