package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class StraightFlushPattern extends Pattern {
    public StraightFlushPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        return isFlush() && isStraight();
    }
}
