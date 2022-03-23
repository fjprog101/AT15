package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StraightTest {

    @Test
    public void valueOfStraightTest() {
        Straight straight = new Straight();
        String hand = "TH JD QS KC AD";
        int result = straight.valueOfStraight(hand);
        assertEquals(14, result);
    }

    @Test
    public void theHandIsStraightTest() {
        Straight straight = new Straight();
        boolean result = straight.theHandIsStraight("TH JD QS KC AD");
        assertEquals(true, result);
        result = straight.theHandIsStraight("2H JD QS KC AD");
        assertEquals(false, result);
    }

    @Test
    public void compareStraightsHandsTest() {
        Straight straight = new Straight();
        String result = straight.compareStraightsHands("TH JD QS KC AD", "2H 3D 4S 5C 6D");
        assertEquals("TH JD QS KC AD", result);
        result = straight.compareStraightsHands("2H 3D 4S 5C 6D", "4H 5D 6S 7C 8D");
        assertEquals("4H 5D 6S 7C 8D", result);
        result = straight.compareStraightsHands("4D 5C 6H 7C 8S", "4H 5D 6S 7C 8D");
        assertEquals("Tie", result);
    }
}