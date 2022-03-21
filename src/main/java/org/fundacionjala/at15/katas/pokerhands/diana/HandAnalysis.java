package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public abstract class HandAnalysis {
    protected int rank;

    public abstract boolean analysisOfRule(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuits);

}
