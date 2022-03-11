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
        PokerHand hand = new PokerHand(cards1);

        assertEquals(14, hand.calculateTheHighestCard());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isHighCard());

        Card[] cards2 = {
            new Card("4", "S"),
            new Card("4", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isHighCard());

        Card[] cards3 = {
            new Card("4", "S"),
            new Card("J", "S"),
            new Card("3", "S"),
            new Card("K", "S"),
            new Card("A", "S")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isHighCard());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isPair());

        Card[] cards2 = {
            new Card("3", "S"),
            new Card("3", "C"),
            new Card("3", "D"),
            new Card("3", "H"),
            new Card("T", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isPair());

        Card[] cards3 = {
            new Card("3", "S"),
            new Card("3", "C"),
            new Card("5", "D"),
            new Card("5", "H"),
            new Card("T", "D")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isPair());

        Card[] cards4 = {
            new Card("3", "S"),
            new Card("4", "C"),
            new Card("5", "D"),
            new Card("6", "H")
        };
        hand = new PokerHand(cards4);

        assertFalse(hand.isPair());

        Card[] cards5 = {
            new Card("3", "D"),
            new Card("3", "D"),
            new Card("5", "D"),
            new Card("Q", "D"),
            new Card("T", "D")
        };
        hand = new PokerHand(cards5);

        assertFalse(hand.isPair());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isTwoPairs());

        Card[] cards2 = {
            new Card("3", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("A", "H"),
            new Card("T", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isTwoPairs());

        Card[] cards = {
            new Card("3", "S"),
            new Card("T", "S"),
            new Card("3", "S"),
            new Card("A", "S"),
            new Card("T", "S")
        };
        hand = new PokerHand(cards);

        assertFalse(hand.isTwoPairs());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isThreeOfAKind());

        Card[] cards2 = {
            new Card("Q", "S"),
            new Card("5", "C"),
            new Card("Q", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isThreeOfAKind());

        Card[] cards3 = {
            new Card("Q", "D"),
            new Card("5", "D"),
            new Card("Q", "D"),
            new Card("A", "D"),
            new Card("Q", "D")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isThreeOfAKind());
    }

    @Test
    public void itShouldBeOnlyStraight() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "C"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isOnlyStraight());

        Card[] cards2 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "C"),
            new Card("6", "D"),
            new Card("8", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isOnlyStraight());

        Card[] cards3 = {
            new Card("T", "D"),
            new Card("J", "D"),
            new Card("Q", "D"),
            new Card("K", "D"),
            new Card("A", "D")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isOnlyStraight());

        Card[] cards4 = {
            new Card("T", "D"),
            new Card("K", "H"),
            new Card("J", "D"),
            new Card("Q", "D"),
            new Card("A", "D")
        };
        hand = new PokerHand(cards4);

        assertTrue(hand.isOnlyStraight());
    }

    @Test
    public void itShouldBeOnlyFlush() {
        Card[] cards1 = {
            new Card("3", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        PokerHand hand = new PokerHand(cards1);

        assertFalse(hand.isOnlyFlush());
        
        Card[] cards2 = {
            new Card("2", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "D"),
            new Card("7", "D")
        };
        hand = new PokerHand(cards2);

        assertTrue(hand.isOnlyFlush());
        
        Card[] cards3 = {
            new Card("2", "D"),
            new Card("4", "D"),
            new Card("5", "D"),
            new Card("6", "H"),
            new Card("7", "D")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isOnlyFlush());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isFullHouse());

        Card[] cards2 = {
            new Card("A", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("2", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isFullHouse());

        Card[] cards3 = {
            new Card("5", "S"),
            new Card("5", "C"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("2", "D")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isFullHouse());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isFourOfAKind());

        Card[] cards2 = {
            new Card("A", "S"),
            new Card("T", "D"),
            new Card("5", "D"),
            new Card("A", "H"),
            new Card("A", "D")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isFourOfAKind());
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
        PokerHand hand = new PokerHand(cards1);

        assertTrue(hand.isStraightFlush());

        Card[] cards2 = {
            new Card("8", "C"),
            new Card("T", "C"),
            new Card("J", "C"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        hand = new PokerHand(cards2);

        assertFalse(hand.isStraightFlush());

        Card[] cards3 = {
            new Card("9", "C"),
            new Card("T", "H"),
            new Card("J", "D"),
            new Card("Q", "C"),
            new Card("K", "C")
        };
        hand = new PokerHand(cards3);

        assertFalse(hand.isStraightFlush());
    }
}
