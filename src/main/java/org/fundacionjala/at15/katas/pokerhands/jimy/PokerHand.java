package org.fundacionjala.at15.katas.pokerhands.jimy;

import java.util.Vector;

public class PokerHand {
    private Vector<Card> card;
    public PokerHand(String[] input) {
        card = new Vector(input.length);
        for (int index = 0; index < input.length; index++) {
            card.add(new Card(input[index]));
        }
    }
    public int getValue(int index) {
        return card.get(index).getValue();
    }
    public char getSuit(int index) {
        return card.get(index).getSuit();
    }
}
