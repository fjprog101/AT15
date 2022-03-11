package org.fundacionjala.at15.katas.pokerHands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.gonzalo.ValueHandMajorCard;
import org.junit.Test;

public class ValueHandMajorCardTest {

    @Test
    public void itShouldBeMajorCard() {
        String[] hand = {"2H", "6S", "AD", "5C", "5H"};
        String expected = "AD";
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.majorCard(hand));
    }

    @Test
    public void itShouldBeNoMajorCard() {
        String[] hand = {"2H", "2S", "AD", "2C", "5H"};
        String expected = null;
        ValueHandMajorCard major = new ValueHandMajorCard();
        assertEquals(expected, major.majorCard(hand));
    }
}
