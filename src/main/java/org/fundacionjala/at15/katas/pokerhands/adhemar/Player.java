package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Player {
    private String name;
    private PokerHand pokerHand;

    public Player(String name, String stringHand) {
        this.name = name;
        this.pokerHand = new PokerHand(new CardGenerator(stringHand).getCards());
    }

    public String getName() {
        return this.name;
    }

    public PokerHand getPokerHand() {
        return this.pokerHand;
    }
}
