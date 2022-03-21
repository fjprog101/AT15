package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandFunctionsTest {
    @Test
    public void itShouldSortCards() {
        Card[] cards = {
            new Card("4", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        new HandFunctions();
        assertEquals(3, HandFunctions.sort(cards)[0].getIntValue());
        assertEquals(4, HandFunctions.sort(cards)[1].getIntValue());
        assertEquals(5, HandFunctions.sort(cards)[2].getIntValue());
        assertEquals(13, HandFunctions.sort(cards)[3].getIntValue());
        assertEquals(14, HandFunctions.sort(cards)[4].getIntValue());
    }

    @Test
    public void itShouldCalculateAHighestCard() {
        Card[] cards = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("6", "H"),
            new Card("Q", "D")
        };

        assertEquals(14, HandFunctions.calculateTheHighestCard(cards).getIntValue());
        assertEquals("A", HandFunctions.calculateTheHighestCard(cards).getStringValue());
        assertEquals("D", HandFunctions.calculateTheHighestCard(cards).getSuit());
    }
}
