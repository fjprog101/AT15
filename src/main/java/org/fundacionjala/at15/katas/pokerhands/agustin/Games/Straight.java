package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.*;

public class Straight extends HandUtils {

    public Straight(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {

        return isStraight();
    }
}
