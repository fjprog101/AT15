package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandFourAKindTest {
    @Test
    public void itShouldBeFour() {
        String[] hand = {"2H", "2S", "5H", "2C", "2D"};
        RankedHand value = new ValueHandFourOfAKind();
        assertTrue(value.rankedHand(hand));
    }
    
    @Test
    public void itNotShouldBeFourIsPair() {
        String[] hand = {"AH", "6S", "2D", "5C", "5H"};
        RankedHand value = new ValueHandFourOfAKind();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeFourIsTwoPair() {
        String[] hand = {"2H", "3S", "AD", "2C", "3H"};
        RankedHand value = new ValueHandFourOfAKind();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeFourIsThree() {
        String[] hand = {"2H", "2S", "AD", "2C", "5H"};
        RankedHand value = new ValueHandFourOfAKind();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeFourIsFull() {
        String[] hand = {"2H", "2S", "5D", "2C", "5H"};
        RankedHand value = new ValueHandFourOfAKind();
        assertFalse(value.rankedHand(hand));
    }
}