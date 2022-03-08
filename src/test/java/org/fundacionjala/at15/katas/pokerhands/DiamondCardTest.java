package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.mauricio.DiamondCard;
import org.junit.Test;

public class DiamondCardTest {
    @Test
    public void itShouldHaveAValueAndASuit() {
        DiamondCard theCard = new DiamondCard("8");
        String aux = theCard.getCompletCard();
        assertEquals("8D", aux);
    }
}
