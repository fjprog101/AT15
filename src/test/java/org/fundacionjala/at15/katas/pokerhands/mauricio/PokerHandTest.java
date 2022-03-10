package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {


    @Test
    public void highCardFromAHands() {
        PokerHand black = new PokerHand(new Card("2", "H"), new Card("3", "D"), new Card("5", "S"),
                new Card("9", "C"),
                new Card("K", "D"));
        int highNumber = 12;
        int resultHand = black.getPokerHandScore();
        assertEquals(highNumber, resultHand);

    }

}
