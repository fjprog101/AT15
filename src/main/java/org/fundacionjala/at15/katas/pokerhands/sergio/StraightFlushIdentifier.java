package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class StraightFlushIdentifier extends Identifier {
    private boolean isStraightFlush = false;
    private List<Card> pokerHand;
    private StraightIdentifier straightIdentification;
    private FlushIdentifier flushIdentification;


    public boolean isStraightFlush() {
        return isStraightFlush;
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        this.straightIdentification = new StraightIdentifier();
        straightIdentification.theIdentification(pokerHand);
        this.flushIdentification = new FlushIdentifier();
        flushIdentification.theIdentification(pokerHand);
        if (flushIdentification.getIsFlush() && straightIdentification.isStraight()) {
            isStraightFlush = true;
        }
    }
}
