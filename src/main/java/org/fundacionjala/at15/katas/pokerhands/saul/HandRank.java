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
        if (isStraightFlush(hand)) {
            rank = Rank.STRAIGHT_FLUSH;
        } else if (isFourKind(hand)) {
            rank = Rank.FOUR_KIND;
        } else if (isFullHouse(hand)) {
            rank = Rank.FULL_HOUSE;
        } else if (isFlush(hand)) {
            rank = Rank.FLUSH;
        } else if (isStraight(hand)) {
            rank = Rank.STRAIGHT;
        } else if (isThreeKind(hand)) {
            rank = Rank.THREE_KIND;
        } else if (isTwoPairs(hand)) {
            rank = Rank.TWO_PAIRS;
        } else if (isPair(hand)) {
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

                    if (counter == TWO) {
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

    public boolean isStraight(List<Card> hand) {
        boolean isStraight = false;
        int counter = 0;

        for (int index = 0; index < hand.size(); index++) {
            int next = index + 1;
            if (next < hand.size()) {
                if (hand.get(index).getValue() - hand.get(next).getValue() == -1) {
                    counter += 1;
                    if (counter == FOUR) {
                        isStraight = true;
                    }
                } else {
                    break;
                }
            }
        }

        return isStraight;
    }

    public boolean isFlush(List<Card> hand) {
        boolean isFlush = false;
        int counter = 0;

        for (int index = 0; index < hand.size(); index++) {
            int next = index + 1;
            if (next < hand.size()) {
                if (hand.get(index).getSuit() == hand.get(next).getSuit()) {
                    counter += 1;
                    if (counter == FOUR) {
                        isFlush = true;
                    }
                } else {
                    break;
                }
            }
        }

        return isFlush;
    }

    public boolean isFullHouse(List<Card> hand) {
        boolean isFullHouse = false;

        if (isPair(hand) && isThreeKind(hand)) {
            isFullHouse = true;
        }

        return isFullHouse;
    }

    public boolean isFourKind(List<Card> hand) {
        boolean isFourKind = false;
        int counter = 0;

        for (int index = 0; index < hand.size(); index++) {
            int next = index + 1;
            if (next < hand.size()) {
                if (hand.get(index).compareTo(hand.get(next)) == 0) {
                    counter += 1;

                    if (counter == THREE) {
                        isFourKind = true;
                        break;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return isFourKind;
    }

    public boolean isStraightFlush(List<Card> hand) {
        boolean isStraightFlush = false;

        if (isStraight(hand)) {
            isStraightFlush = true;
            char suit = hand.get(0).getSuit();
            for (Card card : hand) {
                if (card.getSuit() != suit) {
                    isStraightFlush = false;
                    break;
                }
            }
        }

        return isStraightFlush;
    }

    enum Rank {
        HIGH_CARD, PAIR, TWO_PAIRS, THREE_KIND, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_KIND, STRAIGHT_FLUSH;
    }
}
