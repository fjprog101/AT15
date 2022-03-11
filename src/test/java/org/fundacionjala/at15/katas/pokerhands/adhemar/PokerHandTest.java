package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void itShouldHaveFiveCards() {
        String[][] stringCards = {{"2", "H"}
            , {"3", "D"}
            , {"5", "S"}
            , {"9", "C"}
            , {"K", "D"}};
        PokerHand thePokerHand = new PokerHand(new CardGenerator(stringCards).getCards());

        assertEquals(5, thePokerHand.getCards().length);
    }

    @Test
    public void itShouldCreateCards() {
        String[][] stringCards = {{"2", "H"}
            , {"3", "D"}
            , {"5", "S"}
            , {"9", "C"}
            , {"K", "D"}};
        PokerHand thePokerHand = new PokerHand(new CardGenerator(stringCards).getCards());
        Card theCard = new Card("K", "D");

        assertEquals(theCard.getSuit(), thePokerHand.getCards()[4].getSuit());
        assertEquals(theCard.getStringValue(), thePokerHand.getCards()[4].getStringValue());
        assertEquals(theCard.getIntValue(), thePokerHand.getCards()[4].getIntValue());
    }

    @Test
    public void isShouldDefineHand() {
        String[][] stringCards1 = {{"2", "H"}
            , {"K", "D"}
            , {"J", "S"}
            , {"Q", "C"}
            , {"A", "D"}};
        PokerHand thePokerHand = new PokerHand(new CardGenerator(stringCards1).getCards());

        assertEquals("high card", thePokerHand.defineHand());

        String[][] stringCards2 = {{"2", "H"}
            , {"K", "D"}
            , {"J", "S"}
            , {"J", "C"}
            , {"A", "D"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards2).getCards());

        assertEquals("pair", thePokerHand.defineHand());

        String[][] stringCards3 = {{"2", "H"}
            , {"A", "D"}
            , {"J", "S"}
            , {"J", "C"}
            , {"A", "D"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards3).getCards());

        assertEquals("two pairs", thePokerHand.defineHand());

        String[][] stringCards4 = {{"A", "H"}
            , {"A", "D"}
            , {"J", "S"}
            , {"5", "C"}
            , {"A", "D"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards4).getCards());

        assertEquals("three of a kind", thePokerHand.defineHand());

        String[][] stringCards5 = {{"8", "H"}
            , {"7", "D"}
            , {"6", "S"}
            , {"5", "C"}
            , {"4", "D"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards5).getCards());

        assertEquals("straight", thePokerHand.defineHand());

        String[][] stringCards6 = {{"8", "H"}
            , {"7", "H"}
            , {"6", "H"}
            , {"A", "H"}
            , {"4", "H"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards6).getCards());

        assertEquals("flush", thePokerHand.defineHand());

        String[][] stringCards7 = {{"8", "H"}
            , {"8", "H"}
            , {"8", "C"}
            , {"A", "D"}
            , {"A", "H"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards7).getCards());

        assertEquals("full house", thePokerHand.defineHand());

        String[][] stringCards8 = {{"8", "H"}
            , {"8", "H"}
            , {"8", "C"}
            , {"8", "D"}
            , {"A", "H"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards8).getCards());

        assertEquals("four of a kind", thePokerHand.defineHand());

        String[][] stringCards9 = {{"J", "H"}
            , {"T", "H"}
            , {"9", "H"}
            , {"8", "H"}
            , {"7", "H"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards9).getCards());

        assertEquals("straight flush", thePokerHand.defineHand());

        String[][] stringCards10 = {{"T", "H"}
            , {"T", "H"}
            , {"T", "H"}
            , {"T", "H"}
            , {"T", "D"}};
        thePokerHand = new PokerHand(new CardGenerator(stringCards10).getCards());

        assertEquals("It doesn't match", thePokerHand.defineHand());
    }
}
