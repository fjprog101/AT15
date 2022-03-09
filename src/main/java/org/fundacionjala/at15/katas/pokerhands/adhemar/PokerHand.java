package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class PokerHand {
    private String[][] stringCards;
    private Card[] cards;
    static final int CARDS_HAND = 5;

    public PokerHand(String[][] stringCards) {
        this.stringCards = stringCards;
        this.cards = new Card[CARDS_HAND];
        createCards();
    }

    public String[][] getStringCards() {
        return this.stringCards;
    }

    public void createCards() {
        for (byte index = 0; index < this.cards.length; index++) {
            this.cards[index] = new Card(this.stringCards[index][0], this.stringCards[index][1]);
        }
    }

    public Card[] getCards() {
        return this.cards;
    }
}