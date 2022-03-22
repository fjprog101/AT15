package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void itShouldHaveListCard() {
        Card card1 = new Card("T","D");
        Card card2 = new Card("J","D");
        Card card3 = new Card("Q","D");
        Card card4 = new Card("K","D");
        Card card5 = new Card("A","D");
        List<Card> pokerHand = new ArrayList<Card>();
        pokerHand.add(card1);
        pokerHand.add(card2);
        pokerHand.add(card3);
        pokerHand.add(card4);
        pokerHand.add(card5);
        Player white = new Player(pokerHand, "Sergio");

        assertEquals(card1, white.getPokerHandCard(0));
        assertEquals(card2, white.getPokerHandCard(1));
        assertEquals(card3, white.getPokerHandCard(2));
        assertEquals(card4, white.getPokerHandCard(3));
        assertEquals(card5, white.getPokerHandCard(4));
    }
    @Test
    public void itShouldHaveName() {
        Card card1 = new Card("T","D");
        Card card2 = new Card("J","D");
        Card card3 = new Card("Q","D");
        Card card4 = new Card("K","D");
        Card card5 = new Card("A","D");
        List<Card> pokerHand = new ArrayList<Card>();
        pokerHand.add(card1);
        pokerHand.add(card2);
        pokerHand.add(card3);
        pokerHand.add(card4);
        pokerHand.add(card5);
        Player white = new Player(pokerHand, "Sergio");

        assertEquals("Sergio",white.getName());
    }
}
