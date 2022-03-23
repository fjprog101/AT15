package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class DoublePairIdentifier extends Identifier {
    private List<Card> pokerHand;
    private boolean onePair = false;

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        FrequencyIdentifier frequency = new FrequencyIdentifier();
        frequency.theIdentification(pokerHand);
        if (frequency.getFrequency().contains(2)) {
            onePair = true;
        }
        int counter = 0;
        if (onePair) {
            for (int ind = 0; ind < frequency.getFrequency().size(); ind++) {
                for (int ind2 = ind + 1; ind2 < frequency.getFrequency().size(); ind2++) {
                    if (frequency.getFrequency().get(ind) == frequency.getFrequency().get(ind2)) {
                        counter++;
                    }
                }
            }
        }
        if (counter == 1) {
            setDoublePair(true);
        }
    }
}
