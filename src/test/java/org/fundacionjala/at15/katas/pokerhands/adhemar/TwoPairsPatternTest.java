package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsPatternTest {
    @Test
    public void itShouldBeTwoPairs() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        TwoPairsPattern hand = new TwoPairsPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("3", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("A", "H"),
            new Card("T", "D")
        };
        hand = new TwoPairsPattern(cards2);

        assertFalse(hand.match());

        Card[] cards = {
            new Card("3", "S"),
            new Card("T", "S"),
            new Card("3", "S"),
            new Card("A", "S"),
            new Card("T", "S")
        };
        hand = new TwoPairsPattern(cards);

        assertFalse(hand.match());
    }
}
