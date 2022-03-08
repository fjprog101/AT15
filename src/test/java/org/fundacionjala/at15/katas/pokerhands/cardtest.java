package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class cardtest {
    @Test
    public void itShouldJoinValueAndSuit() {
        Card card = new Card('C', 'A');
        String expectedUnion = "AC";
        assertEquals(expectedUnion, card.joinSuitValue());
    }
}
