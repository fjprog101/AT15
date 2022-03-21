package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FullHouse extends HandAnalysis {
    private static final int SEVEN = 7;

    @Override
    public boolean analysisOfRule(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuits) {
        List<Integer> fullHouseValues = new ArrayList<Integer>();
        int ind2 = 0;
        int ind3 = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int ind1 = 0; ind1 < arrayValueCards.length - 1; ind1++) {
            for (ind2 = ind1 + 1; ind2 < arrayValueCards.length; ind2++) {
                for (ind3 = ind2 + 1; ind3 < arrayValueCards.length; ind3++) {
                    if ((arrayValueCards[ind1] == arrayValueCards[ind2])
                            && (arrayValueCards[ind1] == arrayValueCards[ind3])) {
                        fullHouseValues.add(arrayValueCards[ind3]);
                    }
                    if (arrayValueCards[ind1] == arrayValueCards[ind2]) {
                        fullHouseValues.add(arrayValueCards[ind2]);
                    }
                }
            }
        }
        List<Integer> arrayAux = fullHouseValues.stream().distinct().collect(Collectors.toList());
        rank = SEVEN;
        List<Integer> aux = arrayAux.stream().sorted().collect(Collectors.toList());
        if (aux == null || aux.size() <= 1) {
            return false;
        }
        return true;
    }
}
