package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class FourOfKind extends CardAnalysis {
    private static final int EIGHT = 8;
    protected int rank;

    public int analysisOfRule(ArrayList<Integer> valueOfCards) {
        int ind2 = 0;
        int ind3 = 0;
        int ind4 = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int ind1 = 0; ind1 < arrayValueCards.length - 1; ind1++) {
            for (ind2 = ind1 + 1; ind2 < arrayValueCards.length; ind2++) {
                for (ind3 = ind2 + 1; ind3 < arrayValueCards.length; ind3++) {
                    for (ind4 = ind2 + 1; ind4 < arrayValueCards.length; ind4++) {
                        if ((arrayValueCards[ind1] == arrayValueCards[ind2])
                                && (arrayValueCards[ind2] == arrayValueCards[ind3])
                                && (arrayValueCards[ind3] == arrayValueCards[ind4])) {
                            return arrayValueCards[ind4];
                        }
                    }
                }
            }
        }
        rank = EIGHT;
        return arrayValueCards[ind4];
    }
}
