package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

    @Test
    public void itShouldHaveAValue() {
        Card card = new Card(2, 'C');
        assertEquals(2, card.getValue());
    }

    @Test
    public void itShouldHaveASuit() {
        Card card = new Card(5, 'S');
        assertEquals('S', card.getSuit());
    }
}
