package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.*;

public class StraightFlushIdentifier extends Identifier {
    private int[] valuePokerHand = new int[NUMBER_5];
    private String[] suitPokerHand;
    private boolean isFlush = false;
    private boolean isStraight = false;
    private boolean isStraightFlush = false;
    private static final int NUMBER_5 = 5;
    private static final int NUMBER_4 = 4;

    public StraightFlushIdentifier(Splitter pokerHandSplitted) {
        this.valuePokerHand = pokerHandSplitted.getValuePokerHand();
        this.suitPokerHand = pokerHandSplitted.getSuitPokerHand();
    }

    public boolean getIsStraightFlush() {
        return this.isStraightFlush;
    }

    public boolean getIsFlush() {
        return this.isFlush;
    }

    public boolean getIsStraight() {
        return isStraight;
    }

    public void theIdentification() {
        flushIdentifier();
        straightIdentifier();
        if (isFlush && isStraight) {
            isStraightFlush = true;
        }
    }

    public void flushIdentifier() {
        int equalIndicator = 0;
        for (int ind = 0; ind < suitPokerHand.length - 1; ind++) {
            if (suitPokerHand[0].equals(suitPokerHand[ind + 1])) {
                equalIndicator = equalIndicator + 1;
            }
        }
        if (equalIndicator == NUMBER_4) {
            isFlush = true;
        }
    }

    public void straightIdentifier() {
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
