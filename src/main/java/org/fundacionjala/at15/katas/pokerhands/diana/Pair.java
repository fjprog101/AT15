package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class Pair extends CardAnalysis {
    private static final int TWO = 2;
    protected int range;

    @Override
    public int analysisOfRule(ArrayList<Integer> valueOfCards) {
        range = TWO;
        int ind2 = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int ind1 = 0; ind1 < arrayValueCards.length - 1; ind1++) {
            for (ind2 = ind1 + 1; ind2 < arrayValueCards.length; ind2++) {
                if (arrayValueCards[ind1] == arrayValueCards[ind2]) {
                    return arrayValueCards[ind2];
                }
            }
        }
        return arrayValueCards[ind2];
    }
}
