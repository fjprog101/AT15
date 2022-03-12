package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandComparationTest {
    @Test
    public void itShouldReturnTheValueOfTheHighCard() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("4", "D");
        card[3] = new Card("J", "H");
        card[4] = new Card("A", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 1;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfThePair() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("4", "D");
        card[3] = new Card("2", "H");
        card[4] = new Card("A", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 2;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfTheTwoPair() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("A", "D");
        card[3] = new Card("2", "H");
        card[4] = new Card("A", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 3;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfTheThreeOfAKind() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("2", "D");
        card[2] = new Card("4", "D");
        card[3] = new Card("2", "H");
        card[4] = new Card("A", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 4;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfTheStraight() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("4", "D");
        card[3] = new Card("5", "H");
        card[4] = new Card("6", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 5;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfTheFlush() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("A", "C");
        card[2] = new Card("9", "C");
        card[3] = new Card("Q", "C");
        card[4] = new Card("8", "C");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 6;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfTheFullHouse() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("A", "D");
        card[2] = new Card("A", "C");
        card[3] = new Card("2", "H");
        card[4] = new Card("2", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 7;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfThePoker() {
        Card[] card = new Card[5];
        card[0] = new Card("A", "C");
        card[1] = new Card("A", "D");
        card[2] = new Card("A", "H");
        card[3] = new Card("2", "H");
        card[4] = new Card("A", "S");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 8;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldReturnTheValueOfTheStraightFlush() {
        Card[] card = new Card[5];
        card[0] = new Card("10", "D");
        card[1] = new Card("J", "D");
        card[2] = new Card("Q", "D");
        card[3] = new Card("K", "D");
        card[4] = new Card("A", "D");
        Hand hand = new Hand(card);
        HandsComparation handsComparation = new HandsComparation();
        int value = handsComparation.handTipe(hand);
        int expected = 9;
        assertEquals(expected, value);
    }

    @Test
    public void itShouldCompareTheHands() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("Q", "C");
        card1[1] = new Card("Q", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("Q", "H");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("K", "D");
        card2[2] = new Card("K", "H");
        card2[3] = new Card("K", "S");
        card2[4] = new Card("9", "C");
        Hand whiteHand = new Hand(card2);
        HandsComparation handsComparation = new HandsComparation(blackHand, whiteHand);
        String result = handsComparation.compare();
        String expected = "White hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldReturnTheWinnerOfSameHandComparation() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("5", "C");
        card1[1] = new Card("5", "D");
        card1[2] = new Card("7", "D");
        card1[3] = new Card("9", "H");
        card1[4] = new Card("9", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("2", "C");
        card2[1] = new Card("2", "C");
        card2[2] = new Card("4", "D");
        card2[3] = new Card("K", "H");
        card2[4] = new Card("K", "S");
        Hand whiteHand = new Hand(card2);
        HandsComparation handsComparation = new HandsComparation(blackHand, whiteHand);
        String result = handsComparation.sameHandComparation(blackHand, whiteHand);
        String expected = "White hand wins";
        assertEquals(expected, result);
    }
}
