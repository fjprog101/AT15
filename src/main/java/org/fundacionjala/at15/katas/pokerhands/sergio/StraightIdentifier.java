package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StraightIdentifier extends Identifier {
    private boolean isStraight = false;
    private List<Card> pokerHand = new ArrayList<>();
    private int[] valuePokerHand = new int[NUMBER_5];
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_5 = 5;

    public StraightIdentifier(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        theIdentification();
    }

    public boolean isStraight() {
        return isStraight;
    }

    private void arrayFill() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            valuePokerHand[ind] = pokerHand.get(ind).getValue();
        }
    }

    public void theIdentification() {
        arrayFill();
        int straightIndicator = 0;
        Arrays.sort(valuePokerHand);
        for (int ind = 0; ind < this.valuePokerHand.length - 1; ind++) {
            if ((valuePokerHand[ind] + 1) == valuePokerHand[ind + 1]) {
                straightIndicator = straightIndicator + 1;
            }
        }
        if (straightIndicator == NUMBER_4) {
            isStraight = true;
        }

    }
}
