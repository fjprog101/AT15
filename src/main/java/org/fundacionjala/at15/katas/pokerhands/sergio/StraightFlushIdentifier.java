package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class StraightFlushIdentifier extends Identifier {
    private List<Card> pokerHand;
    private StraightIdentifier straightIdentification;
    private FlushIdentifier flushIdentification;

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        this.straightIdentification = new StraightIdentifier();
        straightIdentification.theIdentification(pokerHand);
        this.flushIdentification = new FlushIdentifier();
        flushIdentification.theIdentification(pokerHand);
        if (flushIdentification.isFlush() && straightIdentification.isStraight()) {
            setStraightFlush(true);
        }
    }
}
