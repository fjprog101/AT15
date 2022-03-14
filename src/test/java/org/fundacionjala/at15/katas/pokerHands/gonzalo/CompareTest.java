package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CompareTest {

    @Test
    public void itShouldBeFlush() {
        String[] hand = {"2H", "6H", "AH", "KH", "5H"};
        Compare compare = new Compare();
        assertTrue(compare.compareSuit(hand));
    }
    @Test
    public void itShouldBeNoFlush() {
        String[] hand = {"2H", "6H", "AS", "KH", "5H"};
        Compare compare = new Compare();
        assertFalse(compare.compareSuit(hand));
    }



    @Test
    public void itShouldBeStraight() {
        String[] hand = {"2C", "6D", "4H", "3H", "5C"};
        Compare compare = new Compare();
        assertTrue(compare.isStraight(hand));
    }
    @Test
    public void itShouldBeNoStraight() {
        String[] hand = {"2C", "6D", "AH", "3H", "5C"};
        Compare compare = new Compare();
        assertFalse(compare.isStraight(hand));
    }



    @Test
    public void itShouldBeCardsHaveTheSameValue() {
        char[] hand = {'2', '2', '6', '5', '2'};
        int expected = 2;
        Compare compare = new Compare();
        assertEquals(expected, compare.xCardsHaveTheSameValue(hand, 0));
    }
    @Test
    public void itShouldBeCardsNoHaveTheSameValue() {
        char[] hand = {'2', '4', '9', '3', '5'};
        int expected = 0;
        Compare compare = new Compare();
        assertEquals(expected, compare.xCardsHaveTheSameValue(hand, 0));
    }



    @Test
    public void itShouldBeNoSameValue() {
        String[] hand = {"AH", "3H", "4H", "5H", "6H"};
        Compare compare = new Compare();
        assertTrue(compare.cardNoSameValue(hand));
    }
    @Test
    public void itShouldBeSameValue() {
        String[] hand = {"AD", "AH", "4H", "5H", "6H"};
        Compare compare = new Compare();
        assertFalse(compare.cardNoSameValue(hand));
    }
}