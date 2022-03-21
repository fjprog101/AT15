package org.fundacionjala.at15.pokemon;

public class DamageReceived {
    private int currentHitPoints;
    private int potency;
    private final int faint = 0;

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
}
