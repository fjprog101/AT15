package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
    @Test
    public void itShouldHaveASuitAndACharValue() {
        char suit = 'C';
        char charValue = '2';
        Card theCard = new Card(charValue, suit);

        assertEquals(suit, theCard.getSuit());
        assertEquals(charValue, theCard.getCharValue());
    }

    @Test
    public void itShouldCalculateValue() {
        char suit = 'C';
        char charValue = 'T';
        int value = 10;
        Card theCard = new Card(charValue, suit);

        assertEquals(value, theCard.calculateValue());
    }
}
