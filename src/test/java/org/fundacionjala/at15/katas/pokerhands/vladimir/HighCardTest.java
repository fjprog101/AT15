package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCardTest {
    @Test
    public void itShouldShowHightCardWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("2", "C");
        card1[1] = new Card("3", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("J", "H");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("J", "H");
        card2[2] = new Card("7", "D");
        card2[3] = new Card("6", "S");
        card2[4] = new Card("Q", "S");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new HighCard(), blackHand, whiteHand);
        String expected = "White hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowHightCard() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("5", "C");
        card1[1] = new Card("3", "D");
        card1[2] = new Card("K", "D");
        card1[3] = new Card("J", "H");
        card1[4] = new Card("8", "S");
        HighCard highCard = new HighCard();
        Card result = highCard.getHighCard(card1);
        String res = result.combination();
        String expected = "KD";
        assertEquals(expected, res);
    }

    @Test
    public void itShouldTestIfIsHightCard() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("5", "C");
        card1[1] = new Card("6", "S");
        card1[2] = new Card("A", "H");
        card1[3] = new Card("8", "D");
        card1[4] = new Card("K", "C");
        Hand hand = new Hand(card1);
        HighCard highCard = new HighCard();
        int result = highCard.isHighCard(hand);
        int expected = 1;
        assertEquals(expected, result);
    }
}
