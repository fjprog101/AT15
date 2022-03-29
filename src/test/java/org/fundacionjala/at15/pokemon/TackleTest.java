package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TackleTest {
    @Test
    public void itShouldHavePotency() {
        Move tackle = new Move();

        assertEquals(40, tackle.getPotency());
    }
}
