package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
    @Test
    public void itShouldHaveASuitAndACharValue() {
        char suit = 'C';
        char charValue = '2';
        Card theCard = new Card(suit, charValue);

        assertEquals(suit, theCard.getSuit());
        assertEquals(charValue, theCard.getCharValue());
    }
}
