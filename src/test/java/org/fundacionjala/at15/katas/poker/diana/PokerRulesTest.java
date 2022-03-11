package org.fundacionjala.at15.katas.poker.diana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at15.katas.pokerhands.diana.PokerRules;
import org.junit.Test;

public class PokerRulesTest {
    ArrayList<String> suits = new ArrayList<String>();
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    @Test
    public void itShouldReturnHighCard() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(9);
        numeros.add(13);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        int result = pokerRules.highCard(numeros);
        assertEquals(13, result);
    }

    @Test
    public void itShouldReturnPair() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(13);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        int result = pokerRules.pair(numeros);
        assertEquals(5, result);
    }

    @Test
    public void itShouldReturnTwoPairs() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(13);
        numeros.add(7);
        numeros.add(5);
        numeros.add(7);
        numeros.add(5);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        List<Integer> result = pokerRules.twoPair(numeros);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(7);
        expectedResult.add(5);
        assertEquals(expectedResult, result);
    }

    @Test
    public void itShouldReturnThreeOfAKind() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(7);
        numeros.add(2);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        int result = pokerRules.threeOfAKind(numeros);
        assertEquals(2, result);
    }

    @Test
    public void itShouldReturnStraight() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(11);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(9);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        boolean result = pokerRules.straight(numeros);
        assertTrue(result);
    }

    @Test
    public void itShouldReturnFlush() {
        ArrayList<String> suits = new ArrayList<String>();
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        PokerRules pokerRules = new PokerRules(numeros, suits);
        boolean result = pokerRules.flush(suits);
        assertTrue(result);
    }

    @Test
    public void itShouldReturnFullHouse() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);
        numeros.add(5);
        numeros.add(5);
        numeros.add(7);
        numeros.add(5);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        List<Integer> result = pokerRules.fullHouse(numeros);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(5);
        expectedResult.add(7);
        assertEquals(expectedResult, result);
    }

    @Test
    public void itShouldReturnFourOfAKind() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(8);
        numeros.add(8);
        numeros.add(2);
        numeros.add(8);
        numeros.add(8);
        PokerRules pokerRules = new PokerRules(numeros, suits);
        int result = pokerRules.fourOfAKind(numeros);
        assertEquals(8, result);
    }

    @Test
    public void itShouldReturnStraightFlush() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(11);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(9);
        ArrayList<String> suits = new ArrayList<String>();
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        PokerRules pokerRules = new PokerRules(numeros, suits);
        boolean result = pokerRules.straightFlush(numeros, suits);
        assertTrue(result);
    }

}
