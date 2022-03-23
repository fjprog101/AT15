package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValueHandMajorCardTest {

    @Test
    public void itShouldBePositionMajorCard() {
        String[] hand = {"AH", "3H", "4H", "5H", "6H"};
        int expected = 0;
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.position(hand));
    }

    @Test
    public void itShouldBeMajorCard() {
        String[] hand = {"2H", "6S", "AD", "4C", "5H"};
        RankedHand major = new ValueHandMajorCard();
        assertTrue(major.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoMajorCard() {
        String[] hand = {"2S", "KH", "AH", "2C", "5H"};
        RankedHand major = new ValueHandMajorCard();
        assertFalse(major.rankedHand(hand));
    }
}