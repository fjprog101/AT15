package org.fundacionjala.at15.katas.pokerhands.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CroupierTest {

    @Test
    public void itShouldDeclareWinnerWhite() {
        // String[] black = { "2H", "3D", "5S", "9C", "KD" };
        // String[] white = { "2C", "3H", "4S", "8C", "AH" };
        int whiteValueCards = 15;
        int blackValueCards = 10;

        Croupier judge = new Croupier();
        String decision = judge.doDecision(whiteValueCards, blackValueCards);
        assertEquals("white", decision);
    }

    @Test
    public void itShouldDeclareWinnerBlack() {
        int whiteValueCards = 10;
        int blackValueCards = 15;

        Croupier judge = new Croupier();
        String decision = judge.doDecision(whiteValueCards, blackValueCards);
        assertEquals("black", decision);
    }

    @Test
    public void itShouldDeclareTie() {
        int whiteValueCards = 10;
        int blackValueCards = 10;

        Croupier judge = new Croupier();
        String decision = judge.doDecision(whiteValueCards, blackValueCards);
        assertEquals("Tie", decision);
    }
}
