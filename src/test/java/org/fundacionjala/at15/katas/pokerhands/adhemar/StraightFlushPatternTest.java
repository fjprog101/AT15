package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StraightFlushPatternTest {
    @Test
    public void itShouldBeStraightFlush() {
        Card[] cards1 = {
            new Card("9", "C"),
            new Card("T", "C"),
            new Card("J", "C"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        StraightFlushPattern hand = new StraightFlushPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("8", "C"),
            new Card("T", "C"),
            new Card("J", "C"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        hand = new StraightFlushPattern(cards2);

        assertFalse(hand.match());

        Card[] cards3 = {
            new Card("9", "C"),
            new Card("T", "H"),
            new Card("J", "D"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        hand = new StraightFlushPattern(cards3);

        assertFalse(hand.match());
    }
}
