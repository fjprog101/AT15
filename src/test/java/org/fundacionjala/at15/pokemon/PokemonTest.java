package org.fundacionjala.at15.pokemon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PokemonTest {
    @Test
    public void itShouldHaveMaxHP() {
        Pokemon pikachu = new Pokemon(200);
        assertEquals(200, pikachu.getMaxHitPoints() );
    }

    @Test
    public void itShouldChangeCurrentHP() {
        Pokemon pikachu = new Pokemon(200);
        pikachu.setCurrentHitPoints(150);
        assertEquals(150, pikachu.getCurrentHitPoints());
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
        Pokemon pikachu = new Pokemon(10);
        pikachu.setCurrentHitPoints(2);

        assertTrue(pikachu.is20Percent());
    }

    @Test
    public void itShouldHealHP() {
        Pokemon pikachu = new Pokemon(10);
        pikachu.setCurrentHitPoints(2);
        pikachu.heal();

        assertEquals(10, pikachu.getCurrentHitPoints());
    }


}