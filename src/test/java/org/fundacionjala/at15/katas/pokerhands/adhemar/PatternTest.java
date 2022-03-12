package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PatternTest {
    @Test
    public void itShouldCalculateAHighestCard() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("6", "H"),
            new Card("Q", "D")
        };
        Pattern hand = new HighCardPattern(cards1);

        assertEquals(14, hand.calculateTheHighestCard());
    }
}
