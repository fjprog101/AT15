package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValueHandTest {
    @Test
    public void itShouldBeMajorCard() {
        String[] hand = {"2C", "6D", "4H", "AH", "5C"};
        int expected = 1;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBePair() {
        String[] hand = {"2C", "6D", "6H", "3H", "5C"};
        int expected = 2;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeTwoPair() {
        String[] hand = {"2C", "2D", "4H", "3H", "4C"};
        int expected = 3;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeThree() {
        String[] hand = {"2C", "2D", "2H", "3H", "5C"};
        int expected = 4;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeStraight() {
        String[] hand = {"2C", "6D", "4H", "3H", "5C"};
        int expected = 5;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeFlush() {
        String[] hand = {"2C", "6C", "9C", "KC", "5C"};
        int expected = 6;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeFull() {
        String[] hand = {"AC", "AD", "5H", "AH", "5C"};
        int expected = 7;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeFour() {
        String[] hand = {"KC", "KD", "4H", "KH", "KS"};
        int expected = 8;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }

    @Test
    public void itShouldBeStraightFlush() {
        String[] hand = {"2H", "6H", "4H", "3H", "5H"};
        int expected = 9;
        ValueHand value = new ValueHand();
        assertEquals(expected, value.getValueHand(hand));
    }
}
