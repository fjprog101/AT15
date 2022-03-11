package org.fundacionjala.at15.katas.pokerhands.agustin;
import org.fundacionjala.at15.katas.pokerhands.agustin.Cards.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    @Test
    public void itShouldHaveCorrectValue() {
        String suit = "C";
        int value = 8;
        String notation = "8";

        Card card = new Card();
        card.setValue(Notation.EIGHT.getValue());
        card.setSuit(Suit.CLUB.getSuit());
        card.setNotation(Notation.EIGHT.getNotation());

        assertEquals(suit, card.getSuit());
        assertEquals(value, card.getValue());
        assertEquals(notation, card.getNotation());
    }
}
