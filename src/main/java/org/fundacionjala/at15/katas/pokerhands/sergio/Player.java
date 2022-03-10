package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class Player {
    private String name;
    private List<Card> pokerHand;

    public Player(List<Card> newHand, String name) {
        this.name = name;
        this.pokerHand = newHand;
    }

    public String getName() {
        return name;
    }

    public Card getPokerHandCard(int ind) {
        return pokerHand.get(ind);
    }
}
