package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardSorterTest {
    @Test
    public void itShouldSortCards() {
        Card[] cards = {
            new Card("4", "S"),
            new Card("5", "C"),
            new Card("3", "D"),
            new Card("K", "H"),
            new Card("A", "D")
        };
        new CardSorter();
        assertEquals(3, CardSorter.sort(cards)[0].calculateValue());
        assertEquals(4, CardSorter.sort(cards)[1].calculateValue());
        assertEquals(5, CardSorter.sort(cards)[2].calculateValue());
        assertEquals(13, CardSorter.sort(cards)[3].calculateValue());
        assertEquals(14, CardSorter.sort(cards)[4].calculateValue());
    }
}
