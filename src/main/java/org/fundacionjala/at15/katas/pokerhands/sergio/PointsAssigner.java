package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.List;

public class PointsAssigner {
    private List<Card> pokerHand;
    private Identifier straight;
    private Identifier flush;
    private Identifier straightFlush;
    private Identifier poker;
    private Identifier fullHouse;
    private Identifier threesome;
    private Identifier doublePair;
    private Identifier onlyPair;
    private Identifier simpleHand;
    private static final int HAND_POINTS_100 = 100;
    private static final int HAND_POINTS_90 = 90;
    private static final int HAND_POINTS_80 = 80;
    private static final int HAND_POINTS_70 = 70;
    private static final int HAND_POINTS_60 = 60;
    private static final int HAND_POINTS_50 = 50;
    private static final int HAND_POINTS_40 = 40;
    private static final int HAND_POINTS_30 = 30;
    private static final int HAND_POINTS_20 = 20;
    private int handPoints = 0;

    public PointsAssigner(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        this.straight = new StraightIdentifier();
        straight.theIdentification(pokerHand);
        this.flush = new FlushIdentifier();
        flush.theIdentification(pokerHand);
        this.straightFlush = new StraightFlushIdentifier();
        straightFlush.theIdentification(pokerHand);
        this.poker = new PokerIdentifier();
        poker.theIdentification(pokerHand);
        this.fullHouse = new FullHouseIdentifier();
        fullHouse.theIdentification(pokerHand);
        this.threesome = new ThreesomeIdentifier();
        threesome.theIdentification(pokerHand);
        this.doublePair = new DoublePairIdentifier();
        doublePair.theIdentification(pokerHand);
        this.onlyPair = new OnlyPairIdentifier();
        onlyPair.theIdentification(pokerHand);
        this.simpleHand = new SimpleHandIdentifier();
        simpleHand.theIdentification(pokerHand);
        theAssignment();
    }

    public void theAssignment() {
        if (straightFlush.isStraightFlush()) {
            this.handPoints = HAND_POINTS_100;
        } else if (poker.isPoker()) {
            this.handPoints = HAND_POINTS_90;
        } else if (fullHouse.isFullHouse()) {
            this.handPoints = HAND_POINTS_80;
        } else if (flush.isFlush()) {
            this.handPoints = HAND_POINTS_70;
        } else if (straight.isStraight()) {
            this.handPoints = HAND_POINTS_60;
        } else if (threesome.isThreesome()) {
            this.handPoints = HAND_POINTS_50;
        } else if (doublePair.isDoublePair()) {
            this.handPoints = HAND_POINTS_40;
        } else if (onlyPair.isOnlyPair()) {
            this.handPoints = HAND_POINTS_30;
        } else if (simpleHand.isSimpleHand()) {
            this.handPoints = HAND_POINTS_20;
        }
    }

    public int getHandPoints() {
        return handPoints;
    }
}
