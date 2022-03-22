package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrainerTest {
    @Test
    public void itShouldReturnCurrentPokemon() {
        Pokemon pokemon = new Pokemon(100);
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon expectedPokemon = new Pokemon(100);
        int actual = trainer.currentPokemon(0).getMaxHitPoints();
        int expected = expectedPokemon.getMaxHitPoints();
        assertEquals(expected, actual);
    }
}
