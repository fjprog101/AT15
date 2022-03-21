package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.katas.pokerhands.adhemar.Card;
import org.junit.Test;

public class StraightPatternTest {
    @Test
    public void itShouldBeOnlyStraight() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "C"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        StraightPattern hand = new StraightPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "C"),
            new Card("6", "D"),
            new Card("8", "D")
        };
        hand = new StraightPattern(cards2);

        assertFalse(hand.match());

        Card[] cards3 = {
            new Card("T", "D"),
            new Card("J", "D"),
            new Card("Q", "D"),
            new Card("K", "D"),
            new Card("A", "D")
        };
        hand = new StraightPattern(cards3);

        assertFalse(hand.match());

        Card[] cards4 = {
            new Card("T", "D"),
            new Card("K", "H"),
            new Card("J", "D"),
            new Card("Q", "D"),
            new Card("A", "D")
        };
        hand = new StraightPattern(cards4);

        assertTrue(hand.match());
    }
}
