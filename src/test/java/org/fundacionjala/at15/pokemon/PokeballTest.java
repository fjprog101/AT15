package org.fundacionjala.at15.pokemon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PokeballTest {
    @Test
    public void itShouldHaveCost() {
        Pokeball ball = new Pokeball();
        assertEquals(20, ball.cost);
    }

    @Test
    public void itShouldCheckPokemonHP() {
        Pokemon pikachu = new Pokemon(10);
        pikachu.setCurrentHitPoints(2);
        Pokeball ball = new Pokeball();
        assertTrue(ball.catchPokemon(pikachu));
    }
}
