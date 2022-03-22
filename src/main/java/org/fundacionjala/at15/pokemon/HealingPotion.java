package org.fundacionjala.at15.pokemon;

public class HealingPotion extends Item implements HPAffecter{
    public static final int POTION_COST = 40;

    public HealingPotion() {

        this.setCost(POTION_COST);
    }

    public void affectHP(Pokemon pokemon) {

        pokemon.getHitPoints();

        pokemon.hitPoints.fullRestore();
    }
}
