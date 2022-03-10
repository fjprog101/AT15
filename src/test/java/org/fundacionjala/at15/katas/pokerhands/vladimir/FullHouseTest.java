package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FullHouseTest {
    @Test
    public void itShouldShowFullHouseWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("10", "D");
        card1[1] = new Card("J", "D");
        card1[2] = new Card("Q", "D");
        card1[3] = new Card("K", "D");
        card1[4] = new Card("A", "D");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("8", "S");
        card2[1] = new Card("9", "S");
        card2[2] = new Card("10", "S");
        card2[3] = new Card("J", "S");
        card2[4] = new Card("Q", "S");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new FullHouse(), blackHand, whiteHand);
        String expected = "Black hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowFullHouseHighCardValue() {
        Card[] card = new Card[5];
        card[0] = new Card("A", "C");
        card[1] = new Card("K", "H");
        card[2] = new Card("K", "D");
        card[3] = new Card("K", "H");
        card[4] = new Card("A", "S");
        FullHouse fullHouse = new FullHouse();
        Card result = fullHouse.getFullHouse(card);
        int res = result.getValue();
        int expected = 13;
        assertEquals(expected, res);
    }

    @Test
    public void itShouldTestIfIsFullHouse() {
        Card[] card = new Card[5];
        card[0] = new Card("8", "C");
        card[1] = new Card("8", "D");
        card[2] = new Card("Q", "H");
        card[3] = new Card("Q", "H");
        card[4] = new Card("8", "S");
        Hand hand = new Hand(card);
        FullHouse fullHouse = new FullHouse();
        int result = fullHouse.isFullHouse(hand);
        int expected = 7;
        assertEquals(expected, result);
    }
}
