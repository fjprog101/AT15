package org.fundacionjala.at15.katas.pokerhands;

public class Hand {
    private final int limit = 5;
    private Card[] card = new Card[limit];

    public Hand(Card[] newCard) {
        this.card = newCard;
    }

    public Card highCard() {
        int high = 0;
        int numAux;
        int pos = 0;
        for (int ind = 0; ind < card.length; ind++) {
            numAux = Character.getNumericValue(card[ind].getValue());
            if (Character.isDigit(card[ind].getValue())) {
                if (high < numAux) {
                    high = numAux;
                    pos = ind;
                }
            } else {
                return card[ind];
            }
        }
        return card[pos];
    }
}

