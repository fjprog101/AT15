package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Tackle.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Move {
    protected int potency;
    protected String movement;

    public Move() {
        this.potency = TACKLE_POTENCY;
        this.movement = "basicAttack";
    }

    @XmlElement
    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency1) {
        this.potency = potency1;
    }

    @XmlElement
    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement1) {
        this.movement = movement1;
    }
}
