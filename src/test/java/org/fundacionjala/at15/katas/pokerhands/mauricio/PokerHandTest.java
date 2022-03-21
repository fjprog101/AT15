package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {

    @Test
    public void highCardFromAHand() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("3", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("K", "D"));
        int highNumber = 12;
        int resultHand = black.getPokerHandScore();
        assertEquals(highNumber, resultHand);
    }

    @Test
    public void pairFromAHand() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("2", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("K", "D"));
        int highNumber = 7;
        int resultHand = black.getPairCardsScore();
        assertEquals(highNumber, resultHand);
    }

    @Test
    public void twoPairFromAHand() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("2", "D"), new Card("2", "S"),
                new Card("2", "C"),
                new Card("K", "D"));
        int highNumber = 17;
        int resultHand = black.getPairCardsScore();
        assertEquals(highNumber, resultHand);
    }

    @Test
    public void flushFromAHand() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("3", "H"), new Card("5", "H"),
                new Card("9", "H"),
                new Card("K", "H"));
        int highNumber = 50;
        int resultHand = black.getFlushScore();
        assertEquals(highNumber, resultHand);
    }

}
