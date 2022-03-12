package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class FullHouseIdentifier extends Identifier {
    private List<Card> pokerHand;

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        FrequencyIdentifier frequency = new FrequencyIdentifier();
        frequency.theIdentification(pokerHand);
        boolean frequencyA = frequency.getFrequency().contains(NUMBER_3);
        boolean frequencyB = frequency.getFrequency().contains(2);
        if (frequencyA && frequencyB) {
            setFullHouse(true);
        }
    }
}
