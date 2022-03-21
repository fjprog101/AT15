package org.fundacionjala.at15.katas.pokerhands.saul;

import java.util.List;

public class PokerHand extends Hand {
    private HandRank rank;

    public PokerHand(List<Card> cards) {
        super(cards);
        rank = new HandRank();
        calculateHandRank();
    }

    @Override
    public void calculateHandRank() {
        rank.calculateRank(cards);
        rank.calculateValue(cards);
    }

    @Override
    public HandRank getHandRank() {
        return rank;
    }

    @Override
    public int compareTo(Hand otherHand) {
        if (rank.getValue() < otherHand.getHandRank().getValue()) {
            return -1;
        } else if (rank.getValue() > otherHand.getHandRank().getValue()) {
            return 1;
        } else {
            return 0;
        }
    }
}
