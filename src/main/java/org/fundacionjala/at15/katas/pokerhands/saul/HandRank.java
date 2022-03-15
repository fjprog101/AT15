package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.fundacionjala.at15.katas.pokerhands.saul.RankValues.*;

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

    public void calculateRank(List<Card> hand) {
        if (HandTypeVerifier.isStraightFlush(hand)) {
            rank = Rank.STRAIGHT_FLUSH;
        } else if (HandTypeVerifier.isFourKind(hand)) {
            rank = Rank.FOUR_KIND;
        } else if (HandTypeVerifier.isFullHouse(hand)) {
            rank = Rank.FULL_HOUSE;
        } else if (HandTypeVerifier.isFlush(hand)) {
            rank = Rank.FLUSH;
        } else if (HandTypeVerifier.isStraight(hand)) {
            rank = Rank.STRAIGHT;
        } else if (HandTypeVerifier.isThreeKind(hand)) {
            rank = Rank.THREE_KIND;
        } else if (HandTypeVerifier.isTwoPairs(hand)) {
            rank = Rank.TWO_PAIRS;
        } else if (HandTypeVerifier.isPair(hand)) {
            rank = Rank.PAIR;
        } else {
            rank = Rank.HIGH_CARD;
        }
    }

    public void calculateValue(List<Card> hand) {
        switch (rank) {
            case STRAIGHT_FLUSH:
                value = NINE;
                break;

            case FOUR_KIND:
                value = EIGHT;
                break;

            case FULL_HOUSE:
                value = SEVEN;
                break;

            case FLUSH:
                value = SIX;
                break;

            case STRAIGHT:
                value = FIVE;
                break;

            case THREE_KIND:
                value = FOUR;
                break;

            case TWO_PAIRS:
                value = THREE;
                break;

            case PAIR:
                value = TWO;
                break;

            default:
                value = ONE;
                break;
        }
    }



    enum Rank {
        HIGH_CARD, PAIR, TWO_PAIRS, THREE_KIND, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_KIND, STRAIGHT_FLUSH;
    }
}
