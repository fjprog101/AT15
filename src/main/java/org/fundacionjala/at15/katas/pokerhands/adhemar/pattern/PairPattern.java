package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import org.fundacionjala.at15.katas.pokerhands.adhemar.*;

public class PairPattern extends Pattern {
    public PairPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        for (Group group : this.groups) {
            if (this.groups.size() == Values.FOUR
                && !isFlush()
                && group.getQuantity() == Values.TWO) {
                return true;
            }
        }
        return false;
    }
}
