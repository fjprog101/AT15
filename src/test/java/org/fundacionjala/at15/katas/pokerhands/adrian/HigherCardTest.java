package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HigherCardTest {

    @Test
    public void itShouldReturnTheHighestCardOfHand() {
        HighCard checkHighCard = new HighCard();
        String hand1 = "2H 3D 5S 9C AD";
        int winner = checkHighCard.sortedHand(hand1)[4];
        int expectedResult = 14;
        assertEquals(expectedResult, winner);
    }

    @Test
    public void compareHandsWithHigherCardTest() {
        HighCard checkHighCard = new HighCard();
        String hand1 = "2H 4D 5S 9C AD";
        String hand2 = "3C 4H 5C 9S AH";
        String winner = checkHighCard.compareHandsWithHigherCard(hand1, hand2);
        String expectedResult = "3C 4H 5C 9S AH";
        assertEquals(expectedResult, winner);

        hand1 = "2H 3D 5S 9C KD";
        hand2 = "2D 3H 5C 9S KH";
        winner = checkHighCard.compareHandsWithHigherCard(hand1, hand2);
        assertEquals("Tie", winner);
    }
}