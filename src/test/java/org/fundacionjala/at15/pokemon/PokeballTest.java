package org.fundacionjala.at15.pokemon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;

public class PokeballTest {
    @Test
    public void itShouldHaveCost() {
        Pokeball ball = new Pokeball();
        assertEquals(20, ball.cost);
    }

    @Test
    public void itShouldCheckPokemonHP() throws IncompleteArguments {
        Pokemon pikachu = new Pokemon(10, "pikachu");
        Pokeball ball = new Pokeball();
        pikachu.getHitPoints().setCurrentHitPoints(2);
        assertTrue(ball.catchPokemon(pikachu));
    }
}
