package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class pokerHandTest {

    @Test
    public void itShouldReturnTheHighestHand() {
        Game game = new Game();
        String player1 = "Black";
        String hand1 = "2H 3D 5S 7C 6D";
        String player2 = "White";
        String hand2 = "2C 3H 4S 6C 9H";
        String result = game.comparePlayersHands(player1, hand1, player2, hand2);
        String expectedResult = "White wins";
        assertEquals(expectedResult, result);
    }
}
