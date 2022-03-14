package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandPairTest {
    @Test
    public void itShouldBeOnePair() {
        String[] hand = {"2H", "6S", "AD", "5C", "5H"};
        RankedHand value = new ValueHandPair();
        assertTrue(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeOnePair() {
        String[] hand = {"2H", "3S", "AD", "9C", "5H"};
        RankedHand value = new ValueHandPair();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeOnePairTwoPair() {
        String[] hand = {"2H", "2S", "AD", "5C", "5H"};
        RankedHand value = new ValueHandPair();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeOnePairThreeOfKind() {
        String[] hand = {"3H", "3S", "AD", "9C", "3H"};
        RankedHand value = new ValueHandPair();
        assertFalse(value.rankedHand(hand));
    }
}