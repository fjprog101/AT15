package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValueHandStraightFlushTest {

    @Test
    public void itShouldBeStraightFlush() {
        String[] hand = {"2H", "6H", "4H", "3H", "5H"};
        String expected = "is Straight Flush";
        RankedHand value = new ValueHandStraightFlush();
        assertEquals(expected, value.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoStraightFlushIsFlush() {
        String[] hand = {"2H", "6H", "AH", "TH", "5H"};
        String expected = null;
        RankedHand value = new ValueHandStraightFlush();
        assertEquals(expected, value.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoStraightFlushIsStraight() {
        String[] hand = {"4H", "6D", "2H", "3H", "5H"};
        String expected = null;
        RankedHand value = new ValueHandStraightFlush();
        assertEquals(expected, value.rankedHand(hand));
    }

}
