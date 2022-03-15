package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandThreeOfAKindTest {
    @Test
    public void itShouldBeThree() {
        String[] hand = {"2H", "2S", "AD", "2C", "5H"};
        RankedHand value = new ValueHandThreeOfAKind();
        assertTrue(value.rankedHand(hand));
    }
    
    @Test
    public void itNotShouldBeThreeIsPair() {
        String[] hand = {"AH", "6S", "2D", "5C", "5H"};
        RankedHand value = new ValueHandThreeOfAKind();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeThreeIsTwoPair() {
        String[] hand = {"2H", "3S", "AD", "2C", "3H"};
        RankedHand value = new ValueHandThreeOfAKind();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeThreeIsFull() {
        String[] hand = {"2H", "2S", "5D", "2C", "5H"};
        RankedHand value = new ValueHandThreeOfAKind();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeThreeIsFour() {
        String[] hand = {"2H", "2S", "2D", "2C", "5H"};
        RankedHand value = new ValueHandThreeOfAKind();
        assertFalse(value.rankedHand(hand));
    }
}
