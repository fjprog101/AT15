package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class PokerIdentifier extends Identifier {
    private List<Card> pokerHand;
    private boolean isPoker = false;
    private static final int NUMBER_4 = 4;

    public boolean isPoker() {
        return isPoker;
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        FrequencyIdentifier frequency = new FrequencyIdentifier();
        frequency.theIdentification(pokerHand);
        if (frequency.getFrequency().contains(NUMBER_4)) {
            isPoker = true;
        }
    }
}
