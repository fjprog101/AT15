package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.DamageReceived.*;

public class DamageReceived {
    private double potency;
    private double currentHitPoints;
    private final double aument = 1.2;
    private final double reduce = 0.8;

    public DamageReceived(double potency) {
        this.potency = potency;
    }

    public void affectHP(Pokemon attackedPokemon, String attackingPokemonType) {
        if (attackingPokemonType.equals("Fire")) {
            fireType(attackedPokemon);
        } else if (attackingPokemonType.equals("Grass")) {
            grassType(attackedPokemon);
        } else if (attackingPokemonType.equals("Water")) {
            waterType(attackedPokemon);
        }
        currentHitPoints = attackedPokemon.getHitPoints().getCurrentHitPoints();
        if (currentHitPoints > potency) {
            currentHitPoints = currentHitPoints - potency;
            attackedPokemon.getHitPoints().setCurrentHitPoints(currentHitPoints);
        } else if (currentHitPoints > FAINT && currentHitPoints <= potency) {
            currentHitPoints = FAINT;
            attackedPokemon.getHitPoints().setCurrentHitPoints(currentHitPoints);
        }
    }

    public void fireType(Pokemon attackedPokemon) {
        if (attackedPokemon.getPokemonType().equals("Grass")) {
            potency = potency * aument;
        } else if (attackedPokemon.getPokemonType().equals("Water")) {
            potency = potency * reduce;
        }
    }

    public void grassType(Pokemon attackedPokemon) {
        if (attackedPokemon.getPokemonType().equals("Fire")) {
            potency = potency * reduce;
        } else if (attackedPokemon.getPokemonType().equals("Water")) {
            potency = potency * aument;
        }
    }

    public void waterType(Pokemon attackedPokemon) {
        if (attackedPokemon.getPokemonType().equals("Grass")) {
            potency = potency * reduce;
        } else if (attackedPokemon.getPokemonType().equals("Fire")) {
            potency = potency * aument;
        }
    }
}