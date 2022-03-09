package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.vladimir.Card;
import org.junit.Test;

public class cardtest {
    @Test
    public void itShouldJoinValueAndSuit() {
        Card card = new Card('A', 'C');
        String expectedUnion = "AC";
        assertEquals(expectedUnion, card.joinSuitValue());
    }
}
