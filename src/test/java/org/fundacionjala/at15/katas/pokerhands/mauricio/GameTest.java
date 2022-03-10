package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

    @Test
    public void itShouldHaveTwoHands() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("3", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("K", "D"));
        PokerHand white = new PokerHand(new Card("2", "C"), new Card("3", "H"), new Card("4", "S"),
                new Card("8", "C"),
                new Card("A", "H"));
        Game game = new Game(black, white);
        String result = game.whoWins();
        String expected = "White wins";

        assertEquals(expected, result);
    }

}
