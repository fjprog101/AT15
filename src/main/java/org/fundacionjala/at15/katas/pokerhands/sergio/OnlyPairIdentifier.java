package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class OnlyPairIdentifier extends Identifier {
    private List<Integer> frequency = new ArrayList<>();
    private boolean isOnlyPair = false;
    private DoublePairIdentifier doublePairIdentification;


    public OnlyPairIdentifier(FrequencyIdentifier newFrequency) {
        this.frequency = newFrequency.getFrequency();
        this.doublePairIdentification = new DoublePairIdentifier(newFrequency);
        theIdentification();
    }

    public boolean isOnlyPair() {
        return isOnlyPair;
    }

    public void theIdentification() {
        boolean onePair = frequency.contains(2);

        if (onePair && !doublePairIdentification.isDoublePair()) {
            isOnlyPair = true;
        }
    }
}
