package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.HitPoints.*;

public class HitPoints {
    private int maxHitPoints;
    private int currentHitPoints;

    public HitPoints(int maxHp) {
        this.maxHitPoints = maxHp;
        this.currentHitPoints = maxHitPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setMaxHitPoints(int maxHitP) {
        this.maxHitPoints = maxHitP;
    }

    public void setCurrentHitPoints(int currentHp) {
        this.currentHitPoints = currentHp;
    }

    public void fullRestore() {
        this.currentHitPoints = maxHitPoints;

    }


    public boolean is20Percent() {
        return currentHitPoints * PERCENTAGE / maxHitPoints <= TWENTY_PERCENTAGE;
    }

}
