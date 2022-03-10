package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PairTest {
    @Test
    public void itShouldShowPairWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("A", "C");
        card1[1] = new Card("A", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("J", "H");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("J", "H");
        card2[2] = new Card("7", "D");
        card2[3] = new Card("6", "S");
        card2[4] = new Card("J", "S");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new Pair(), blackHand, whiteHand);
        String expected = "Black hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowPairCard() {
        Card[] card = new Card[5];
        card[0] = new Card("5", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("K", "D");
        card[3] = new Card("8", "H");
        card[4] = new Card("8", "S");
        Pair pair = new Pair();
        Card result = pair.getPair(card);
        String res = result.combination();
        String expected = "8H";
        assertEquals(expected, res);
    }
}
