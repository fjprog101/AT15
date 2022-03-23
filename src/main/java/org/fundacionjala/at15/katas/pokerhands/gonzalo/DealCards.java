package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import java.util.ArrayList;
import java.util.List;

public class DealCards {
    private List<String> cards;
    private DeckOfCards deck;
    private final int cardsInHand = 5;

    public List<String> cardsForDeal() {
        List<String> deckCard = new ArrayList<String>();
        deckCard.addAll(deck.clubsSuit());
        deckCard.addAll(deck.diamondsSuit());
        deckCard.addAll(deck.heartsSuit());
        deckCard.addAll(deck.spadesSuit());
        return deckCard;
    }

    public String dealtCards() {
        cards = cardsForDeal();
        String card;
        int deal = (int) (Math.random() * cards.size());
        card = cards.get(deal);
        cards.remove(deal);
        return card;
    }

    public String[] handDeal() {
        String[] hand = new String[cardsInHand];
        for (int ind = 0; ind < hand.length; ind++) {
            hand[ind] = dealtCards();
        }
        return hand;
    }
}
