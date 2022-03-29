package org.fundacionjala.at15.pokemon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PokemonTest {

    @Test
    public void itShouldHaveMoves() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move tackle = new Move();
        genericPokemon.setMoveToList(tackle);

        assertEquals(tackle, genericPokemon.getMove(1));
    }

    @Test
    public void itShouldHaveName() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");

        assertEquals("pikachu", genericPokemon.getPokemonName());
    }

    @Test
    public void itShouldHaveOnlyFourMoves() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move move = new Move();
        genericPokemon.setMoveToList(move);
        genericPokemon.setMoveToList(move);
        genericPokemon.setMoveToList(move);
        genericPokemon.setMoveToList(move);
        assertEquals(4, genericPokemon.getMovementList().size());
    }
}
