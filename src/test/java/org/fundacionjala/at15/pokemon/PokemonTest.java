package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.junit.Test;

public class PokemonTest {

    @Test
    public void itShouldHaveMoves() throws IncompleteArguments {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move tackle = new Move();
        genericPokemon.setMoveToList(tackle);

        assertEquals(tackle, genericPokemon.getMove(1));
    }

    @Test
    public void itShouldHaveName() throws IncompleteArguments {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");

        assertEquals("pikachu", genericPokemon.getPokemonName());
    }

    @Test
    public void itShouldHaveOnlyFourMoves() throws IncompleteArguments {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move move = new Move();
        genericPokemon.setMoveToList(move);
        genericPokemon.setMoveToList(move);
        genericPokemon.setMoveToList(move);
        genericPokemon.setMoveToList(move);
        assertEquals(4, genericPokemon.getMovementList().size());
    }

    @Test
    public void itShouldVerifiesIfHasAGivenAttack() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(200, "pikachu");
        Move move = new Move();
        move.setMovement("thunder");
        pokemon.setMoveToList(move);

        assertTrue(pokemon.getMove("thunder") instanceof Move);
        assertNotNull(pokemon.getMove("thunder"));

        move.setMovement("agility");
        pokemon.setMoveToList(move);
        assertTrue(pokemon.getMove("agility") instanceof Move);

        assertNull(pokemon.getMove("thunder"));
    }
}
