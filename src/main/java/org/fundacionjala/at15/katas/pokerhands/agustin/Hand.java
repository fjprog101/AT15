package org.fundacionjala.at15.katas.pokerhands.agustin;

public class Hand {

    private Card highestCard = new Card();
    private String handNotation = "";
    private final Card[] cardCollection;

    public Hand(Card[] cardCollection) {
        this.cardCollection = cardCollection;
        setHandNotation();
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

    public Card getHighestCard() {
        return highestCard;
    }

    public void setHandNotation() {
        for (Card card : cardCollection) {
            handNotation = handNotation.concat(card.getCardNotation() + " ");
        }
    }

    public String getHandNotation() {
        return handNotation;
    }
}
