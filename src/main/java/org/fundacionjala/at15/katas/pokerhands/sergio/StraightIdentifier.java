package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StraightIdentifier extends Identifier {
    private List<Card> pokerHand = new ArrayList<>();
    private int[] valuePokerHand = new int[NUMBER_5];

    private void arrayFill() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            valuePokerHand[ind] = pokerHand.get(ind).getValue();
        }
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        arrayFill();
        int straightIndicator = 0;
        Arrays.sort(valuePokerHand);
        for (int ind = 0; ind < this.valuePokerHand.length - 1; ind++) {
            if ((valuePokerHand[ind] + 1) == valuePokerHand[ind + 1]) {
                straightIndicator = straightIndicator + 1;
            }
        }
        if (straightIndicator == NUMBER_4) {
            setStraight(true);
        }

    }
}
