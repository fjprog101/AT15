package pokemon;

import org.fundacionjala.at15.pokemon.pokemon.Pokemon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.pokemon.pokemon.moves.Move;
import org.fundacionjala.at15.pokemon.pokemon.moves.Tackle;
import org.junit.Test;

public class PokemonTest {
    @Test
    public void itShouldHaveMaxHP() {
        Pokemon pikachu = new Pokemon(200);
        assertEquals(200, pikachu.getMaxHealthPoints() );
    }

    @Test
    public void itShouldChangeCurrentHP() {
        Pokemon pikachu = new Pokemon(200);
        pikachu.setCurrentHealthPoints(150);
        assertEquals(50, pikachu.getCurrentHealthPoints());
    }

    @Test
    public void itShouldHaveMoves() {
        Pokemon pikachu = new Pokemon(200);
        Move tackle = new Tackle();
        pikachu.setMoveToList(tackle,1);

        assertEquals(tackle, pikachu.getMove(1));
    }

    @Test
    public void itShouldKnowIf20Percent() {
        Pokemon pikachu = new Pokemon(200);
        pikachu.setCurrentHealthPoints(160);

        assertTrue(pikachu.is20Percent());
    }


}
