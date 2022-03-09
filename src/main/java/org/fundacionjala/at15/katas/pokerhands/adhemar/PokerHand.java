package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class PokerHand {
    private char[][] charCards;
    private Card[] cards;
    static final int CARDS_HAND = 5;

    public PokerHand(char[][] charCards) {
        this.charCards = charCards;
        this.cards = new Card[CARDS_HAND];
        createCards();
    }

    public char[][] getCharCards() {
        return this.charCards;
    }

    public void createCards() {
        for (byte index = 0; index < this.cards.length; index++) {
            this.cards[index] = new Card(this.charCards[index][0], this.charCards[index][1]);
        }
    }

    public Card[] getCards() {
        return this.cards;
    }
}