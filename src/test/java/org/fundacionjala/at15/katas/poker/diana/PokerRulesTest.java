package org.fundacionjala.at15.katas.poker.diana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.fundacionjala.at15.katas.pokerhands.diana.PokerRules;
import org.junit.Test;

public class PokerRulesTest {
    ArrayList<String> suits = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    @Test
    public void itShouldReturnTwoPairs() {
        numbers.add(13);
        numbers.add(7);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        PokerRules pokerRules = new PokerRules(numbers, suits);
        List<Integer> result = pokerRules.twoPair(numbers);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(7);
        expectedResult.add(5);
        assertEquals(expectedResult, result);
    }

    @Test
    public void itShouldReturnStraight() {
        numbers.add(11);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        numbers.add(9);
        PokerRules pokerRules = new PokerRules(numbers, suits);
        boolean result = pokerRules.straight(numbers);
        assertTrue(result);
    }

    @Test
    public void itShouldReturnFlush() {
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        PokerRules pokerRules = new PokerRules(numbers, suits);
        boolean result = pokerRules.flush(suits);
        assertTrue(result);
    }

    @Test
    public void itShouldReturnFullHouse() {
        numbers.add(7);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        PokerRules pokerRules = new PokerRules(numbers, suits);
        List<Integer> result = pokerRules.fullHouse(numbers);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(5);
        expectedResult.add(7);
        assertEquals(expectedResult, result);
    }

    @Test
    public void itShouldReturnStraightFlush() {
        numbers.add(11);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        numbers.add(9);
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        PokerRules pokerRules = new PokerRules(numbers, suits);
        boolean result = pokerRules.straightFlush(numbers, suits);
        assertTrue(result);
    }

}