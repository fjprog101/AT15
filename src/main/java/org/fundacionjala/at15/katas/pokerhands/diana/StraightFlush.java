package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StraightFlush extends HandAnalysis {
    private static final int NINE = 9;
    protected int range;

    @Override
    public boolean analysisOfRule(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuits) {
        if (new HashSet<String>(valueOfSuits).size() <= 1) {
            int minNumberInHand = Collections.min(valueOfCards);
            int maxNumberInHand = Collections.max(valueOfCards);
            if (maxNumberInHand - minNumberInHand != valueOfCards.size() - 1) {
                return false;
            }
            Set<Integer> numbersNoRepeted = new HashSet<>();
            for (int inde : valueOfCards) {
                if (numbersNoRepeted.contains(inde)) {
                    return false;
                }
                numbersNoRepeted.add(inde);
            }
            return true;
        }
        range = NINE;
        return false;
    }

}
