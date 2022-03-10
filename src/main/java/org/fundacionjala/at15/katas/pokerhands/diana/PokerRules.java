package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class PokerRules {
    static final int ZERO = 0;
    // private ArrayList<Integer> numeros;
    // private ArrayList<String> suit;
    private int range;
    // public int cardHigh;
    // public int secondCardHigh;

    public PokerRules(List<Integer> numeros) {
        // this.numeros = numeros;
        // this.suit = suit;
        this.range = 0;
        // this.cardHigh = 0;
        // this.secondCardHigh = 0;

    }

    public void evaluateHand() {
        // highCard();
        // pair();
        // twoPair();
        // threeOfAKind();
        // straight();
        // flush();
        // fullHouse();
        // fourOfAKind();
        // straightFlush();

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
        return duplicateValues;
    }

    public void threeOfAKind() {

    }

    public void straight() {

    }

    public void flush() {

    }

    public void fullHouse() {

    }

    public void fourOfAKind() {

    }

    public void straightFlush() {

    }
}
