package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class FlushPattern extends Pattern {
    public FlushPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        return !isStraight() && isFlush();
    }
}
