package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CenterTest {
    @Test
    public void itShouldFullRestoreHP() {
        Pokemon pokemon = new Pokemon(1000, "pokemon");
        pokemon.getHitPoints().setCurrentHitPoints(0);
        pokemon.getHitPoints().fullRestore();
        assertEquals(1000, pokemon.getHitPoints().getCurrentHitPoints());
    }
}