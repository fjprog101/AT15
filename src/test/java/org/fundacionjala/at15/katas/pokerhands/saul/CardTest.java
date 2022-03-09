package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

    @Test
    public void itShouldHaveAValue() {
        Card card = new ClubCard('2');
        assertEquals('2', card.getValue());
    }

    @Test
    public void itShouldHaveASuit() {
        Card card = new ClubCard('5');
        assertEquals('C', card.getSuit());
    }
}
