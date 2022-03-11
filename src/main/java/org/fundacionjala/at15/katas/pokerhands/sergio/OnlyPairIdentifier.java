package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class OnlyPairIdentifier extends Identifier {
    private List<Card> pokerHand;
    private boolean isOnlyPair = false;
    private DoublePairIdentifier doublePairIdentification;


    public boolean isOnlyPair() {
        return isOnlyPair;
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        this.doublePairIdentification = new DoublePairIdentifier();
        doublePairIdentification.theIdentification(pokerHand);
        FrequencyIdentifier frequency = new FrequencyIdentifier();
        frequency.theIdentification(pokerHand);
        boolean onePair = frequency.getFrequency().contains(2);

        if (onePair && !doublePairIdentification.isDoublePair()) {
            isOnlyPair = true;
        }
    }
}
