package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import org.fundacionjala.at15.katas.pokerhands.adhemar.*;

public class FullHousePattern extends Pattern {
    public FullHousePattern(Card[] cards) {
        super(cards);
    }

    @Override
    public boolean match() {
        boolean isThereTriple = false;
        boolean isPair = false;
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.THREE) {
                isThereTriple = true;
            }
            if (group.getQuantity() == Values.TWO) {
                isPair = true;
            }
        }
        return isThereTriple && isPair;
    }
}
