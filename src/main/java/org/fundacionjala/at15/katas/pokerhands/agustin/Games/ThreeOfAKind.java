package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.*;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.Notation;

public class ThreeOfAKind extends HandUtils {

    public ThreeOfAKind(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {
        for (CardCollection collection : this.coll) {
            if (collection.getQuantity() == Notation.THREE.getValue()) {
                return true;
            }
        }
        return false;
    }
}
