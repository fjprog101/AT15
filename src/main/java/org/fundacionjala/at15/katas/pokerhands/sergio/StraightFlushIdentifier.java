package org.fundacionjala.at15.katas.pokerhands.sergio;

public class StraightFlushIdentifier extends Identifier {
    private boolean isStraightFlush = false;
    private StraightIdentifier straightIdentification;
    private FlushIdentifier flushIdentification;


    public StraightFlushIdentifier(StraightIdentifier straightIdentification, FlushIdentifier flushIdentification) {
        this.straightIdentification = straightIdentification;
        this.flushIdentification = flushIdentification;
        theIdentification();
    }

    public boolean isStraightFlush() {
        return isStraightFlush;
    }

    public void theIdentification() {
        if (flushIdentification.getIsFlush() && straightIdentification.isStraight()) {
            isStraightFlush = true;
        }
    }
}
