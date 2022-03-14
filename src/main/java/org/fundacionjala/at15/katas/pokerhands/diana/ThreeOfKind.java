package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class ThreeOfKind extends CardAnalysis {
    private static final int FOUR = 4;

    @Override
    public int analysisOfRule(ArrayList<Integer> valueOfCards) {
        int ind2 = 0;
        int ind3 = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int ind1 = 0; ind1 < arrayValueCards.length - 1; ind1++) {
            for (ind2 = ind1 + 1; ind2 < arrayValueCards.length; ind2++) {
                for (ind3 = ind2 + 1; ind3 < arrayValueCards.length; ind3++) {
                    if ((arrayValueCards[ind1] == arrayValueCards[ind2])
                            && (arrayValueCards[ind2] == arrayValueCards[ind3])) {
                        return arrayValueCards[ind3];
                    }
                }
            }
        }
        rank = FOUR;
        return arrayValueCards[ind3];
    }

}
