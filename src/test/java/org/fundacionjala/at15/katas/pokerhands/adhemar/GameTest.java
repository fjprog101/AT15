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
}
