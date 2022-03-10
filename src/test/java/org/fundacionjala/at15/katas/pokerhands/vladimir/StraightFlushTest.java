package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StraightFlushTest {
    @Test
    public void itShouldShowStraightFlushWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("10", "C");
        card1[1] = new Card("J", "C");
        card1[2] = new Card("Q", "C");
        card1[3] = new Card("K", "C");
        card1[4] = new Card("A", "C");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("9", "H");
        card2[1] = new Card("10", "H");
        card2[2] = new Card("J", "H");
        card2[3] = new Card("Q", "H");
        card2[4] = new Card("K", "H");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new StraightFlush(), blackHand, whiteHand);
        String expected = "Black hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowStraightFlushHightCard() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("10", "C");
        card1[1] = new Card("J", "C");
        card1[2] = new Card("Q", "C");
        card1[3] = new Card("K", "C");
        card1[4] = new Card("A", "C");
        StraightFlush straightFlush = new StraightFlush();
        Card result = straightFlush.getStraightFlush(card1);
        String res = result.combination();
        String expected = "AC";
        assertEquals(expected, res);
    }

    @Test
    public void itShouldTestIfIsStraightFlush() {
        Card[] card = new Card[5];
        card[0] = new Card("5", "C");
        card[1] = new Card("6", "C");
        card[2] = new Card("7", "C");
        card[3] = new Card("8", "C");
        card[4] = new Card("9", "C");
        Hand hand = new Hand(card);
        StraightFlush straightFlush = new StraightFlush();
        int result = straightFlush.itStraightFlush(hand);
        int expected = 9;
        assertEquals(expected, result);
    }
}
