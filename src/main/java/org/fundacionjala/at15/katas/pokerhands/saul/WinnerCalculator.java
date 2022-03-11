package org.fundacionjala.at15.katas.pokerhands.saul;

import java.util.*;

public class WinnerCalculator {

    public int highestCardWinner(PokerHand firstHand, PokerHand secondHand) {
        List<Card> blackHand = firstHand.getHand();
        List<Card> whiteHand = secondHand.getHand();
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
