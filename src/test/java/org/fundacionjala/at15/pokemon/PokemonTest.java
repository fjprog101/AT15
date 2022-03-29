package org.fundacionjala.at15.pokemon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PokemonTest {

    @Test
    public void itShouldHaveMoves() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move tackle = new Tackle();
        genericPokemon.setMoveToList(0, tackle);

        assertEquals(tackle, genericPokemon.getMove(0));
    }

    @Test
    public void itShouldHaveName() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");

        assertEquals("pikachu", genericPokemon.getPokemonName());
    }

    @Test
    public void itShouldHaveOnlyFourMoves() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move move = new Tackle();
        genericPokemon.setMoveToList(1, move);
        genericPokemon.setMoveToList(2, move);
        genericPokemon.setMoveToList(3, move);
        assertEquals(4, genericPokemon.getMovementList().size());
    }
}
