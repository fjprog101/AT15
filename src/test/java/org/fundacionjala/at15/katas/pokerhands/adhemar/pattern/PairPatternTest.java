package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.katas.pokerhands.adhemar.Card;
import org.junit.Test;

public class PairPatternTest {
    @Test
    public void itShouldBePair() {
        Card[] cards1 = {
            new Card("4", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("4", "H"),
            new Card("A", "D")
        };
        PairPattern hand = new PairPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("3", "S"),
            new Card("3", "C"),
            new Card("3", "D"),
            new Card("3", "H"),
            new Card("T", "D")
        };
        hand = new PairPattern(cards2);

        assertFalse(hand.match());

        Card[] cards3 = {
            new Card("3", "S"),
            new Card("3", "C"),
            new Card("5", "D"),
            new Card("5", "H"),
            new Card("T", "D")
        };
        hand = new PairPattern(cards3);

        assertFalse(hand.match());

        Card[] cards4 = {
            new Card("3", "S"),
            new Card("4", "C"),
            new Card("5", "D"),
            new Card("6", "H")
        };
        hand = new PairPattern(cards4);

        assertFalse(hand.match());

        Card[] cards5 = {
            new Card("3", "D"),
            new Card("3", "D"),
            new Card("5", "D"),
            new Card("Q", "D"),
            new Card("T", "D")
        };
        hand = new PairPattern(cards5);

        assertFalse(hand.match());
    }
}
