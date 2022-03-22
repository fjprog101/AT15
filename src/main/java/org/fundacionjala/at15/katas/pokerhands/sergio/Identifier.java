package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public abstract class Identifier {
    protected static final int NUMBER_3 = 3;
    protected static final int NUMBER_4 = 4;
    protected static final int NUMBER_5 = 5;
    protected boolean isStraight = false;
    protected boolean isFlush = false;
    protected boolean isStraightFlush = false;
    protected boolean isPoker = false;
    protected boolean isFullHouse = false;
    protected boolean isThreesome = false;
    protected boolean isDoublePair = false;
    protected boolean isOnlyPair = false;
    protected boolean isSimpleHand = false;

    public abstract void theIdentification(List<Card> newPokerHand);

    public boolean isStraight() {
        return isStraight;
    }

    public void setStraight(boolean straight) {
        isStraight = straight;
    }

    public boolean isFlush() {
        return isFlush;
    }

    public void setFlush(boolean flush) {
        isFlush = flush;
    }

    public void setStraightFlush(boolean straightFlush) {
        isStraightFlush = straightFlush;
    }

    public boolean isStraightFlush() {
        return isStraightFlush;
    }

    public void setPoker(boolean poker) {
        isPoker = poker;
    }

    public boolean isPoker() {
        return isPoker;
    }

    public boolean isFullHouse() {
        return isFullHouse;
    }

    public void setFullHouse(boolean fullHouse) {
        isFullHouse = fullHouse;
    }

    public boolean isThreesome() {
        return isThreesome;
    }

    public void setThreesome(boolean threesome) {
        isThreesome = threesome;
    }

    public boolean isDoublePair() {
        return isDoublePair;
    }

    public void setDoublePair(boolean doublePair) {
        isDoublePair = doublePair;
    }

    public boolean isOnlyPair() {
        return isOnlyPair;
    }

    public void setOnlyPair(boolean onlyPair) {
        isOnlyPair = onlyPair;
    }

    public boolean isSimpleHand() {
        return isSimpleHand;
    }

    public void setSimpleHand(boolean simpleHand) {
        isSimpleHand = simpleHand;
    }
}
