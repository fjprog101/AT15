package org.fundacionjala.at15.katas.pokemon;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.gonzalo.MakeMoves;
import org.junit.Test;

public class MakeMovesTest {
    @Test
    public void itShouldBeHitPoints() {
        int hitPoints = 100;
        MakeMoves moves = new MakeMoves(hitPoints);
        assertEquals(hitPoints, moves.getHitPoints());
    }
    
}
