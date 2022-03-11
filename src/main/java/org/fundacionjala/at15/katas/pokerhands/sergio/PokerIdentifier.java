package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class PokerIdentifier extends Identifier {
    private List<Integer> frequency = new ArrayList<>();
    private boolean isPoker = false;
    private static final int NUMBER_4 = 4;

    public PokerIdentifier(FrequencyIdentifier newFrequency) {
        this.frequency = newFrequency.getFrequency();
        theIdentification();
    }

    public boolean isPoker() {
        return isPoker;
    }

    public void theIdentification() {
        if (frequency.contains(NUMBER_4)) {
            isPoker = true;
        }
    }
}
