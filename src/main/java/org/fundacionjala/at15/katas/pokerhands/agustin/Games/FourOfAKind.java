package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.Card;
import org.fundacionjala.at15.katas.pokerhands.agustin.CardCollection;
import org.fundacionjala.at15.katas.pokerhands.agustin.HandUtils;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.Notation;

public class FourOfAKind extends HandUtils {
    public FourOfAKind(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {
        for (CardCollection collection : this.coll) {
            if (collection.getQuantity() == Notation.FOUR.getValue()) {
                return true;
            }
        }
        return false;
    }
}
