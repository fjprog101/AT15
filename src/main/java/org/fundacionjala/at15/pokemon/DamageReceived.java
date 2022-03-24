package org.fundacionjala.at15.pokemon;

public class DamageReceived implements HPAffecter {
    private int potency;
    private int currentHitPoints;
    private final int faint = 0;

    public DamageReceived(int potency) {
        this.potency = potency;
    }

    public void affectHP(Pokemon pokemon) {
        currentHitPoints = pokemon.getHitPoints().getCurrentHitPoints();
        if (currentHitPoints > potency) {
            currentHitPoints = currentHitPoints - potency;
            pokemon.getHitPoints().setCurrentHitPoints(currentHitPoints);
        } else if (currentHitPoints > faint && currentHitPoints <= potency) {
            currentHitPoints = faint;
            pokemon.getHitPoints().setCurrentHitPoints(currentHitPoints);
        }
    }
}