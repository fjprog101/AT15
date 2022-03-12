package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareTest {

    @Test
    public void itShouldBeFlush() {
        String[] hand = {"2H", "6H", "AH", "KH", "5H"};
        boolean expected = true;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareSuit(hand));
    }
    @Test
    public void itShouldBeNoFlush() {
        String[] hand = {"2H", "6H", "AS", "KH", "5H"};
        boolean expected = false;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareSuit(hand));
    }



    @Test
    public void itShouldBeStraight() {
        String[] hand = {"2C", "6D", "4H", "3H", "5C"};
        boolean expected = true;
        Compare compare = new Compare();
        assertEquals(expected, compare.isStraight(hand));
    }
    @Test
    public void itShouldBeNoStraight() {
        String[] hand = {"2C", "6D", "AH", "3H", "5C"};
        boolean expected = false;
        Compare compare = new Compare();
        assertEquals(expected, compare.isStraight(hand));
    }



    @Test
    public void itShouldBeNoEqualsCardsCompareCard1() {
        String[] hand = {"2C", "6D", "AH", "3H", "5C"};
        boolean expected = true;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard1(hand));
    }
    @Test
    public void itShouldBeEqualsCardsCompareCard1() {
        String[] hand = {"2C", "6D", "AH", "3H", "2C"};
        boolean expected = false;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard1(hand));
    }



    @Test
    public void itShouldBeNoEqualsCardsCompareCard2() {
        String[] hand = {"2C", "6D", "AH", "3H", "5C"};
        boolean expected = true;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard2(hand));
    }
    @Test
    public void itShouldBeEqualsCardsCompareCard2() {
        String[] hand = {"2C", "6D", "AH", "6H", "5C"};
        boolean expected = false;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard2(hand));
    }



    @Test
    public void itShouldBeNoEqualsCardsCompareCard3() {
        String[] hand = {"2C", "6D", "AH", "3H", "5C"};
        boolean expected = true;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard3(hand));
    }
    @Test
    public void itShouldBeEqualsCardsCompareCard3() {
        String[] hand = {"2C", "6D", "AH", "3H", "AC"};
        boolean expected = false;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard3(hand));
    }



    @Test
    public void itShouldBeNoEqualsCardsCompareCard4() {
        String[] hand = {"2C", "6D", "AH", "3H", "5C"};
        boolean expected = true;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard4(hand));
    }
    @Test
    public void itShouldBeEqualsCardsCompareCard4() {
        String[] hand = {"2C", "6D", "AH", "3H", "3C"};
        boolean expected = false;
        Compare compare = new Compare();
        assertEquals(expected, compare.compareCard4(hand));
    }
}