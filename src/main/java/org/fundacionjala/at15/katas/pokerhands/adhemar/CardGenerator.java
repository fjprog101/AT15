package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class CardGenerator {
    private String[] stringHand;
    private Card[] cards;

    public CardGenerator(String[] stringHand) {
        this.stringHand = stringHand;
        this.cards = new Card[stringHand.length];
        createCards();
    }

    public void createCards() {
        for (byte index = 0; index < this.stringHand.length; index++) {
            String[] stringCard = stringHand[index].split("");
            this.cards[index] = new Card(stringCard[0], stringCard[1]);
        }
    }

    public Card[] getCards() {
        return this.cards;
    }
}
