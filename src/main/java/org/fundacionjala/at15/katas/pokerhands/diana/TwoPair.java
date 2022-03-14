package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoPair extends HandAnalysis {
    private static final int THREE = 3;
    protected int rank;

    @Override
    public boolean analysisOfRule(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuits) {
        List<Integer> duplicateValues = new ArrayList<Integer>();
        int ind2 = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int ind1 = 0; ind1 < arrayValueCards.length - 1; ind1++) {
            for (ind2 = ind1 + 1; ind2 < arrayValueCards.length; ind2++) {
                if (arrayValueCards[ind1] == arrayValueCards[ind2]) {
                    duplicateValues.add(arrayValueCards[ind2]);
                }
            }
        }
        rank = THREE;
        Collections.sort(duplicateValues, Collections.reverseOrder());
        if (duplicateValues == null || duplicateValues.size() <= 1) {
            return false;
        }
        return true;
    }
}
