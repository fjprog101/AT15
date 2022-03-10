package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlushTest {
    @Test
    public void itShouldShowFlushWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("2", "S");
        card1[1] = new Card("3", "S");
        card1[2] = new Card("4", "S");
        card1[3] = new Card("J", "S");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("J", "C");
        card2[2] = new Card("7", "C");
        card2[3] = new Card("6", "C");
        card2[4] = new Card("Q", "C");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new Flush(), blackHand, whiteHand);
        String expected = "White hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldFlushCard() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("5", "C");
        card1[1] = new Card("3", "C");
        card1[2] = new Card("K", "C");
        card1[3] = new Card("J", "C");
        card1[4] = new Card("8", "S");
        Flush flush = new Flush();
        Card result = flush.getFlush(card1);
        String res = result.combination();
        String expected = "KC";
        assertEquals(expected, res);
    }
}
