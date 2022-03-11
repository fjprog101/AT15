package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FourOfAKindTest {
    @Test
    public void valueFourOfAKindTest() {
        FourOfAKind fourOfAKind = new FourOfAKind();
        assertEquals(11, fourOfAKind.valueFourOfAKind("JH JD JS JC KD")[0]);
        assertEquals(13, fourOfAKind.valueFourOfAKind("JH JD JS JC KD")[1]);
        assertEquals(14, fourOfAKind.valueFourOfAKind("AH JD JS JC JD")[1]);
    }

    @Test
    public void theHandHasFourOfAKindTest() {
        FourOfAKind fourOfAKind = new FourOfAKind();
        assertEquals(true, fourOfAKind.theHandHasFourOfAKind("AH JD JS JC JD"));
        assertEquals(false, fourOfAKind.theHandHasFourOfAKind("3H JD 3S JC JD"));
    }

    @Test
    public void compareHandsFourOfAKindTest() {
        FourOfAKind fourOfAKind = new FourOfAKind();
        String result = fourOfAKind.compareHandsFourOfAKind("JH JD JS JC KD", "JH JD JS JC AD");
        assertEquals("JH JD JS JC AD", result);
        result = fourOfAKind.compareHandsFourOfAKind("AH JD JS JC JD", "JH JD JS JC 2D");
        assertEquals("AH JD JS JC JD", result);
        result = fourOfAKind.compareHandsFourOfAKind("8H 8S 8C 8D 7H", "3H 6S 8C 2D 4H");
        assertEquals("8H 8S 8C 8D 7H", result);
        result = fourOfAKind.compareHandsFourOfAKind("8H 6S 7C 5D 2H", "8H 9S 9C 9D 9H");
        assertEquals("8H 9S 9C 9D 9H", result);
        result = fourOfAKind.compareHandsFourOfAKind("7S 7C 7D AH 7H", "7H 7S AC 7D 7H");
        assertEquals("Tie", result);
    }
}
