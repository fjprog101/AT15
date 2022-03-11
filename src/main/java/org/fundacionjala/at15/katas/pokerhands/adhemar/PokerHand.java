package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class PokerHand {
    private String[][] stringCards;
    private Card[] cards;
    private Pattern pattern;
    static final int CARDS_HAND = 5;

    public PokerHand(String[][] stringCards) {
        this.stringCards = stringCards;
        this.cards = new Card[CARDS_HAND];
        createCards();
        this.pattern = new Pattern(this.cards);
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

    public String defineHand() {
        String hand = pattern.isStraightFlush() ? "straight flush"
                    : pattern.isFourOfAKind() ? "four of a kind"
                    : pattern.isFullHouse() ? "full house"
                    : pattern.isOnlyFlush() ? "flush"
                    : pattern.isOnlyStraight() ? "straight"
                    : pattern.isThreeOfAKind() ? "three of a kind"
                    : pattern.isTwoPairs() ? "two pairs"
                    : pattern.isPair() ? "pair"
                    : pattern.isHighCard() ? "high card"
                    : "It doesn't match";
        return hand;
    }
}