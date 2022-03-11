package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class DoublePairIdentifier extends Identifier {
    private List<Integer> frequency = new ArrayList<>();
    private boolean isDoublePair = false;
    private static final int NUMBER_3 = 3;
    private boolean onePair = false;


    public DoublePairIdentifier(FrequencyIdentifier newFrequency) {
        this.frequency = newFrequency.getFrequency();
        theIdentification();
    }

    public boolean isDoublePair() {
        return isDoublePair;
    }

    public void theIdentification() {
        if (frequency.contains(2)) {
            onePair = true;
        }
        int counter = 0;
        if (onePair) {
            for (int ind = 0; ind < frequency.size(); ind++) {
                for (int ind2 = ind + 1; ind2 < frequency.size(); ind2++) {
                    if (frequency.get(ind) == frequency.get(ind2)) {
                        counter++;
                    }
                }
            }
        }
        if (counter == 1) {
            isDoublePair = true;
        }
    }
}
