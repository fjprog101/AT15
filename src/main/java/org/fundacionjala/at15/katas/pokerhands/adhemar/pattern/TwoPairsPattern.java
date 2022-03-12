package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import org.fundacionjala.at15.katas.pokerhands.adhemar.*;

public class TwoPairsPattern extends Pattern {
    public TwoPairsPattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        int pairs = 0;
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.TWO) {
                pairs++;
            }
        }
        if (pairs == Values.TWO && !isFlush()) {
            return true;
        }
        return false;
    }
}
