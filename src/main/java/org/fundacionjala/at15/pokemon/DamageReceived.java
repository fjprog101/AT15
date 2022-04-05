package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.DamageReceived.*;

public class DamageReceived implements HPAffecter {
    private int potency;
    private int currentHitPoints;

    public DamageReceived(int potency) {
        this.potency = potency;
    }

    public void affectHP(Pokemon pokemon) {
        currentHitPoints = pokemon.getHitPoints().getCurrentHitPoints();
        if (currentHitPoints > potency) {
            currentHitPoints = currentHitPoints - potency;
            pokemon.getHitPoints().setCurrentHitPoints(currentHitPoints);
        } else if (currentHitPoints > FAINT && currentHitPoints <= potency) {
            currentHitPoints = FAINT;
            pokemon.getHitPoints().setCurrentHitPoints(currentHitPoints);
        }
    }
}