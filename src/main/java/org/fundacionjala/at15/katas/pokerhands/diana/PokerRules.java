package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class PokerRules {
    private ArrayList<Integer> numeros;
    private ArrayList<String> suit;
    // public int range;
    // public int cardHigh;
    // public int secondCardHigh;

    public PokerRules(ArrayList<Integer> numeros, ArrayList<String> suit) {
        // this.numeros = numeros;
        // this.suit = suit;
        // this.range = 0;
        // this.cardHigh = 0;
        // this.secondCardHigh = 0;

    }

    public void evaluateHand() {
        highCard();
        pair();
        twoPair();
        threeOfAKind();
        straight();
        flush();
        fullHouse();
        fourOfAKind();
        straightFlush();

    }

    // public int getRange() {
    // // return range;
    // }

    public void highCard() {
    }

    public void pair() {

    }

    public void twoPair() {

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
