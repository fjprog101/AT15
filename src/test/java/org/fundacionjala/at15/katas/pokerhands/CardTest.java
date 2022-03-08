package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.mauricio.Card;
import org.junit.Test;

public class CardTest {
    @Test
    public void itShouldHaveAValueAndASuit() {
        Card theCard = new Card("8", "D");

        String aux = theCard.getMixCard();
        assertEquals("8D", aux);
    }
}
