package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandTwoPairTest {
    @Test
    public void itShouldBeTwoPair() {
        String[] hand = {"AH", "6S", "AD", "5C", "5H"};
        RankedHand value = new ValueHandTwoPair();
        assertTrue(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeTwoPairIsOnePair() {
        String[] hand = {"2H", "3S", "AD", "2C", "5H"};
        RankedHand value = new ValueHandTwoPair();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeTwoPairIsThree() {
        String[] hand = {"2H", "2S", "AD", "2C", "5H"};
        RankedHand value = new ValueHandTwoPair();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeTwoPairIsFull() {
        String[] hand = {"2H", "2S", "5D", "2C", "5H"};
        RankedHand value = new ValueHandTwoPair();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeTwoPairIsFour() {
        String[] hand = {"2H", "2S", "2D", "2C", "5H"};
        RankedHand value = new ValueHandTwoPair();
        assertFalse(value.rankedHand(hand));
    }
}