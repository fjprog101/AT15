package org.fundacionjala.at15.pokemon;

public class HitPoints {
    private int maxHitPoints;
    private int currentHitPoints;

    private static final int PERCENTAGE = 100;
    private static final int TWENTY_PERCENTAGE = 20;

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

    public void reduce(int attack) {

    }

    public boolean is20Percent() {
        return currentHitPoints * PERCENTAGE / maxHitPoints <= TWENTY_PERCENTAGE;
    }

}
