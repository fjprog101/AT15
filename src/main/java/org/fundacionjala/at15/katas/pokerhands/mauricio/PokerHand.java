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

    public int getPairCardsScore() { // This method is used in pair, two pairs and three of the same value
        int[] cardValues = new int[numberCards];
        int score = 0;
        for (int vari = 0; vari < cardValues.length; vari++) {
            cardValues[vari] = cards.get(vari).getValueOfCard();
            System.out.println("values: " + cardValues[vari]);
        }
        for (int vari = 0; vari < cardValues.length; vari++) {

            for (int varj = 0; varj < cardValues.length; varj++) {
                if (cardValues[vari] == cardValues[varj]) {
                    score++;
                }
            }
        }
        return score;
    }
}
