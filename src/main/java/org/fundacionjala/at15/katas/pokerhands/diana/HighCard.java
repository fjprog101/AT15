package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;

public class HighCard extends CardAnalysis {
    private static final int ONE = 1;
    protected int range;

    @Override
    public int analysisOfRule(ArrayList<Integer> valueOfCards) {
        int valueHighCard = Collections.max(valueOfCards);
        range = ONE;
        return valueHighCard;
    }
}
