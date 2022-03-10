package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {
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
    public void itShouldBeHighCard() {
        Card[] cards1 = {
            new Card("4", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isHighCard());

        Card[] cards2 = {
            new Card("4", "S"),
            new Card("4", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isHighCard());

        Card[] cards3 = {
            new Card("4", "S"),
            new Card("J", "S"),
            new Card("3", "S"),
            new Card("K", "S"),
            new Card("A", "S")
        };
        pattern = new Pattern(cards3);

        assertFalse(pattern.isHighCard());
    }

    @Test
    public void itShouldBePair() {
        Card[] cards1 = {
            new Card("4", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("4", "H"),
            new Card("A", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isPair());

        Card[] cards2 = {
            new Card("3", "S"),
            new Card("3", "C"),
            new Card("3", "D"),
            new Card("3", "H"),
            new Card("T", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isPair());

        Card[] cards3 = {
            new Card("3", "S"),
            new Card("3", "C"),
            new Card("5", "D"),
            new Card("5", "H"),
            new Card("T", "D")
        };
        pattern = new Pattern(cards3);

        assertFalse(pattern.isPair());

        Card[] cards4 = {
            new Card("3", "S"),
            new Card("4", "C"),
            new Card("5", "D"),
            new Card("6", "H")
        };
        pattern = new Pattern(cards4);

        assertFalse(pattern.isPair());

        Card[] cards5 = {
            new Card("3", "D"),
            new Card("3", "D"),
            new Card("5", "D"),
            new Card("Q", "D"),
            new Card("T", "D")
        };
        pattern = new Pattern(cards5);

        assertFalse(pattern.isPair());
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

        Card[] cards = {
            new Card("3", "S"),
            new Card("T", "S"),
            new Card("3", "S"),
            new Card("A", "S"),
            new Card("T", "S")
        };
        pattern = new Pattern(cards);

        assertFalse(pattern.isTwoPairs());
    }

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

        assertTrue(pattern.isFlush());
        
        Card[] cards2 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "C"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isFlush());
    }

    @Test
    public void itShouldBeStraight() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "C"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isStraight());

        Card[] cards2 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "C"),
            new Card("6", "D"),
            new Card("8", "D")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isStraight());
    }

    @Test
    public void itShouldBeStraightFlush() {
        Card[] cards1 = {
            new Card("9", "C"),
            new Card("T", "C"),
            new Card("J", "C"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        Pattern pattern = new Pattern(cards1);

        assertTrue(pattern.isStraightFlush());

        Card[] cards2 = {
            new Card("8", "C"),
            new Card("T", "C"),
            new Card("J", "C"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        pattern = new Pattern(cards2);

        assertFalse(pattern.isStraightFlush());

        Card[] cards3 = {
            new Card("9", "C"),
            new Card("T", "H"),
            new Card("J", "D"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        pattern = new Pattern(cards3);

        assertFalse(pattern.isStraightFlush());
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
}
