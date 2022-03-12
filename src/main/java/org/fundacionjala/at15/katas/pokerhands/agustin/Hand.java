package org.fundacionjala.at15.katas.pokerhands.agustin;

public class Hand {

    private Card highestCard = new Card();

    private Card[] cardCollection;

    public Hand(Card[] cardCollection) {
        this.cardCollection = cardCollection;
    }

    public void setHighestCard() {
        for (Card card : cardCollection) {
            if (card.value > highestCard.value) {
                highestCard = card;
            }
        }
    }

    public Card[] getCardCollection() {
        return cardCollection;
    }

    public void setCardCollection(Card[] param) {
        this.cardCollection = param;
    }

    public Card getHighestCard() {
        return highestCard;
    }
}
