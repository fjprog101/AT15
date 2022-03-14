package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.FullHouse;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class FullHouseTest {
    ArrayList<String> suits = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    @Test
    public void itShouldReturnFullHouse() {
        numbers.add(7);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        FullHouse fullHouse = new FullHouse();
        boolean result = fullHouse.analysisOfRule(numbers, suits);
        assertTrue(result);
    }

    @Test
    public void itShouldNotReturnFullHouse() {
        numbers.add(7);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        FullHouse fullHouse = new FullHouse();
        boolean result = fullHouse.analysisOfRule(numbers, suits);
        assertFalse(result);
    }

}
