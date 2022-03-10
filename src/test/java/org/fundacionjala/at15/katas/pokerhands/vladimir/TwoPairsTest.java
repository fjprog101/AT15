package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoPairsTest {
    @Test
    public void itShouldShowTwoPairsWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("7", "C");
        card1[1] = new Card("7", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("Q", "H");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("J", "H");
        card2[2] = new Card("7", "D");
        card2[3] = new Card("K", "S");
        card2[4] = new Card("7", "S");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new TwoPairs(), blackHand, whiteHand);
        String expected = "White hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowTwoPairsCards() {
        Card[] card = new Card[5];
        card[0] = new Card("K", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("K", "D");
        card[3] = new Card("8", "H");
        card[4] = new Card("8", "S");
        TwoPairs twoPairs = new TwoPairs();
        Card[] result = new Card[2];
        result = twoPairs.getTwoPairs(card);
        String res1 = result[0].combination();
        String res2 = result[1].combination();
        String expected1 = "8H";
        String expected2 = "KC";
        assertEquals(expected1, res1);
        assertEquals(expected2, res2);
    }

    @Test
    public void itShouldTestIfIsTwoPair() {
        Card[] card = new Card[5];
        card[0] = new Card("A", "C");
        card[1] = new Card("A", "D");
        card[2] = new Card("Q", "D");
        card[3] = new Card("8", "H");
        card[4] = new Card("8", "S");
        Hand hand = new Hand(card);
        TwoPairs twoPairs = new TwoPairs();
        int result = twoPairs.isTwoPair(hand);
        int expected = 1;
        assertEquals(expected, result);
    }
}
