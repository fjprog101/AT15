package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.*;

import java.util.*;

import org.fundacionjala.at15.katas.pokerhands.saul.HandRank.Rank;
import org.junit.Test;

public class HandRankTest {
    @Test
    public void itShouldHaveAValue() {
        HandRank handRank = new HandRank();

        assertEquals(0, handRank.getValue());
    }

    @Test
    public void itShouldCalculatePairCardRank() {
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
        handRank.calculateRank(myHand);
        assertEquals(Rank.PAIR, handRank.getRank());
    }

    @Test
    public void itShouldCalculateTwoPairCards() {
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
        handRank.calculateRank(myHand);
        assertEquals(Rank.TWO_PAIRS, handRank.getRank());
    }

    @Test
    public void itShouldCalculateThreeOfAKind() {
        Card firstCard = new Card(2, 'H');
        Card secondCard = new Card(4, 'S');
        Card thirdCard = new Card(3, 'H');
        Card fourthCard = new Card(3, 'C');
        Card fifthCard = new Card(3, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        handRank.calculateRank(myHand);
        assertEquals(Rank.THREE_KIND, handRank.getRank());
    }

    @Test
    public void itShouldCalculateStrightHand() {
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
        handRank.calculateRank(myHand);
        assertEquals(Rank.STRAIGHT, handRank.getRank());
    }

    @Test
    public void itShouldCalculateFlushHand() {
        Card firstCard = new Card(3, 'S');
        Card secondCard = new Card(6, 'S');
        Card thirdCard = new Card(7, 'S');
        Card fourthCard = new Card(8, 'S');
        Card fifthCard = new Card(9, 'S');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        handRank.calculateRank(myHand);
        assertEquals(Rank.FLUSH, handRank.getRank());
    }

    @Test
    public void itShouldCalculateFullHouseHand() {
        Card firstCard = new Card(5, 'S');
        Card secondCard = new Card(5, 'S');
        Card thirdCard = new Card(9, 'S');
        Card fourthCard = new Card(9, 'C');
        Card fifthCard = new Card(9, 'H');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        handRank.calculateRank(myHand);
        assertEquals(Rank.FULL_HOUSE, handRank.getRank());
    }

    @Test
    public void itShouldCcalculateFourKindHand() {
        Card firstCard = new Card(5, 'S');
        Card secondCard = new Card(9, 'S');
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
        handRank.calculateRank(myHand);
        assertEquals(Rank.FOUR_KIND, handRank.getRank());
    }

    @Test
    public void itShouldVerifiesStraightFlushHand() {
        Card firstCard = new Card(5, 'S');
        Card secondCard = new Card(6, 'S');
        Card thirdCard = new Card(7, 'S');
        Card fourthCard = new Card(8, 'S');
        Card fifthCard = new Card(9, 'S');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        HandRank handRank = new HandRank();
        handRank.calculateRank(myHand);
        assertEquals(Rank.STRAIGHT_FLUSH, handRank.getRank());
    }
}
