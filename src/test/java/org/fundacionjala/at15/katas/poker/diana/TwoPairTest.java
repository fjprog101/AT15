package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.TwoPair;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TwoPairTest {
    @Test
    public void itShouldReturnTwoPairs() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> suits = new ArrayList<String>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(3);
        numbers.add(7);
        numbers.add(13);
        TwoPair twoPair = new TwoPair();
        boolean result = twoPair.analysisOfRule(numbers, suits);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(7);
        expectedResult.add(5);
        assertTrue(result);
    }

    @Test
    public void itShouldNotReturnTwoPairs() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> suits = new ArrayList<String>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        TwoPair twoPair = new TwoPair();
        boolean result = twoPair.analysisOfRule(numbers, suits);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(7);
        expectedResult.add(5);
        assertFalse(result);
    }
}
