package org.fundacionjala.at15.katas.pokerhands.saul;

import java.util.List;

public class PokerHand implements Comparable<PokerHand> {
    private List<Card> pokerHand;
    private HandRank rank;

    public PokerHand(List<Card> pokerHand) {
        this.pokerHand = pokerHand;
        rank = new HandRank();
        rank.setRank(pokerHand);
        rank.setValue(pokerHand);
    }

    public List<Card> getHand() {
        return pokerHand;
    }

    public int getHandValue() {
        return rank.getValue();
    }

    public void setRank() {
        rank.setRank(pokerHand);
    }

    public HandRank getRank() {
        return rank;
    }

    @Override
    public int compareTo(PokerHand otherHand) {
        if (rank.getValue() < otherHand.getHandValue()) {
            return -1;
        } else if (rank.getValue() > otherHand.getHandValue()) {
            return 1;
        } else {
            return 0;
        }
    }
}
