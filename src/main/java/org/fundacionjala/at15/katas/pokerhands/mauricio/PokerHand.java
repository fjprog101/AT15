package org.fundacionjala.at15.katas.pokerhands.mauricio;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {
    private List<Card> cards;

    private final int numberCards = 5;

    public PokerHand(Card card1, Card card2, Card card3, Card card4, Card card5) {
        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
    }

    public int getPokerHandScore() {
        int[] cardValues = new int[numberCards];
        int highNumber;
        for (int vari = 0; vari < cardValues.length; vari++) {
            cardValues[vari] = cards.get(vari).getValueOfCard();
        }
        highNumber = cardValues[0];
        for (int vari = 0; vari < cardValues.length; vari++) {
            if (cardValues[vari] > highNumber) {
                highNumber = cardValues[vari];
            }
        }
        return highNumber;
    }
}
