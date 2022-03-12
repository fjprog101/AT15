package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrightTest {
    @Test
    public void itShouldShowStraightWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("10", "C");
        card1[1] = new Card("J", "D");
        card1[2] = new Card("Q", "D");
        card1[3] = new Card("K", "H");
        card1[4] = new Card("A", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("8", "C");
        card2[1] = new Card("9", "H");
        card2[2] = new Card("10", "D");
        card2[3] = new Card("J", "S");
        card2[4] = new Card("Q", "S");
        Hand whiteHand = new Hand(card2);
        SameKindOfHand game = new SameKindOfHand();
        String result = game.sameHand(new Straight(), blackHand, whiteHand);
        String expected = "Black hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowHightCard() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("2", "C");
        card1[1] = new Card("3", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("5", "H");
        card1[4] = new Card("6", "S");
        Straight straight = new Straight();
        Card result = straight.getStraight(card1);
        String res = result.combination();
        String expected = "6S";
        assertEquals(expected, res);
    }

    @Test
    public void itShouldTestIfIsStraight() {
        Card[] card = new Card[5];
        card[0] = new Card("10", "C");
        card[1] = new Card("J", "D");
        card[2] = new Card("Q", "C");
        card[3] = new Card("K", "S");
        card[4] = new Card("A", "C");
        Hand hand = new Hand(card);
        Straight straight = new Straight();
        int result = straight.isStraight(hand);
        int expected = 5;
        assertEquals(expected, result);
    }
}
