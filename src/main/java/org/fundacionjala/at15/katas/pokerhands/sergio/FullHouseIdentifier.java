package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class FullHouseIdentifier extends Identifier {
    private List<Integer> frequency = new ArrayList<>();
    private boolean isFullHouse = false;
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_3 = 3;


    public FullHouseIdentifier(FrequencyIdentifier newFrequency) {
        this.frequency = newFrequency.getFrequency();
        theIdentification();
    }

    public boolean isFullHouse() {
        return isFullHouse;
    }

    public void theIdentification() {
        boolean frequencyA = frequency.contains(NUMBER_3);
        boolean frequencyB = frequency.contains(2);
        if (frequencyA && frequencyB) {
            isFullHouse = true;
        }
    }
}
