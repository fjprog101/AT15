package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HealingPotionTest {

    @Test
    public void itShouldGetTheCostOfAHealPotion() {
        HealingPotion potion1 = new HealingPotion();
        assertEquals(40, potion1.getCost());
    }

    @Test
    public void itShouldRestoreHitPointOfAPokemon() {
        Pokemon pikachu = new Pokemon(200);
        pikachu.getHitPoints().setCurrentHitPoints(10);
        pikachu.getHitPoints().fullRestore();
        assertEquals(200, pikachu.getHitPoints().getCurrentHitPoints());

    }

}
