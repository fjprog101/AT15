package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindPatternTest {
    @Test
    public void itShoulBeFourOfAKind() {
        Card[] cards1 = {
            new Card("A", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        FourOfAKindPattern hand = new FourOfAKindPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("A", "S"),
            new Card("T", "D"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        hand = new FourOfAKindPattern(cards2);

        assertFalse(hand.match());
    }
}
