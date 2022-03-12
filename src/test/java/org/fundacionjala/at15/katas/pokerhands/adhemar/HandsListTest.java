package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandsListTest {
    @Test
    public void itShouldRank() {
        Hand hand = Hand.FLUSH;

        assertEquals(6, hand.getRank());
    }
}
