package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void itShouldHaveFiveCards() {
        String[][] charCards = {{"2", "H"}
            , {"3", "D"}
            , {"5", "S"}
            , {"9", "C"}
            , {"K", "D"}};
        PokerHand thePokerHand = new PokerHand(charCards);

        assertArrayEquals(charCards, thePokerHand.getStringCards());
    }

    @Test
    public void itShouldCreateCards() {
        String[][] charCards = {{"2", "H"}
            , {"3", "D"}
            , {"5", "S"}
            , {"9", "C"}
            , {"K", "D"}};
        PokerHand thePokerHand = new PokerHand(charCards);
        Card theCard = new Card("K", "D");

        assertEquals(theCard.getSuit(), thePokerHand.getCards()[4].getSuit());
        assertEquals(theCard.getStringValue(), thePokerHand.getCards()[4].getStringValue());
        assertEquals(theCard.calculateValue(), thePokerHand.getCards()[4].calculateValue());
    }
}
