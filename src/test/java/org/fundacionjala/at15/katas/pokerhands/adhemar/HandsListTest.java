package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandsListTest {
    @Test
    public void itShouldRank() {
        HandsList hand = HandsList.FLUSH;

        assertEquals(6, hand.getRank());
    }
}
