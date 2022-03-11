package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class SimpleHandIdentifier extends Identifier {
    private List<Card> pokerHand;
    private boolean isSimpleHand = false;
    private StraightIdentifier straightIdentification;
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_3 = 3;

    public boolean isSimpleHand() {
        return isSimpleHand;
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        FrequencyIdentifier frequency = new FrequencyIdentifier();
        frequency.theIdentification(pokerHand);
        this.straightIdentification = new StraightIdentifier();
        straightIdentification.theIdentification(pokerHand);
        if (!frequency.getFrequency().contains(NUMBER_4) && !frequency.getFrequency().contains(NUMBER_3)
                && !frequency.getFrequency().contains(2) && !straightIdentification.isStraight()) {
            isSimpleHand = true;
        }
    }

}
