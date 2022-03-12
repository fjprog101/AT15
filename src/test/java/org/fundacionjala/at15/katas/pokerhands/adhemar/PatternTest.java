package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PatternTest {
    @Test
    public void itShouldCalculateAHighestCard() {
        Card[] cards = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("6", "H"),
            new Card("Q", "D")
        };

        assertEquals(14, Pattern.calculateTheHighestCard(cards).getIntValue());
        assertEquals("A", Pattern.calculateTheHighestCard(cards).getStringValue());
        assertEquals("D", Pattern.calculateTheHighestCard(cards).getSuit());
    }
}
