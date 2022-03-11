package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PokerRules {
    static final int ZERO = 0;
    static final int ONE = 0;
    static final int TWO = 0;
    static final int THREE = 0;
    static final int FOUR = 0;
    static final int FIVE = 0;
    static final int SIX = 0;
    static final int SEVEN = 0;
    static final int EIGHT = 0;
    static final int NINE = 0;
    private ArrayList<Integer> number;
    private ArrayList<String> suit;
    private int range;

    public PokerRules(ArrayList<Integer> number, ArrayList<String> suit) {
        this.number = number;
        this.suit = suit;
        this.range = 0;
    }

    public void evaluateHand() {
        highCard(number);
        pair(number);
        twoPair(number);
        threeOfAKind(number);
        straight(number);
        flush(suit);
        fullHouse(number);
        fourOfAKind(number);
        straightFlush(number, suit);
    }

    public int getRange() {
        return range;
    }

    public int highCard(ArrayList<Integer> valueOfCards) {
        int valueHighCard = Collections.max(valueOfCards);
        range = ONE;
        return valueHighCard;
    }

    public int pair(ArrayList<Integer> valueOfCards) {
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

    public List<Integer> twoPair(ArrayList<Integer> valueOfCards) {
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
        range = THREE;
        Collections.sort(duplicateValues, Collections.reverseOrder());
        return duplicateValues;
    }

    public int threeOfAKind(ArrayList<Integer> valueOfCards) {
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
        range = FOUR;
        return arrayValueCards[ind3];
    }

    public boolean straight(ArrayList<Integer> valueOfCards) {
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
        range = FIVE;
        return true;
    }

    public boolean flush(ArrayList<String> valueOfSuitCards) {
        range = SIX;
        return new HashSet<String>(valueOfSuitCards).size() <= 1;
    }

    public List<Integer> fullHouse(ArrayList<Integer> valueOfCards) {
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
        range = SEVEN;
        return arrayAux.stream().sorted().collect(Collectors.toList());
    }

    public int fourOfAKind(ArrayList<Integer> valueOfCards) {
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
        range = EIGHT;
        return arrayValueCards[ind4];
    }

    public boolean straightFlush(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuitCards) {
        if (new HashSet<String>(valueOfSuitCards).size() <= 1) {
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
