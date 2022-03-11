package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PokerRules {
    static final int ZERO = 0;
    private ArrayList<Integer> numeros;
    private ArrayList<String> suits;
    private int range;
    // public int cardHigh;
    // public int secondCardHigh;

    public PokerRules(ArrayList<Integer> numeros, ArrayList<String> suits) {
        this.numeros = numeros;
        this.suits = suits;
        this.range = 0;
        // this.cardHigh = 0;
        // this.secondCardHigh = 0;

    }

    public void evaluateHand() {
        highCard(numeros);
        pair(numeros);
        twoPair(numeros);
        threeOfAKind(numeros);
        straight(numeros);
        flush(suits);
        fullHouse(numeros);
        fourOfAKind(numeros);
        straightFlush(numeros, suits);
    }

    public int getRange() {
        return range;
    }

    public int highCard(ArrayList<Integer> valueOfCards) {
        int valueHighCard = Collections.max(valueOfCards);
        range = 1;
        return valueHighCard;
    }

    public int pair(ArrayList<Integer> valueOfCards) {
        int indPD = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int indP = 0; indP < arrayValueCards.length - 1; indP++) {
            for (indPD = indP + 1; indPD < arrayValueCards.length; indPD++) {
                if (arrayValueCards[indP] == arrayValueCards[indPD]) {
                    return arrayValueCards[indPD];
                }
            }
        }
        return arrayValueCards[indPD];
    }

    public List<Integer> twoPair(ArrayList<Integer> valueOfCards) {
        List<Integer> duplicateValues = new ArrayList<Integer>();
        int indPD = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int indP = 0; indP < arrayValueCards.length - 1; indP++) {
            for (indPD = indP + 1; indPD < arrayValueCards.length; indPD++) {
                if (arrayValueCards[indP] == arrayValueCards[indPD]) {
                    duplicateValues.add(arrayValueCards[indPD]);
                }
            }
        }
        return duplicateValues.stream().distinct().collect(Collectors.toList());
    }

    public int threeOfAKind(ArrayList<Integer> valueOfCards) {
        int indPD = 0;
        int indPDN = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int indP = 0; indP < arrayValueCards.length - 1; indP++) {
            for (indPD = indP + 1; indPD < arrayValueCards.length; indPD++) {
                for (indPDN = indPD + 1; indPDN < arrayValueCards.length; indPDN++) {
                    if ((arrayValueCards[indP] == arrayValueCards[indPD])
                            && (arrayValueCards[indPD] == arrayValueCards[indPDN])) {
                        return arrayValueCards[indPDN];
                    }
                }
            }
        }
        return arrayValueCards[indPDN];
    }

    public boolean straight(ArrayList<Integer> valueOfCards) {
        int min = Collections.min(valueOfCards);
        int max = Collections.max(valueOfCards);
        if (max - min != valueOfCards.size() - 1) {
            return false;
        }
        Set<Integer> visited = new HashSet<>();
        for (int inde : valueOfCards) {
            if (visited.contains(inde)) {
                return false;
            }
            visited.add(inde);
        }
        return true;
    }

    public boolean flush(ArrayList<String> valueOfSuitCards) {
        return new HashSet<String>(valueOfSuitCards).size() <= 1;
    }

    public List<Integer> fullHouse(ArrayList<Integer> valueOfCards) {
        List<Integer> fullHousValues = new ArrayList<Integer>();
        int indPD = 0;
        int indPDN = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int indP = 0; indP < arrayValueCards.length - 1; indP++) {
            for (indPD = indP + 1; indPD < arrayValueCards.length; indPD++) {
                for (indPDN = indPD + 1; indPDN < arrayValueCards.length; indPDN++) {
                    if ((arrayValueCards[indP] == arrayValueCards[indPD])
                            && (arrayValueCards[indP] == arrayValueCards[indPDN])) {
                        fullHousValues.add(arrayValueCards[indPDN]);
                    }
                    if (arrayValueCards[indP] == arrayValueCards[indPD]) {
                        fullHousValues.add(arrayValueCards[indPD]);
                    }
                }
            }
        }
        List<Integer> arrayAux = fullHousValues.stream().distinct().collect(Collectors.toList());
        return arrayAux.stream().sorted().collect(Collectors.toList());
    }

    public int fourOfAKind(ArrayList<Integer> valueOfCards) {
        int indPD = 0;
        int indPDN = 0;
        int indPDNu = 0;
        int[] arrayValueCards = valueOfCards.stream().mapToInt(i -> i).toArray();
        for (int indP = 0; indP < arrayValueCards.length - 1; indP++) {
            for (indPD = indP + 1; indPD < arrayValueCards.length; indPD++) {
                for (indPDN = indPD + 1; indPDN < arrayValueCards.length; indPDN++) {
                    for (indPDNu = indPD + 1; indPDNu < arrayValueCards.length; indPDNu++) {
                        if ((arrayValueCards[indP] == arrayValueCards[indPD])
                                && (arrayValueCards[indPD] == arrayValueCards[indPDN])
                                && (arrayValueCards[indPDN] == arrayValueCards[indPDNu])) {
                            return arrayValueCards[indPDNu];
                        }
                    }
                }
            }
        }
        return arrayValueCards[indPDNu];
    }

    public boolean straightFlush(ArrayList<Integer> valueOfCards, ArrayList<String> valueOfSuitCards) {
        if (new HashSet<String>(valueOfSuitCards).size() <= 1) {
            int min = Collections.min(valueOfCards);
            int max = Collections.max(valueOfCards);
            if (max - min != valueOfCards.size() - 1) {
                return false;
            }
            Set<Integer> visited = new HashSet<>();
            for (int inde : valueOfCards) {
                if (visited.contains(inde)) {
                    return false;
                }
                visited.add(inde);
            }
            return true;
        }
        return false;
    }
}
