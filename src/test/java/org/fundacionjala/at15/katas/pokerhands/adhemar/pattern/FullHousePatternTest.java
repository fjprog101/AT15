package org.fundacionjala.at15.katas.pokerhands.adhemar.pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.fundacionjala.at15.katas.pokerhands.adhemar.Card;
import org.junit.Test;

public class FullHousePatternTest {
    @Test
    public void itShouldBeFullHouse() {
        Card[] cards1 = {
            new Card("A", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        FullHousePattern hand = new FullHousePattern(cards1);

        assertTrue(hand.match());

        Card[] cards2 = {
            new Card("A", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("2", "D")
        };
        hand = new FullHousePattern(cards2);

        assertFalse(hand.match());

        Card[] cards3 = {
            new Card("5", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("2", "D")
        };
        hand = new FullHousePattern(cards3);

        assertFalse(hand.match());
    }
}
