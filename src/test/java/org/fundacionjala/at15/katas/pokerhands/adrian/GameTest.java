package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

    @Test
    public void itShouldReturnTheWinnerHand() {
        Game game = new Game();
        String player1 = "Black";
        Hand hand1 = new Hand("2H 3D 5S 9C KD");
        String player2 = "White";
        Hand hand2 = new Hand("2C 3H 4S 8C AH");
        String result = game.comparePlayersHands(player1, hand1, player2, hand2);
        String expectedResult = "White wins";
        assertEquals(expectedResult, result);

        hand1.setHand("2H 4S 4C 2D 4H");
        hand2.setHand("2S 8S AS QS 3S");
        result = game.comparePlayersHands(player1, hand1, player2, hand2);
        assertEquals("Black wins", result);

        hand1.setHand("2H 3D 5S 9C KD");
        hand2.setHand("2C 3H 4S 8C KH");
        result = game.comparePlayersHands(player1, hand1, player2, hand2);
        assertEquals("Black wins", result);

        hand1.setHand("2H 3D 5S 9C KD");
        hand2.setHand("2D 3H 5C 9S KH");
        result = game.comparePlayersHands(player1, hand1, player2, hand2);
        assertEquals("Tie", result);
    }
}
