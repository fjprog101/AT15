package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.*;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void itShouldHaveAHand() {
        Card firstCard = new Card(2, 'C');
        Card secondCard = new Card(4, 'S');
        Card thirdCard = new Card(5, 'H');
        Card fourthCard = new Card(8, 'C');
        Card fifthCard = new Card(9, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        PokerHand pokerHand = new PokerHand(myHand);
        assertNotNull(pokerHand.getCards());
    }

    @Test
    public void itShouldHaveAValue() {
        Card firstCard = new Card(2, 'C');
        Card secondCard = new Card(4, 'S');
        Card thirdCard = new Card(5, 'H');
        Card fourthCard = new Card(8, 'C');
        Card fifthCard = new Card(9, 'D');

        List<Card> myHand = new ArrayList<Card>();
        myHand.add(firstCard);
        myHand.add(secondCard);
        myHand.add(thirdCard);
        myHand.add(fourthCard);
        myHand.add(fifthCard);

        PokerHand pokerHand = new PokerHand(myHand);
        assertEquals(1, pokerHand.getHandRank().getValue());
    }

    @Test
    public void itShouldCompareWithOtherHand() {
        List<Card> myHand = new ArrayList<Card>();
        myHand.add(new Card(2, 'C'));
        myHand.add(new Card(4, 'S'));
        myHand.add(new Card(5, 'H'));
        myHand.add(new Card(8, 'C'));
        myHand.add(new Card(9, 'D'));

        List<Card> otherHand = new ArrayList<Card>();
        otherHand.add(new Card(2, 'C'));
        otherHand.add(new Card(4, 'D'));
        otherHand.add(new Card(5, 'H'));
        otherHand.add(new Card(8, 'H'));
        otherHand.add(new Card(9, 'D'));

        PokerHand firstHand = new PokerHand(myHand);
        PokerHand secondHand = new PokerHand(otherHand);

        assertEquals(0, firstHand.compareTo(secondHand));
    }
}
