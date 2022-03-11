package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoPairTest {

    @Test
    public void valueOfHighestTwoPairTest() {
        TwoPair pairs = new TwoPair();
        int[] result = new int[2];
        result = pairs.valueOfTwoPairs("8H TD TS 8C 9D");
        assertEquals(10, result[0]);
        assertEquals(8, result[1]);
    }

    @Test
    public void compareHandsWithTwoPairsTest() {
        TwoPair pairs = new TwoPair();
        String result = pairs.compareHandsWithTwoPairs("9H TD TS 9C AD", "3H 4S 4C 3D 7H");
        assertEquals("9H TD TS 9C AD", result);

        result = pairs.compareHandsWithTwoPairs("3H 9D 9S 3C AD", "3H TS TC 3D 7H");
        assertEquals("3H TS TC 3D 7H", result);

        result = pairs.compareHandsWithTwoPairs("4H TD TS 4C AD", "3H TS TC 3D 7H");
        assertEquals("4H TD TS 4C AD", result);

        result = pairs.compareHandsWithTwoPairs("2H TD TS 2C AD", "3H TS TC 3D 7H");
        assertEquals("3H TS TC 3D 7H", result);

        result = pairs.compareHandsWithTwoPairs("3H TD TS 3C AD", "3H TS TC 3D 3H");
        assertEquals("Tie", result);
    }
}
