package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.mauricio.SpadeCard;
import org.junit.Test;

public class SpadeCardTest {
    @Test
    public void itShouldHaveAValueAndASuit() {
        SpadeCard theCard = new SpadeCard("8");
        String aux = theCard.getCompletCard();
        assertEquals("8S", aux);
    }
}
