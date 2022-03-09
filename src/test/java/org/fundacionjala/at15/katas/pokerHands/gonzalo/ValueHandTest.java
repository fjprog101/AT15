package org.fundacionjala.at15.katas.pokerHands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.gonzalo.ValueHand;
import org.junit.Test;

public class ValueHandTest {
    @Test
    public void itShouldBeOnePair() {
        String[] hand = {"2H", "6S", "AD", "5C", "5H"};
        String expected = "pair";
        ValueHand value = new ValueHand();
        String compare = value.getValueHand(hand);
        assertEquals(expected, compare);
    }
}