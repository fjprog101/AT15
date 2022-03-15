package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class HandRankVerifierTest {
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

        assertTrue(HandTypeVerifier.isPair(myHand));
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

        assertTrue(HandTypeVerifier.isTwoPairs(myHand));
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

        assertTrue(HandTypeVerifier.isThreeKind(myHand));
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

        assertTrue(HandTypeVerifier.isStraight(myHand));
    }

    @Test
    public void itShouldVerifiesFlushHand() {
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

        assertTrue(HandTypeVerifier.isFlush(myHand));
    }

    @Test
    public void itShouldVerifiesFullHouseHand() {
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

        assertTrue(HandTypeVerifier.isFullHouse(myHand));
    }

    @Test
    public void itShouldVerifiesFourKindHand() {
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

        assertTrue(HandTypeVerifier.isFourKind(myHand));
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

        assertTrue(HandTypeVerifier.isStraightFlush(myHand));
    }
}