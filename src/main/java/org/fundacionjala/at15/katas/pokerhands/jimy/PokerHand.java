package org.fundacionjala.at15.katas.pokerhands.jimy;

import java.util.Vector;

public class PokerHand {
    private Vector<Card> card;
    private int combination;
    private int highCard;
    public PokerHand(String[] input) {
        card = new Vector(input.length);
        for (int index = 0; index < input.length; index++) {
            card.add(new Card(input[index]));
        }
        order();
    }
    public int getValue(int index) {
        return card.get(index).getValue();
    }
    public char getSuit(int index) {
        return card.get(index).getSuit();
    }
    private void order() {
        for (int index = 0; index < card.capacity(); index++) {
            int indexOfMin = index;
            int min = getValue(index);
            for (int jIndex = index + 1; jIndex < card.capacity(); jIndex++) {
                if (getValue(jIndex) < min) {
                    min = getValue(jIndex);
                    indexOfMin = jIndex;
                }
            }
            Card aux = getCard(index);
            card.set(index, getCard(indexOfMin));
            card.set(indexOfMin, aux);
        }
    }
    public int getCombination() {
        return combination;
    }
    public int getHighCard() {
        return highCard;
    }
    public Card getCard(int index) {
        return card.get(index);
    }
    public void setCombination(int newcombination) {
        combination = newcombination;
    }
    public void setHighCard(int index) {
        this.highCard = index;
    }
}
