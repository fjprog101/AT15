package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushPatternTest {
    @Test
    public void itShouldBeOnlyFlush() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        FlushPattern hand = new FlushPattern(cards1);

        assertFalse(hand.match());
        
        Card[] cards2 = {
            new Card("2", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        hand = new FlushPattern(cards2);

        assertTrue(hand.match());
        
        Card[] cards3 = {
            new Card("2", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "H"),
            new Card("7", "D")
        };
        hand = new FlushPattern(cards3);

        assertFalse(hand.match());
    }
}
