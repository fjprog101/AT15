package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeartCardTest {
    @Test
    public void itShouldHaveAValue() {
        HeartCard heartCard = new HeartCard('6');
        assertEquals('6', heartCard.getValue());
    }

    @Test
    public void itShouldHaveASuit() {
        HeartCard heartCard = new HeartCard('2');
        assertEquals('H', heartCard.getSuit());
    }
}
