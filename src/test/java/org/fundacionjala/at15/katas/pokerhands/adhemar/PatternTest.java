package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {
    @Test
    public void itShouldHaveAllCardsWithTheSameSuit() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isAllSameSuit());
        
        Card[] cards2 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "C"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isAllSameSuit());
    }

    @Test
    public void itShouldHaveContinuousCards() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isContinuous());

        Card[] cards2 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("8", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isContinuous());
    }

    @Test
    public void itShouldHaveAHighestCard() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("6", "H"),
            new Card("Q", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertEquals(14, pattern.calculateTheHighestCard());
    }

    @Test
    public void itShoulCountSameValueCards() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("3", "H"),
            new Card("3", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertEquals(3, pattern.countSameValue());
    }
}
