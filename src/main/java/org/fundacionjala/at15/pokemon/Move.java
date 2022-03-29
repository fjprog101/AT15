package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Tackle.*;

public class Move {
    protected int potency;

    public Move() {
        this.potency = TACKLE_POTENCY;
    }

    public int getPotency() {
        return potency;
    }
}


