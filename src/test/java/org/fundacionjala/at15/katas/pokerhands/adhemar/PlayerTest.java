package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
    @Test
    public void itShouldHaveAName() {
        String name = "Black";
        Player thePlayer = new Player(name);

        assertEquals(name, thePlayer.getName());
    }
}
