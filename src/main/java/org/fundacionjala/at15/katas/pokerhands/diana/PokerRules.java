package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class PokerRules {
    public ArrayList<Integer> numeros;
    public ArrayList<String> suit;
    public int range;
    public int cardHigh;
    public int secondCardHigh;

    public PokerRules(ArrayList<Integer> numeros, ArrayList<String> suit) {
        this.numeros = numeros;
        this.suit = suit;
        this.range = 0;
        this.cardHigh = 0;
        this.secondCardHigh = 0;

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

    public int getRange() {
        return range;
    }

    public void highCard() {
        range = 1;
        cardHigh = 5;
    }

    public void pair() {
        range = 2;
        cardHigh = 5;
    }

    public void twoPair() {
        range = 3;
        cardHigh = 5;
        secondCardHigh = 5;

    }

    public void threeOfAKind() {
        range = 4;
        cardHigh = 5;
    }

    public void straight() {
        range = 5;
    }

    public void flush() {
        range = 6;

    }

    public void fullHouse() {
        range = 7;

    }

    public void fourOfAKind() {
        range = 8;

    }

    public void straightFlush() {
        range = 9;

    }
}
