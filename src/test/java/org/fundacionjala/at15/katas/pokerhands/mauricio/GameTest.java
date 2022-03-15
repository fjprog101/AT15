package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

    @Test
    public void itShouldWinHighHand() {
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

    @Test
    public void itShouldWinBlackHandBecauseAPair() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("2", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("K", "D"));
        PokerHand white = new PokerHand(new Card("2", "C"), new Card("3", "H"), new Card("4", "S"),
                new Card("8", "C"),
                new Card("A", "H"));
        Game game = new Game(black, white);
        String result = game.whoWins();
        String expected = "Black wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldWinBlackHandBecauseHasATwoPair() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("2", "D"), new Card("2", "S"),
                new Card("2", "C"),
                new Card("K", "D"));
        PokerHand white = new PokerHand(new Card("2", "C"), new Card("2", "H"), new Card("4", "S"),
                new Card("8", "C"),
                new Card("A", "H"));
        Game game = new Game(black, white);
        String result = game.whoWins();
        String expected = "Black wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldWinBlackHandBecauseHasThreeCardsOfTheSameValue() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("2", "D"), new Card("2", "S"),
                new Card("4", "C"),
                new Card("K", "D"));
        PokerHand white = new PokerHand(new Card("2", "C"), new Card("2", "H"), new Card("4", "S"),
                new Card("8", "C"),
                new Card("A", "H"));
        Game game = new Game(black, white);
        String result = game.whoWins();
        String expected = "Black wins";
        assertEquals(expected, result);
    }

    @Test
    public void itShouldWinBlackHandBecauseHasAFlush() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("3", "H"), new Card("7", "H"),
                new Card("8", "H"),
                new Card("K", "H"));
        PokerHand white = new PokerHand(new Card("2", "C"), new Card("2", "H"), new Card("2", "S"),
                new Card("8", "C"),
                new Card("A", "H"));
        Game game = new Game(black, white);
        String result = game.whoWins();
        String expected = "Black wins";
        assertEquals(expected, result);
    }

    //@Test
    public void itShouldTieTwoHands() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("3", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("K", "D"));
        PokerHand white = new PokerHand(new Card("2", "H"), new Card("3", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("A", "D"));
        Game game = new Game(black, white);
        String result = game.whoWins();
        String expected = "Tie!";

        assertEquals(expected, result);
    }



}
