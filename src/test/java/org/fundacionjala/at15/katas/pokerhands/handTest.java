package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class handTest {
    @Test
    public void itShouldShowHighCardOfTheHand() {
        Card[] card = new Card[5];
        card[0] = new Card('2', 'C');
        card[1] = new Card('3', 'H');
        card[2] = new Card('4', 'S');
        card[3] = new Card('8', 'C');
        card[4] = new Card('A', 'H');
        Hand hand = new Hand(card);
        Card expetedCard = new Card('A', 'H');
        String expected = Character.toString(expetedCard.getValue()) + Character.toString(expetedCard.getSuit());
        String actual = Character.toString(hand.highCard().getValue()) + Character.toString(hand.highCard().getSuit());
        assertEquals(expected, actual);
    }

    @Test
    public void itShouldShowPairOfTheHand() {
        Card[] card = new Card[5];
        card[0] = new Card('8', 'C');
        card[1] = new Card('3', 'H');
        card[2] = new Card('2', 'S');
        card[3] = new Card('8', 'S');
        card[4] = new Card('4', 'H');
        Hand hand = new Hand(card);
        Card[] actualCard = new Card[2];
        actualCard = hand.pair();
        String actual1 = Character.toString(actualCard[0].getValue()) + Character.toString(actualCard[0].getSuit());
        String actual2 = Character.toString(actualCard[1].getValue()) + Character.toString(actualCard[1].getSuit());
        assertEquals("8C", actual1);
        assertEquals("8S", actual2);
    }

    @Test
    public void itShouldShowTwoPairsOfTheHand() {
        Card[] card = new Card[5];
        card[0] = new Card('8', 'C');
        card[1] = new Card('3', 'H');
        card[2] = new Card('2', 'S');
        card[3] = new Card('8', 'S');
        card[4] = new Card('3', 'C');
        Hand hand = new Hand(card);
        Card[] actualCard = new Card[4];
        actualCard = hand.twoPairs();
        String actual1 = Character.toString(actualCard[0].getValue()) + Character.toString(actualCard[0].getSuit());
        String actual2 = Character.toString(actualCard[1].getValue()) + Character.toString(actualCard[1].getSuit());
        String actual3 = Character.toString(actualCard[2].getValue()) + Character.toString(actualCard[2].getSuit());
        String actual4 = Character.toString(actualCard[3].getValue()) + Character.toString(actualCard[3].getSuit());
        assertEquals("8C", actual3);
        assertEquals("8S", actual4);
        assertEquals("3H", actual1);
        assertEquals("3C", actual2);
    }
}
