package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.fundacionjala.at15.katas.pokerhands.saul.RankValues.*;

import java.util.ArrayList;
import java.util.List;

public class HandTypeVerifier {
    public static boolean isPair(List<Card> hand) {
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

    public static boolean isTwoPairs(List<Card> hand) {
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

    public static boolean isThreeKind(List<Card> hand) {
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

    public static boolean isStraight(List<Card> hand) {
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

    public static boolean isFlush(List<Card> hand) {
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

    public static boolean isFullHouse(List<Card> hand) {
        boolean isFullHouse = false;
        List<Card> firstList = new ArrayList<Card>();
        List<Card> secondList = new ArrayList<Card>();

        for (Card card : hand) {
            if (firstList.isEmpty() && secondList.isEmpty()) {
                firstList.add(card);
            } else {
                if (!firstList.isEmpty()) {
                    if (card.compareTo(firstList.get(firstList.size() - 1)) == 0) {
                        firstList.add(card);
                        continue;
                    }
                }

                if (secondList.isEmpty()) {
                    secondList.add(card);
                } else {
                    if (card.compareTo(secondList.get(secondList.size() - 1)) == 0) {
                        secondList.add(card);
                    }
                }
            }
        }

        if (firstList.size() == THREE && secondList.size() == TWO) {
            isFullHouse = true;
        } else {
            if (firstList.size() == TWO && secondList.size() == THREE) {
                isFullHouse = true;
            }
        }

        return isFullHouse;
    }

    public static boolean isFourKind(List<Card> hand) {
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

    public static boolean isStraightFlush(List<Card> hand) {
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
}
