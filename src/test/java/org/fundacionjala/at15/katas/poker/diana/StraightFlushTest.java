package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.StraightFlush;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class StraightFlushTest {

    @Test
    public void itShouldReturnPair() {
        ArrayList<String> suits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        numbers.add(9);
        StraightFlush straightFlush = new StraightFlush();
        boolean result = straightFlush.analysisOfRule(numbers, suits);
        assertTrue(result);
    }
}
