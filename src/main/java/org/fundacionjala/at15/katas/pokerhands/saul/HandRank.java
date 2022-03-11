package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.fundacionjala.at15.katas.pokerhands.saul.Constants.*;

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

    public boolean isPair(List<Card> hand) {
        boolean isPair = false;

        for (int index = 0; index < hand.size(); index++) {
            int next = index + 1;
            if (next < hand.size()) {
                if (hand.get(index).compareTo(hand.get(next)) == 0) {
                    isPair = true;
                    break;
                }
            }
        }
        return isPair;
    }

    public boolean isTwoPairs(List<Card> hand) {
        boolean isTwoPairs = false;
        int counter = 0;
        for (int index = 0; index < hand.size(); index++) {
            int next = index + 1;
            if (next < hand.size()) {
                if (hand.get(index).compareTo(hand.get(next)) == 0) {
                    counter += 1;
                    index += 1;
                    if (counter == 2) {
                        isTwoPairs = true;
                        break;
                    }
                }
            }
        }

        return isTwoPairs;
    }

    public boolean isThreeKind(List<Card> hand) {
        boolean isThreeKind = false;
        int counter = 0;

        for (int index = 0; index < hand.size(); index++) {
            int next = index + 1;
            if (next < hand.size()) {
                if (hand.get(index).compareTo(hand.get(next)) == 0) {
                    counter += 1;

                    if (counter == 2) {
                        isThreeKind = true;
                        break;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return isThreeKind;
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
