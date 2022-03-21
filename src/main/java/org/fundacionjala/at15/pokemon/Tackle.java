package org.fundacionjala.at15.pokemon;

public class Tackle extends Move {
    //private static final int TACKLE_PP = 35; for later
    private static final int TACKLE_POTENCY = 40;

    public Tackle() {
//        this.maxPowerPoints = TACKLE_PP; for later
        this.potency = TACKLE_POTENCY;
//        this.currentPowerPoints = maxPowerPoints; for later
    }

}
