package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandFullHouseTest {
    @Test
    public void itShouldBeFull() {
        String[] hand = {"2H", "2S", "5D", "2C", "5H"};
        RankedHand value = new ValueHandFullHouse();
        assertTrue(value.rankedHand(hand));
    }
    
    @Test
    public void itNotShouldBeFullIsPair() {
        String[] hand = {"AH", "6S", "2D", "5C", "5H"};
        RankedHand value = new ValueHandFullHouse();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeFullIsTwoPair() {
        String[] hand = {"2H", "3S", "AD", "2C", "3H"};
        RankedHand value = new ValueHandFullHouse();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeFullIsThree() {
        String[] hand = {"2H", "2S", "AD", "2C", "5H"};
        RankedHand value = new ValueHandFullHouse();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itNotShouldBeFullIsFour() {
        String[] hand = {"2H", "2S", "2D", "2C", "5H"};
        RankedHand value = new ValueHandFullHouse();
        assertFalse(value.rankedHand(hand));
    }
}
