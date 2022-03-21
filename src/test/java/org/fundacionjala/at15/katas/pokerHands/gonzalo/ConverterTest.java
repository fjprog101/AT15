package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConverterTest {
    @Test
    public void itShouldBeCharArrayValue() {
        String[] hand = {"6D", "6D", "6D", "6D", "6D"};
        char[] expected = {'6', '6', '6', '6', '6'};
        Converter conver = new Converter();
        assertArrayEquals(expected, conver.converterCharValue(hand));
    }

    @Test
    public void itShouldBeCharArraySuit() {
        String[] hand = {"6D", "6D", "6D", "6D", "6D"};
        char[] expected = {'D', 'D', 'D', 'D', 'D'};
        Converter conver = new Converter();
        assertArrayEquals(expected, conver.converterCharSuit(hand));
    }

    @Test
    public void itShouldBeCharInt() {
        char[] hand = {'T', 'J', 'Q', 'K', 'A'};
        int[] expected = {10, 11, 12, 13, 14};
        Converter conver = new Converter();
        assertArrayEquals(expected, conver.converterInt(hand));
    }

    @Test
    public void itShouldBePositionMinorCard() {
        int[] hand = {4, 9, 3, 6, 5};
        int expected = 2;
        Converter conver = new Converter();
        assertEquals(expected, conver.getPositionMinorCard(hand));
    }

    @Test
    public void itShouldBePositionMajorCard() {
        int[] hand = {4, 9, 3, 6, 5};
        int expected = 1;
        Converter conver = new Converter();
        assertEquals(expected, conver.getPositionMajorCard(hand));
    }
}
