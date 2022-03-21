package org.fundacionjala.at15.katas.pokerhands.adhemar;

public enum Hand {
    NONE("It doesn't match", 0),
    HIGH("high card", 1),
    PAIR("pair", 2),
    TWO_PAIRS("two pairs", 3),
    THREE("three of a kind", 4),
    STRAIGHT("straight", 5),
    FLUSH("flush", 6),
    FULL("full house", 7),
    FOUR("four of a kind", 8),
    STRAIGHT_FLUSH("straight flush", 9);

    private final String handName;
    private final int rank;

    Hand(String handName, int rank) {
        this.handName = handName;
        this.rank = rank;
    }

    public String getHandName() {
        return this.handName;
    }

    public int getRank() {
        return this.rank;
    }
}
