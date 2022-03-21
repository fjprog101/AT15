package org.fundacionjala.at15.katas.pokerhands.saul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class WinnerCalculatorTest {
    @Test
    public void isShouldCalculatesHighestCardWinner() {
        List<Card> myHand = new ArrayList<Card>();
        myHand.add(new Card(2, 'H'));
        myHand.add(new Card(3, 'D'));
        myHand.add(new Card(5, 'S'));
        myHand.add(new Card(9, 'C'));
        myHand.add(new Card(13, 'D'));

        List<Card> otherHand = new ArrayList<Card>();
        otherHand.add(new Card(2, 'C'));
        otherHand.add(new Card(3, 'H'));
        otherHand.add(new Card(5, 'S'));
        otherHand.add(new Card(9, 'C'));
        otherHand.add(new Card(14, 'H'));

        PokerHand blackHand = new PokerHand(myHand);
        PokerHand whiteHand = new PokerHand(otherHand);
        WinnerCalculator winnerCalculator = new WinnerCalculator();
        assertEquals(1, winnerCalculator.highestCardWinner(blackHand, whiteHand)); // White wins
    }

    @Test
    public void isShouldCalculateAWinner() {
        // First input - White wins
        List<Card> myHand = new ArrayList<Card>();
        myHand.add(new Card(2, 'H'));
        myHand.add(new Card(3, 'D'));
        myHand.add(new Card(5, 'S'));
        myHand.add(new Card(9, 'C'));
        myHand.add(new Card(13, 'D'));

        List<Card> otherHand = new ArrayList<Card>();
        otherHand.add(new Card(2, 'C'));
        otherHand.add(new Card(3, 'H'));
        otherHand.add(new Card(5, 'S'));
        otherHand.add(new Card(9, 'C'));
        otherHand.add(new Card(14, 'H'));

        PokerHand blackHand = new PokerHand(myHand);
        PokerHand whiteHand = new PokerHand(otherHand);
        WinnerCalculator winnerCalculator = new WinnerCalculator();
        assertEquals(1, winnerCalculator.getWinner(blackHand, whiteHand));
    }

    @Test
    public void itShouldCalculateFullHouseWinner() {
        // Second input - Black wins
        // Black: 2H 4S 4C 2D 4H  White: 2S 8S AS QS 3S
        List<Card> myHand = new ArrayList<Card>();
        myHand.add(new Card(2, 'H'));
        myHand.add(new Card(2, 'D'));
        myHand.add(new Card(4, 'S'));
        myHand.add(new Card(4, 'C'));
        myHand.add(new Card(4, 'H'));

        List<Card> otherHand = new ArrayList<Card>();
        otherHand.add(new Card(2, 'S'));
        otherHand.add(new Card(3, 'S'));
        otherHand.add(new Card(8, 'S'));
        otherHand.add(new Card(12, 'S'));
        otherHand.add(new Card(14, 'S'));

        PokerHand blackHand = new PokerHand(myHand);
        PokerHand whiteHand = new PokerHand(otherHand);
        WinnerCalculator winnerCalculator = new WinnerCalculator();

        assertEquals(-1, winnerCalculator.getWinner(blackHand, whiteHand));
    }

    @Test
    public void itShouldCalculateHighestCardWinner() {
        // third input - Black wins
        // Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C KH
        List<Card> myHand = new ArrayList<Card>();
        myHand.add(new Card(2, 'H'));
        myHand.add(new Card(3, 'D'));
        myHand.add(new Card(5, 'S'));
        myHand.add(new Card(9, 'C'));
        myHand.add(new Card(13, 'D'));

        List<Card> otherHand = new ArrayList<Card>();
        otherHand.add(new Card(2, 'C'));
        otherHand.add(new Card(3, 'H'));
        otherHand.add(new Card(4, 'S'));
        otherHand.add(new Card(8, 'C'));
        otherHand.add(new Card(13, 'H'));

        PokerHand blackHand = new PokerHand(myHand);
        PokerHand whiteHand = new PokerHand(otherHand);
        WinnerCalculator winnerCalculator = new WinnerCalculator();
        assertEquals(-1, winnerCalculator.getWinner(blackHand, whiteHand));
    }

    @Test
    public void itShouldCalculateTie() {
        // Fourth input - Tie
        // Black: 2H 3D 5S 9C KD  White: 2D 3H 5C 9S KH
        List<Card> myHand = new ArrayList<Card>();
        myHand.add(new Card(2, 'H'));
        myHand.add(new Card(3, 'D'));
        myHand.add(new Card(5, 'S'));
        myHand.add(new Card(9, 'C'));
        myHand.add(new Card(13, 'D'));

        List<Card> otherHand = new ArrayList<Card>();
        otherHand.add(new Card(2, 'D'));
        otherHand.add(new Card(3, 'H'));
        otherHand.add(new Card(5, 'C'));
        otherHand.add(new Card(9, 'S'));
        otherHand.add(new Card(13, 'H'));

        PokerHand blackHand = new PokerHand(myHand);
        PokerHand whiteHand = new PokerHand(otherHand);
        WinnerCalculator winnerCalculator = new WinnerCalculator();
        assertEquals(0, winnerCalculator.getWinner(blackHand, whiteHand));
    }
}
