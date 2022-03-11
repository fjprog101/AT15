package org.fundacionjala.at15.katas.pokerHands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.gonzalo.ValueHandPair;
import org.junit.Test;

public class ValueHandPairTest {
    @Test
    public void itShouldBeOnePair() {
        String[] hand = {"2H", "6S", "AD", "5C", "5H"};
        String expected = "pair";
        ValueHandPair value = new ValueHandPair();
        assertEquals(expected, value.comparePair(hand));
    }

    @Test
    public void itNotShouldBeOnePair() {
        String[] hand = {"2H", "3S", "AD", "9C", "5H"};
        String expected = null;
        ValueHandPair value = new ValueHandPair();
        assertEquals(expected, value.comparePair(hand));
    }

    @Test
    public void itNotShouldBeOnePairTwoPair() {
        String[] hand = {"2H", "2S", "AD", "5C", "5H"};
        String expected = null;
        ValueHandPair value = new ValueHandPair();
        assertEquals(expected, value.comparePair(hand));
    }

    @Test
    public void itNotShouldBeOnePairThreeOfKind() {
        String[] hand = {"3H", "3S", "AD", "9C", "3H"};
        String expected = null;
        ValueHandPair value = new ValueHandPair();
        assertEquals(expected, value.comparePair(hand));
    }
}