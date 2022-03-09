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
}
