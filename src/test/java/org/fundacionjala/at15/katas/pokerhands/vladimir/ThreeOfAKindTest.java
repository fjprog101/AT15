package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void itShouldShowThreeOfAKindWinner() {
        Card[] card1 = new Card[5];
        card1[0] = new Card("Q", "C");
        card1[1] = new Card("Q", "D");
        card1[2] = new Card("4", "D");
        card1[3] = new Card("J", "H");
        card1[4] = new Card("Q", "S");
        Hand blackHand = new Hand(card1);
        Card[] card2 = new Card[5];
        card2[0] = new Card("K", "C");
        card2[1] = new Card("A", "H");
        card2[2] = new Card("A", "D");
        card2[3] = new Card("6", "S");
        card2[4] = new Card("A", "S");
        Hand whiteHand = new Hand(card2);
        Game game = new Game();
        String result = game.playGame(new ThreeOfAKind(), blackHand, whiteHand);
        String expected = "White hand wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldShowThreeOfAKindCardsValue() {
        Card[] card = new Card[5];
        card[0] = new Card("A", "C");
        card[1] = new Card("K", "H");
        card[2] = new Card("K", "D");
        card[3] = new Card("K", "H");
        card[4] = new Card("3", "S");
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        Card result = threeOfAKind.getThree(card);
        int res = result.getValue();
        int expected = 13;
        assertEquals(expected, res);
    }

    @Test
    public void itShouldTestIfIsThreeOfAKind() {
        Card[] card = new Card[5];
        card[0] = new Card("A", "C");
        card[1] = new Card("Q", "D");
        card[2] = new Card("Q", "D");
        card[3] = new Card("9", "H");
        card[4] = new Card("Q", "S");
        Hand hand = new Hand(card);
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        int result = threeOfAKind.isThreeOfAKind(hand);
        int expected = 4;
        assertEquals(expected, result);
    }
}
