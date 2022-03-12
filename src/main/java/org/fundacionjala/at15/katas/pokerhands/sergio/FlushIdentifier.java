package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;


public class FlushIdentifier extends Identifier {
    //private boolean isFlush = false;
    private List<Card> pokerHand = new ArrayList<>();

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        int equalIndicator = 0;
        for (int ind = 0; ind < pokerHand.size() - 1; ind++) {
            if (pokerHand.get(0).getSuit().equals(pokerHand.get(ind + 1).getSuit())) {
                equalIndicator = equalIndicator + 1;
            }
        }
        if (equalIndicator == NUMBER_4) {
            setFlush(true);
        }
    }
}