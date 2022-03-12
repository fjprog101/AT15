package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValueHandStraightTest {
    @Test
    public void itShouldBeStraight() {
        String[] hand = {"2C", "6D", "4H", "3H", "5C"};
        boolean expected = true;
        ValueHandStraight value = new ValueHandStraight();
        assertEquals(expected, value.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoStraight() {
        String[] hand = {"2C", "6D", "2H", "3H", "5C"};
        boolean expected = false;
        ValueHandStraight value = new ValueHandStraight();
        assertEquals(expected, value.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoStraightIsFlush() {
        String[] hand = {"2H", "6H", "4H", "3H", "5H"};
        boolean expected = false;
        ValueHandStraight value = new ValueHandStraight();
        assertEquals(expected, value.rankedHand(hand));
    }
}