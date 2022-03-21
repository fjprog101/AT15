package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import org.fundacionjala.at15.katas.pokerhands.adhemar.*;

public class HighCardPattern extends Pattern {
    public HighCardPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        if (this.groups.size() == Values.FIVE && !isFlush()) {
            return true;
        }
        return false;
    }
}
