package org.fundacionjala.at15.katas.pokerHands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.gonzalo.ValueHandMajorCard;
import org.junit.Test;

public class ValueHandMajorCardTest {

    @Test
    public void itShouldBeMajorCard() {
        String[] hand = {"2H", "6S", "AD", "4C", "5H"};
        String expected = "AD";
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.majorCard(hand));
    }

    @Test
    public void itShouldBeNoMajorCard() {
        String[] hand = {"2S", "KH", "AH", "2C", "5H"};
        String expected = null;
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.majorCard(hand));
    }

    @Test
    public void itShouldBeNoMajorCard2() {
        String[] hand = {"2H", "KH", "AH", "9H", "5H"};
        String expected = null;
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.majorCard(hand));
    }
}
