package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.katas.pokerhands.adhemar.Card;
import org.junit.Test;

public class HighCardPatternTest {
    @Test
    public void itShouldBeHighCard() {
        Card[] cards1 = {
            new Card("4", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        HighCardPattern hand = new HighCardPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("4", "S"),
            new Card("4", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        hand = new HighCardPattern(cards2);

        assertFalse(hand.match());

        Card[] cards3 = {
            new Card("4", "S"),
            new Card("J", "S"),
            new Card("3", "S"),
            new Card("K", "S"),
            new Card("A", "S")
        };
        hand = new HighCardPattern(cards3);

        assertFalse(hand.match());
    }
}
