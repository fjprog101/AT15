package org.fundacionjala.at15.katas.pokerhands.sergio;

public abstract class Identifier {
    protected int[] valuePokerHand = new int[NUMBER_5];
    protected String[] suitPokerHand;
    protected static final int NUMBER_5 = 5;
    protected static final int NUMBER_4 = 4;

    public abstract void theIdentification();

}
