package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValueHandMajorCardTest {

    @Test
    public void itShouldBeMajorCard() {
        String[] hand = {"2H", "6S", "AD", "4C", "5H"};
        String expected = "AD";
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoMajorCard() {
        String[] hand = {"2S", "KH", "AH", "2C", "5H"};
        String expected = null;
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.rankedHand(hand));
    }

    @Test
    public void itShouldBeNoMajorCard2() {
        String[] hand = {"2H", "3S", "4C", "5H", "6H"};
        String expected = null;
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.rankedHand(hand));
    }
}
