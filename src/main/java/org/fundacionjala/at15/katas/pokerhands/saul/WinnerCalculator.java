package org.fundacionjala.at15.katas.pokerhands.saul;

import java.util.*;

public class WinnerCalculator {

    public int getWinner(Hand firstHand, Hand secondHand) {
        int result = 0;
        if (firstHand.compareTo(secondHand) < 0) {
            result = 1;
        } else if (firstHand.compareTo(secondHand) > 0) {
            result = -1;
        } else {
            result = getWinner(firstHand, secondHand, firstHand.getHandRank());
        }
        return result;
    }

    private int getWinner(Hand firstHand, Hand secondHand, HandRank rank) {
        int result = 0;
        switch (rank.getRank()) {
            case HIGH_CARD:
                result = highestCardWinner(firstHand, secondHand);
                break;

            default:
                break;
        }
        return result;
    }

    public int highestCardWinner(Hand firstHand, Hand secondHand) {
        List<Card> blackHand = firstHand.getCards();
        List<Card> whiteHand = secondHand.getCards();
        Collections.reverse(blackHand);
        Collections.reverse(whiteHand);
        int result = 0;

        for (int index = 0; index < blackHand.size(); index++) {
            if (blackHand.get(index).compareTo(whiteHand.get(index)) < 0) {
                result = 1;
                break;
            } else if (blackHand.get(index).compareTo(whiteHand.get(index)) > 0) {
                result = -1;
                break;
            }
        }

        return result;
    }
}
