package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

    @Test
    public void itShouldReturnTheWinnerHand() {
        //Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH
        //White wins. - with high card: Ace
        Game game = new Game();
        String player1 = "Black";
        String hand1 = "2H 3D 5S 9C KD";
        String player2 = "White";
        String hand2 = "2C 3H 4S 8C AH";
        String result = game.comparePlayersHands(player1, hand1, player2, hand2);
        String expectedResult = "White wins";
        assertEquals(expectedResult, result);

        String hand3 = "1H 2D 3S 4C 9D";
        String hand4 = "2C 3H 8S 7C 6H";
        String result2 = game.comparePlayersHands(player1, hand3, player2, hand4);
        String expectedResult2 = "Black wins";
        assertEquals(expectedResult2, result2);
    }
}