package org.fundacionjala.at15.katas.pokerhands.agustin.Games;

import org.fundacionjala.at15.katas.pokerhands.agustin.*;

public class Flush extends HandUtils {
    public Flush(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean check() {
        return isFlush();
    }
}
