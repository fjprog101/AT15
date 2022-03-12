package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardGeneratorTest {
    @Test
    public void itShouldGenerateCards() {
        String[] stringHand = {"2C","4D", "6H", "8S", "TC"};

        CardGenerator theCards = new CardGenerator(stringHand);

        assertEquals(2, theCards.getCards()[0].getIntValue());
        assertEquals("2", theCards.getCards()[0].getStringValue());
        assertEquals("C", theCards.getCards()[0].getSuit());
    }
}
