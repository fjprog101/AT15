package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.FullHouse;
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
        // List<Integer> expectedResult = new ArrayList<Integer>();
        // expectedResult.add(5);
        // expectedResult.add(7);
        // assertEquals(expectedResult, result);
        assertTrue(result);
    }

}
