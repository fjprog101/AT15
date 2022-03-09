package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.mauricio.ClubCard;
import org.junit.Test;

public class ClubCardTest {
    @Test
    public void itShouldHaveAValueAndASuit() {
        ClubCard theCard = new ClubCard("8");
        String aux = theCard.getCompletCard();
        assertEquals("8C", aux);
    }
}
