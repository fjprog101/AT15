package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Straight extends HandAnalysis {
    private static final int FIVE = 5;
    protected int rank;

    @Override
    public boolean analysisOfRule(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuits) {
        int minValueInHand = Collections.min(valueOfCards);
        int maxValueInHand = Collections.max(valueOfCards);
        if (maxValueInHand - minValueInHand != valueOfCards.size() - 1) {
            return false;
        }
        Set<Integer> numberCardsNoRepeted = new HashSet<>();
        for (int ind1 : valueOfCards) {
            if (numberCardsNoRepeted.contains(ind1)) {
                return false;
            }
            numberCardsNoRepeted.add(ind1);
        }
        rank = FIVE;
        return true;
    }
}
