package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class SimpleHandIdentifier extends Identifier {
    private List<Integer> frequency = new ArrayList<>();
    private boolean isSimpleHand = false;
    private StraightIdentifier straightIdentification;
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_3 = 3;


    public SimpleHandIdentifier(FrequencyIdentifier newFrequency) {
        this.frequency = newFrequency.getFrequency();
        this.straightIdentification = new StraightIdentifier(newFrequency.getPokerHand());
        theIdentification();
    }

    public boolean isSimpleHand() {
        return isSimpleHand;
    }

    public void theIdentification() {
        if (!frequency.contains(NUMBER_4) && !frequency.contains(NUMBER_3) && !frequency.contains(2) && !straightIdentification.isStraight()) {
            isSimpleHand = true;
        }
    }

}
