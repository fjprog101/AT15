package org.fundacionjala.at15.katas.pokerhands.saul;

import java.util.List;

public abstract class PokerHand implements Comparable<PokerHand> {
    private List<Card> pokerHand;

    public PokerHand(Card... cards) {
        setCards(cards);
    }

    public PokerHand(List<Card> pokerHand) {
        this.pokerHand = pokerHand;
    }

    public List<Card> getHand() {
        return pokerHand;
    }

    protected void setCards(Card... cards) {
        for (int index = 0; index < cards.length; index++) {
            pokerHand.add(cards[index]);
        }
    }

    public abstract int getHandValue();
}
