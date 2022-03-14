package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Cardtest {
    @Test
    public void itShouldJoinValueAndSuit() {
        Card card = new Card("A", "C");
        String expectedUnion = "AC";
        assertEquals(expectedUnion, card.combination());
    }

    @Test
    public void itShouldGetValueAndSuit() {
        Card card = new Card("Q", "C");
        int expectedValue = 12;
        String expectedSuit = "C";
        assertEquals(expectedValue, card.getValue());
        assertEquals(expectedSuit, card.getSuit());
    }
}
