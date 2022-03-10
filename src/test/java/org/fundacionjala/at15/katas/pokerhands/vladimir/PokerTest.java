package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerTest {
    @Test
    public void itShouldShowThreeOfAKindWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("Q", "C");
        card1[1] = new Card("Q", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("Q", "H");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("5", "H");
        card2[2] = new Card("5", "D");
        card2[3] = new Card("5", "S");
        card2[4] = new Card("5", "S");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new Poker(), blackHand, whiteHand);
        String expected = "Black hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowPokerCardsValue() {
        Card[] card = new Card[5];
        card[0] = new Card("Q", "C");
        card[1] = new Card("Q", "H");
        card[2] = new Card("Q", "D");
        card[3] = new Card("K", "S");
        card[4] = new Card("Q", "S");
        Poker poker = new Poker();
        Card result = poker.getPoker(card);
        int res = result.getValue();
        int expected = 12;
        assertEquals(expected, res);
    }

    @Test
    public void itShouldTestIfIsPoker() {
        Card[] card = new Card[5];
        card[0] = new Card("A", "C");
        card[1] = new Card("A", "S");
        card[2] = new Card("A", "D");
        card[3] = new Card("A", "H");
        card[4] = new Card("8", "S");
        Hand hand = new Hand(card);
        Poker poker = new Poker();
        int result = poker.isPoker(hand);
        int expected = 5;
        assertEquals(expected, result);
    }
}
