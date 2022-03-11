package org.fundacionjala.at15.katas.pokerhands.saul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class WinnerCalculatorTest {
    @Test
    public void isShouldSelectWinnerHighestCard() {
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
        assertEquals(1, winnerCalculator.highestCardWinner(blackHand, whiteHand));
    }
}
