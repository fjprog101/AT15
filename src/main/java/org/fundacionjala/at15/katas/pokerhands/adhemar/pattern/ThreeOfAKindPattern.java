package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import org.fundacionjala.at15.katas.pokerhands.adhemar.*;

public class ThreeOfAKindPattern extends Pattern {
    public ThreeOfAKindPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        for (Group group : this.groups) {
            if (!isFlush() && group.getQuantity() == Values.THREE) {
                return true;
            }
        }
        return false;
    }
}
