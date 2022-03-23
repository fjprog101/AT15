package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CardTest {
    @Test
    public void itShouldCorrectStringValue() {
        Card firstCard = new Card("T","D");
        Card secondCard = new Card("J","D");
        Card thirdCard = new Card("Q","D");
        Card fourthCard = new Card("K","D");
        Card fifthCard = new Card("A","D");

        assertEquals("10",firstCard.getStringValue());
        assertEquals("11",secondCard.getStringValue());
        assertEquals("12",thirdCard.getStringValue());
        assertEquals("13",fourthCard.getStringValue());
        assertEquals("14",fifthCard.getStringValue());
    }
    @Test
    public void itShouldChangeStringValueToInt() {
        Card firstCard = new Card("T","D");
        assertEquals(10,firstCard.getValue());
    }

    @Test
    public void itShouldHaveSuit() {
        Card firstCard = new Card("T","D");
        assertEquals("D", firstCard.getSuit());
    }
}




