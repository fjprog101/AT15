package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.fundacionjala.at15.katas.pokerhands.saul.Constans.*;

import java.util.List;

public class HandRank {
    private int value;
    private Rank rank;

    public HandRank() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(List<Card> hand) {
        if (isStraightFlush(hand)) {
            rank = Rank.STRAIGHT_FLUSH;
            value = NINE;
        } else if (isFourKind(hand)) {
            rank = Rank.FOUR_KIND;
            value = EIGHT;
        } else if (isFullHouse(hand)) {
            rank = Rank.FULL_HOUSE;
            value = SEVEN;
        } else if (isFlush(hand)) {
            rank = Rank.FLUSH;
            value = SIX;
        } else if (isStraight(hand)) {
            rank = Rank.STRAIGHT;
            value = FIVE;
        } else if (isThreeKind(hand)) {
            rank = Rank.THREE_KIND;
            value = FOUR;
        } else if (isTwoPairs(hand)) {
            rank = Rank.TWO_PAIRS;
            value = THREE;
        } else if (isPair(hand)) {
            rank = Rank.PAIR;
            value = TWO;
        } else {
            rank = Rank.HIGH_CARD;
            value = ONE;
        }
    }

    private boolean isPair(List<Card> hand) {
        return false;
    }

    private boolean isTwoPairs(List<Card> hand) {
        return false;
    }

    private boolean isThreeKind(List<Card> hand) {
        return false;
    }

    private boolean isStraight(List<Card> hand) {
        return false;
    }

    private boolean isFlush(List<Card> hand) {
        return false;
    }

    private boolean isFullHouse(List<Card> hand) {
        return false;
    }

    private boolean isFourKind(List<Card> hand) {
        return false;
    }

    private boolean isStraightFlush(List<Card> hand) {
        return false;
    }

    enum Rank {
        HIGH_CARD, PAIR, TWO_PAIRS, THREE_KIND, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_KIND, STRAIGHT_FLUSH;
    }
}
