package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class ThreesomeIdentifier extends Identifier {
    private List<Integer> frequency = new ArrayList<>();
    private boolean isThreesome = false;
    private static final int NUMBER_3 = 3;


    public ThreesomeIdentifier(FrequencyIdentifier newFrequency) {
        this.frequency = newFrequency.getFrequency();
        theIdentification();
    }

    public boolean isThreesome() {
        return isThreesome;
    }

    public void theIdentification() {
        if (frequency.contains(NUMBER_3)) {
            isThreesome = true;
        }
    }
}
