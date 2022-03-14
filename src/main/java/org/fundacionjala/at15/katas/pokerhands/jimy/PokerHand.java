package org.fundacionjala.at15.katas.pokerhands.jimy;

import java.util.Vector;

public class PokerHand {
    private Vector<Card> cards;
    private int combination;
    private int highCard;
    private final int tam = 5;
    public PokerHand(String[] input) {
        cards = new Vector(tam);
        for (int index = 0; index < tam; index++) {
            cards.add(new Card(input[index]));
        }
        order();
    }
    public int getValue(int index) {
        return cards.get(index).getValue();
    }
    public char getSuit(int index) {
        return cards.get(index).getSuit();
    }
    private void order() {
        for (int index = 0; index < cards.capacity(); index++) {
            int indexOfMin = index;
            int min = getValue(index);
            for (int jIndex = index + 1; jIndex < cards.capacity(); jIndex++) {
                if (getValue(jIndex) < min) {
                    min = getValue(jIndex);
                    indexOfMin = jIndex;
                }
            }
            Card aux = getCard(index);
            cards.set(index, getCard(indexOfMin));
            cards.set(indexOfMin, aux);
        }
    }
    public int getCombination() {
        return combination;
    }
    public int getHighCard() {
        return highCard;
    }
    public Card getCard(int index) {
        return cards.get(index);
    }
    public void setCombination(int newcombination) {
        this.combination = newcombination;
    }
    public void setHighCard(int index) {
        this.highCard = index;
    }
}
