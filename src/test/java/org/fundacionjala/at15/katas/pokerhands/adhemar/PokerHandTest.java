package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void itShouldHaveFiveCards() {
        char[][] charCards = {{'2', 'H'}
            , {'3', 'D'}
            , {'5', 'S'}
            , {'9', 'C'}
            , {'K', 'D'}};
        PokerHand thePokerHand = new PokerHand(charCards);

        assertArrayEquals(charCards, thePokerHand.getCharCards());
    }
}
