package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CroupierTest {

    @Test
    public void itShouldDecideWinner() {
        String[] black = { "2H", "3D", "5S", "9C", "KD" };
        String[] white = { "2C", "3H", "4S", "8C", "AH" };
        int whiteValueCards = 15;
        int blackValueCards = 10;

        Croupier judge = new Croupier();
        String decision = judge.doDecision(whiteValueCards, blackValueCards);

        assertEquals("white", decision);
    }

}
