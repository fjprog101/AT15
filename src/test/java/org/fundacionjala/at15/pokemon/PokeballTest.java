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
        Pokemon pikachu = new Pokemon(10, "pikachu");
        Pokeball ball = new Pokeball();
        pikachu.getHitPoints().setCurrentHitPoints(2);
        assertTrue(ball.catchPokemon(pikachu));
    }
}
