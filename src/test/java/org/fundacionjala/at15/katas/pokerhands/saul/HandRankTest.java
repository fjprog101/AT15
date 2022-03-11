package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class HandRankTest {
    @Test
    public void itShouldHaveAValue() {
        HandRank handRank = new HandRank();

        assertEquals(0, handRank.getValue());
    }

    @Test
    public void itShouldVerifiesPairCards() {
        Card firstCard = new Card(1, 'C');
        Card secondCard = new Card(2, 'S');
        Card thirdCard = new Card(8, 'H');
        Card fourthCard = new Card(8, 'C');
        Card fifthCard = new Card(9, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        assertTrue(handRank.isPair(myHand));
    }

    @Test
    public void itShouldVerifiesTwoPairCards() {
        Card firstCard = new Card(2, 'C');
        Card secondCard = new Card(2, 'S');
        Card thirdCard = new Card(5, 'H');
        Card fourthCard = new Card(8, 'C');
        Card fifthCard = new Card(8, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        assertTrue(handRank.isTwoPairs(myHand));
    }

    @Test
    public void itShouldVerifiesThreeOfAKind() {
        Card firstCard = new Card(2, 'C');
        Card secondCard = new Card(2, 'S');
        Card thirdCard = new Card(8, 'H');
        Card fourthCard = new Card(8, 'C');
        Card fifthCard = new Card(8, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        assertTrue(handRank.isThreeKind(myHand));
    }

    @Test
    public void itShouldVerifiesStrightHand() {
        Card firstCard = new Card(5, 'C');
        Card secondCard = new Card(6, 'S');
        Card thirdCard = new Card(7, 'H');
        Card fourthCard = new Card(8, 'C');
        Card fifthCard = new Card(9, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        assertTrue(handRank.isStraight(myHand));
    }

    @Test
    public void itShouldVerifiesFullHouseHand() {
        Card firstCard = new Card(5, 'S');
        Card secondCard = new Card(5, 'S');
        Card thirdCard = new Card(9, 'S');
        Card fourthCard = new Card(9, 'S');
        Card fifthCard = new Card(9, 'S');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        assertTrue(handRank.isFullHouse(myHand));
    }
}