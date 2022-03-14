package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public abstract class CardAnalysis {
    protected int rank;

    public abstract int analysisOfRule(ArrayList<Integer> valueOfCards);

}
