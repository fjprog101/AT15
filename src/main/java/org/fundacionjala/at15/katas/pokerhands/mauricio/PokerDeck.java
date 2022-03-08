package org.fundacionjala.at15.katas.pokerhands.mauricio;

import java.util.ArrayList;
import java.util.List;

public class PokerDeck {
    private List<Card> cards;

    public PokerDeck(Card card1, Card card2, Card card3, Card card4, Card card5){
        //arr = {card1, card2, card3, card4, card5};
        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

    }
    public void printDeck() {
        System.out.print("[");
        for (Card card : cards) {
            System.out.print(" " + card.getCompletCard());
        }
        System.out.print("]");
        System.out.println();
    }
}
