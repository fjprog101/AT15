package org.fundacionjala.at15.pokemon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PokemonTest {

    @Test
    public void itShouldHaveMoves() {
        Pokemon pikachu = new Pokemon(200);
        Move tackle = new Tackle();
        pikachu.setMoveToList(tackle,1);

        assertEquals(tackle, pikachu.getMove(1));
    }
}
