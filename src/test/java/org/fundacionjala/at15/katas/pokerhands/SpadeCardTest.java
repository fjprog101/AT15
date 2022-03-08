package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpadeCardTest {
    @Test
    public void itShouldHaveAValue() {
        SpadeCard spadeCard = new SpadeCard('6');
        assertEquals('6', spadeCard.getValue());
    }

    @Test
    public void itShouldHaveASuit() {
        SpadeCard spadeCard = new SpadeCard('2');
        assertEquals('S', spadeCard.getSuit());
    }
}
