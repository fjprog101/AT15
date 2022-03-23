package org.fundacionjala.at15.katas.pokerhands.sergio;

public abstract class TieBreaker {
    protected Player player1;
    protected Player player2;
    protected String finalDecision;
    protected static final int NUMBER_3 = 3;
    protected static final int NUMBER_4 = 4;
    protected static final int NUMBER_5 = 5;

    public abstract void theTieBreak(Player newPlayer1, Player newPlayer2);

    public String getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(String newFinalDecision) {
        this.finalDecision = newFinalDecision;
    }
}
