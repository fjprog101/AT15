package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {
    @Test
    public void itShouldHaveAllCardsWithTheSameSuit() {
        Card[] cards1 = {
            new Card('3', 'D'),
            new Card('4', 'D'),
            new Card('5', 'D'),
            new Card('6', 'D'),
            new Card('7', 'D')
        };
        Pattern ranker = new Pattern(cards1);

        assertTrue(ranker.isAllSameSuit());
        
        Card[] cards2 = {
            new Card('3', 'D'),
            new Card('4', 'D'),
            new Card('5', 'C'),
            new Card('6', 'D'),
            new Card('7', 'D')
        };
        ranker = new Pattern(cards2);

        assertFalse(ranker.isAllSameSuit());
    }

    @Test
    public void itShouldHaveContinuousCards() {
        Card[] cards1 = {
            new Card('3', 'D'),
            new Card('4', 'D'),
            new Card('5', 'D'),
            new Card('6', 'D'),
            new Card('7', 'D')
        };
        Pattern ranker = new Pattern(cards1);

        assertTrue(ranker.isContinuous());

        Card[] cards2 = {
            new Card('3', 'D'),
            new Card('4', 'D'),
            new Card('5', 'D'),
            new Card('6', 'D'),
            new Card('8', 'D')
        };
        ranker = new Pattern(cards2);

        assertFalse(ranker.isContinuous());
    }

    @Test
    public void itShouldHaveAHighestCard() {
        Card[] cards1 = {
            new Card('3', 'S'),
            new Card('A', 'D'),
            new Card('5', 'D'),
            new Card('6', 'H'),
            new Card('Q', 'D')
        };
        Pattern ranker = new Pattern(cards1);

        assertEquals(14, ranker.calculateTheHighestCard());
    }
}
