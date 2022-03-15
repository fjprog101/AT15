package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.*;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.Notation;

public class FullHouse extends HandUtils {
    public FullHouse(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {
        boolean isTriple = false;
        boolean isPair = false;
        for (CardCollection collection : this.coll) {
            if (collection.getQuantity() == Notation.THREE.getValue()) {
                isTriple = true;
            } else if (collection.getQuantity() == Notation.TWO.getValue()) {
                isPair = true;
            }
        }
        return isTriple && isPair;
    }
}
