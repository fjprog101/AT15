package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrouperTest {
    @Test
    public void itShouldGetGroups() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("3", "H"),
            new Card("3", "D")
        };
        PokerHand hand = new PokerHand(cards1);

        assertEquals("3", hand.getGroups().get(0).getStringValue());
        assertEquals("A", hand.getGroups().get(1).getStringValue());
        assertEquals("5", hand.getGroups().get(2).getStringValue());
    }

    @Test
    public void itShouldCountGroups() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("3", "H"),
            new Card("3", "D")
        };
        PokerHand hand = new PokerHand(cards1);

        assertEquals(3, hand.getGroups().get(0).getQuantity());
        assertEquals(1, hand.getGroups().get(1).getQuantity());
        assertEquals(1, hand.getGroups().get(2).getQuantity());
    }
}
