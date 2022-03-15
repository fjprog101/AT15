package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.*;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.Notation;

public class Pair extends HandUtils {

    public Pair(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {
        for (CardCollection coll : this.coll) {
            if (this.coll.size() == Notation.FOUR.getValue()
                    && coll.getQuantity() == Notation.TWO.getValue()) {
                return true;
            }
        }
        return false;
    }
}
