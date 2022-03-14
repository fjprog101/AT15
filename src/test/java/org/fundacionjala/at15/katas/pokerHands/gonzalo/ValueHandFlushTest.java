package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandFlushTest {

    @Test
    public void itShouldBeFlush() {
        String[] hand = {"2H", "6H", "AH", "TH", "5H"};
        RankedHand value = new ValueHandFlush();
        assertTrue(value.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoFlush() {
        String[] hand = {"4H", "6D", "2H", "3H", "5H"};
        RankedHand value = new ValueHandFlush();
        assertFalse(value.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoFlushIsStraightFlush() {
        String[] hand = {"2H", "6H", "4H", "3H", "5H"};
        RankedHand value = new ValueHandFlush();
        assertFalse(value.rankedHand(hand));
    }
}