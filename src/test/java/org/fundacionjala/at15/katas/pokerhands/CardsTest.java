package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardsTest {
    @Test
    public void itShouldHaveCard(){
        String input = "JD";
        Card card = new Card(input);
        assertEquals(11, card.getValue());
        assertEquals('D', card.getSuit());
    }
}
