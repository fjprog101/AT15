package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindPatternTest {
    @Test
    public void itShouldBeThreeOfAKind() {
        Card[] cards1 = {
            new Card("Q", "S"),
            new Card("5", "C"),
            new Card("Q", "D"),
            new Card("Q", "H"),
            new Card("A", "D")
        };
        ThreeOfAKindPattern hand = new ThreeOfAKindPattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("Q", "S"),
            new Card("5", "C"),
            new Card("Q", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        hand = new ThreeOfAKindPattern(cards2);

        assertFalse(hand.match());

        Card[] cards3 = {
            new Card("Q", "D"),
            new Card("5", "D"),
            new Card("Q", "D"),
            new Card("A", "D"),
            new Card("Q", "D")
        };
        hand = new ThreeOfAKindPattern(cards3);

        assertFalse(hand.match());
    }
}
