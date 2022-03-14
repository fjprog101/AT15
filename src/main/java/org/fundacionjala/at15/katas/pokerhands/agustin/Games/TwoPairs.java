package org.fundacionjala.at15.katas.pokerhands.agustin.Games;
import org.fundacionjala.at15.katas.pokerhands.agustin.*;
import org.fundacionjala.at15.katas.pokerhands.agustin.CardCollection;
import org.fundacionjala.at15.katas.pokerhands.agustin.HandUtils;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.Notation;

public class TwoPairs extends HandUtils {

    public TwoPairs(Card[] cards) {
        super(cards);
    }

    public boolean match() {
        int pairs = 0;
        for (CardCollection collection : this.coll) {
            if (collection.getQuantity() == Notation.TWO.getValue()) {
                pairs++;
            }
        }
        return pairs == Notation.TWO.getValue();
    }
}
