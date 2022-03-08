package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondCardTest {
    @Test
    public void itShouldHaveAValue() {
        DiamondCard diamondCard = new DiamondCard('6');
        assertEquals('6', diamondCard.getValue());
    }

    @Test
    public void itShouldHaveASuit() {
        DiamondCard diamondCard = new DiamondCard('2');
        assertEquals('D', diamondCard.getSuit());
    }

}
