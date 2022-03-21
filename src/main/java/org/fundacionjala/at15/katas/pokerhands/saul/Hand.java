package org.fundacionjala.at15.katas.pokerhands.saul;

import java.util.List;

public abstract class Hand implements Comparable<Hand> {
    protected List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> newCards) {
        this.cards = newCards;
    }

    public abstract HandRank getHandRank();

    public abstract void calculateHandRank();
}