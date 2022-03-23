package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test
    public void itShouldHavePlayers() {
        Player[] players = {
            new Player("Black", "KH KH KC KD AH"),
            new Player("White", "7H AD JS JC AD")
        };
        Game theGame = new Game(players);

        assertEquals(2, theGame.getPlayers().length);
    }

    @Test
    public void itShouldGetAWinner() {
        Player[] players = {
            new Player("Black", "2H 3D 5S 9C KD"),
            new Player("White", "2C 2H 4S 8C AH")
        };
        Game theGame = new Game(players);

        assertEquals("White", theGame.getWinner().getName());
        assertEquals("pair", theGame.getWinner().getPokerHand().getHand().getHandName());
        assertEquals("White wins. - with pair", theGame.getResult());
    }

    @Test
    public void itShouldBeTie() {
        Player[] players = {
            new Player("Black", "2H 3D 5S 9C KD"),
            new Player("White", "2C 3H 4S 8C AH")
        };
        Game theGame = new Game(players);

        assertEquals("Tie.", theGame.getResult());
    }
}
