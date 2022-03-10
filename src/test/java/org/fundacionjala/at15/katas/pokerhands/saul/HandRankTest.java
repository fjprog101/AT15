package org.fundacionjala.at15.katas.pokerhands.saul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandRankTest {
    @Test
    public void itShouldHaveAValue() {
        HandRank handRank = new HandRank();

        assertEquals(0, handRank.getValue());
    }
}
