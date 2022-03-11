package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class ThreesomeIdentifier extends Identifier {
    private List<Card> pokerHand;
    private boolean isThreesome = false;
    private static final int NUMBER_3 = 3;

    public boolean isThreesome() {
        return isThreesome;
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        FrequencyIdentifier frequency = new FrequencyIdentifier();
        frequency.theIdentification(pokerHand);
        if (frequency.getFrequency().contains(NUMBER_3)) {
            isThreesome = true;
        }
    }
}
