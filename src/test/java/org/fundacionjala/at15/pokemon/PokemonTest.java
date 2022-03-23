package org.fundacionjala.at15.pokemon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PokemonTest {

    @Test
    public void itShouldHaveMoves() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");
        Move tackle = new Tackle();
        genericPokemon.setMoveToList(tackle,1);

        assertEquals(tackle, genericPokemon.getMove(1));
    }

    @Test
    public void itShouldHaveName() {
        Pokemon genericPokemon = new Pokemon(200, "pikachu");

        assertEquals("pikachu", genericPokemon.getPokemonName());
    }
}
