package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import org.fundacionjala.at15.katas.pokerhands.adhemar.*;

public class FourOfAKindPattern extends Pattern {
    public FourOfAKindPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.FOUR) {
                return true;
            }
        }
        return false;
    }
}
