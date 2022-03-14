package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.Straight;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class StraightTest {

    @Test
    public void itShouldReturnStraight() {
        ArrayList<String> suits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        numbers.add(9);
        Straight straight = new Straight();
        boolean result = straight.analysisOfRule(numbers, suits);
        assertTrue(result);
    }

    @Test
    public void itShouldNotReturnStraight() {
        ArrayList<String> suits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(1);
        numbers.add(8);
        numbers.add(10);
        numbers.add(9);
        Straight straight = new Straight();
        boolean result = straight.analysisOfRule(numbers, suits);
        assertFalse(result);
    }
}
