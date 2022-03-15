package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.Card;
import org.fundacionjala.at15.katas.pokerhands.agustin.HandUtils;

public class StraightFlush extends HandUtils {

    public StraightFlush(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {
        return isStraight() && isFlush();
    }

}
