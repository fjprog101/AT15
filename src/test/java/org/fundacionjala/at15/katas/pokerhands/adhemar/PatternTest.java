package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {
    @Test
    public void itShouldBeAllCardsWithTheSameSuit() {
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
    public void itShouldBeContinuousCards() {
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
    public void itShouldCalculateAHighestCard() {
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
    public void itShoulBeFourOfAKind() {
        Card[] cards1 = {
            new Card("A", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isFourOfAKind());

        Card[] cards2 = {
            new Card("A", "S"),
            new Card("T", "D"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isFourOfAKind());
    }

    @Test
    public void itShouldBeFullHouse() {
        Card[] cards1 = {
            new Card("A", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isFullHouse());

        Card[] cards2 = {
            new Card("A", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("2", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isFullHouse());

        Card[] cards3 = {
            new Card("5", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("2", "D")
        };
        pattern = new Pattern(cards3);

        assertFalse(pattern.isFullHouse());
    }

    @Test
    public void itShouldBeThreeOfAKind() {
        Card[] cards1 = {
            new Card("Q", "S"),
            new Card("5", "C"),
            new Card("Q", "D"),
            new Card("Q", "H"),
            new Card("A", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isThreeOfAKind());

        Card[] cards2 = {
            new Card("Q", "S"),
            new Card("5", "C"),
            new Card("Q", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isThreeOfAKind());
    }

    @Test
    public void itShouldBeTwoPairs() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isTwoPairs());

        Card[] cards2 = {
            new Card("3", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("A", "H"),
            new Card("T", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isTwoPairs());
    }
}
