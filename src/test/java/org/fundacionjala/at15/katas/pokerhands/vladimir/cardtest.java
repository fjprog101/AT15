package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class cardtest {
    @Test
    public void itShouldJoinValueAndSuit() {
        Card card = new Card("A", "C");
        String expectedUnion = "AC";
        assertEquals(expectedUnion, card.combination());
    }

    @Test
    public void itShouldGetValueAndSuit() {
        Card card = new Card("A", "C");
        int expectedValue = 14;
        String expectedSuit = "C";
        assertEquals(expectedValue, card.getValue());
        assertEquals(expectedSuit, card.getSuit());
    }
}
