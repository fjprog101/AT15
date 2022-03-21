package org.fundacionjala.at15.pokemon;

public class DamageReceived {
    private int currentHitPoints;
    private int potency;
    private final int faint = 0;
    private static final double TWENTY_PERCENT = 0.20;
    private double twentyPercentMaxHitPoints;
    private boolean is20Percent = false;

    public DamageReceived(int maxHitPoints, int potency) {
        this.currentHitPoints = maxHitPoints;
        this.potency = potency;
    }

    public int getHp() {
        if (currentHitPoints > faint && currentHitPoints > potency) {
            currentHitPoints = currentHitPoints - potency;
        } else if (currentHitPoints > faint && currentHitPoints < potency) {
            currentHitPoints = faint;
        }
        return currentHitPoints;
    }

    public void twentyPercentMaxHitPoints(int maxHitPoints) {
        twentyPercentMaxHitPoints = maxHitPoints * TWENTY_PERCENT;
    }

    public boolean twentyPercentCheck() {
        if (currentHitPoints <= twentyPercentMaxHitPoints) {
            is20Percent = true;
        }
        return is20Percent;
    }
}
