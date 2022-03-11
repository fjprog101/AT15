package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.HashSet;

public class Flush extends HandAnalysis {
    private static final int SIX = 6;
    protected int range;

    @Override
    public boolean analysisOfRule(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuits) {
        range = SIX;
        return new HashSet<String>(valueOfSuits).size() <= 1;
    }

}
