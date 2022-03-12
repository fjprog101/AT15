package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
    @Test
    public void itShouldHaveAName() {
        String[] stringHand = {"2H", "KD", "JS", "QC", "AD"};
        String name = "Black";
        Player thePlayer = new Player(name, stringHand);

        assertEquals(name, thePlayer.getName());
    }

    @Test
    public void itShouldHaveAHand() {
        String[] stringHand = {"2H", "KD", "JS", "QC", "AD"};
        String name = "Black";
        Player thePlayer = new Player(name, stringHand);

        assertEquals("high card", thePlayer.getPokerHand().getHand().getHandName());
    }
}
