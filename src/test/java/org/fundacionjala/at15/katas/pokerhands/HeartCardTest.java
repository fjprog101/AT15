package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.katas.pokerhands.mauricio.HeartCard;
import org.junit.Test;

public class HeartCardTest {
    @Test
    public void itShouldHaveAValueAndASuit() {
        HeartCard theCard = new HeartCard("8");
        String aux = theCard.getCompletCard();
        assertEquals("8H", aux);
    }
}
