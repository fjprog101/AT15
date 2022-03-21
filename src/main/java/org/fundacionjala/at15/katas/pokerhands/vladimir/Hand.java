package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Hand {
    private final int limit = 5;
    private Card[] card = new Card[limit];

    public Hand(Card[] newCard) {
        this.card = newCard;
    }

    public Card[] getCards() {
        return card;
    }
}

