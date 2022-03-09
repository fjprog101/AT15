package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
    @Test
    public void itShouldHaveASuitAndACharValue() {
        String suit = "C";
        String charValue = "2";
        Card theCard = new Card(charValue, suit);

        assertEquals(suit, theCard.getSuit());
        assertEquals(charValue, theCard.getStringValue());
    }

    @Test
    public void itShouldCalculateValue() {
        int value = 2;
        Card theCard = new Card("2", "C");

        assertEquals(value, theCard.calculateValue());

        value = 3;
        theCard = new Card("3", "C");

        assertEquals(value, theCard.calculateValue());

        value = 4;
        theCard = new Card("4", "C");

        assertEquals(value, theCard.calculateValue());

        value = 5;
        theCard = new Card("5", "C");

        assertEquals(value, theCard.calculateValue());

        value = 6;
        theCard = new Card("6", "C");

        assertEquals(value, theCard.calculateValue());

        value = 7;
        theCard = new Card("7", "C");

        assertEquals(value, theCard.calculateValue());

        value = 8;
        theCard = new Card("8", "C");

        assertEquals(value, theCard.calculateValue());

        value = 9;
        theCard = new Card("9", "C");

        assertEquals(value, theCard.calculateValue());

        value = 10;
        theCard = new Card("T", "C");

        assertEquals(value, theCard.calculateValue());

        value = 11;
        theCard = new Card("J", "C");

        assertEquals(value, theCard.calculateValue());

        value = 12;
        theCard = new Card("Q", "C");

        assertEquals(value, theCard.calculateValue());

        value = 13;
        theCard = new Card("K", "C");

        assertEquals(value, theCard.calculateValue());

        value = 14;
        theCard = new Card("A", "C");

        assertEquals(value, theCard.calculateValue());

        value = 0;
        theCard = new Card("B", "C");

        assertEquals(value, theCard.calculateValue());
    }
}
