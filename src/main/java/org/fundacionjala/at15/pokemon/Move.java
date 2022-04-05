package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Tackle.*;

public class Move {
    protected int potency;
    protected String movement;

    public Move() {
        this.potency = TACKLE_POTENCY;
        this.movement = "basicAttack";
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency1) {
        this.potency = potency1;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement1) {
        this.movement = movement1;
    }
}
