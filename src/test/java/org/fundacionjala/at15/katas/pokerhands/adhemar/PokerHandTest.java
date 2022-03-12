package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void itShouldHaveFiveCards() {
        String[] stringHand = {"2H", "3D", "5S", "9C", "KD"};
        PokerHand thePokerHand = new PokerHand(new CardGenerator(stringHand).getCards());

        assertEquals(5, thePokerHand.getCards().length);
    }

    @Test
    public void itShouldCreateCards() {
        String[] stringHand = {"2H", "3D", "5S", "9C", "KD"};
        PokerHand thePokerHand = new PokerHand(new CardGenerator(stringHand).getCards());
        Card theCard = new Card("K", "D");

        assertEquals(theCard.getSuit(), thePokerHand.getCards()[4].getSuit());
        assertEquals(theCard.getStringValue(), thePokerHand.getCards()[4].getStringValue());
        assertEquals(theCard.getIntValue(), thePokerHand.getCards()[4].getIntValue());
    }

    @Test
    public void isShouldDefineHand() {
        String[] stringHand1 = {"2H", "KD", "JS", "QC", "AD"};
        PokerHand thePokerHand = new PokerHand(new CardGenerator(stringHand1).getCards());

        assertEquals("high card", thePokerHand.getHand().getHandName());

        String[] stringHand2 = {"2H", "KD", "JS", "JC", "AD"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand2).getCards());

        assertEquals("pair", thePokerHand.getHand().getHandName());

        String[] stringHand3 = {"2H", "AD", "JS", "JC", "AD"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand3).getCards());

        assertEquals("two pairs", thePokerHand.getHand().getHandName());

        String[] stringHand4 = {"AH", "AD", "JS", "5C", "AD"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand4).getCards());

        assertEquals("three of a kind", thePokerHand.getHand().getHandName());

        String[] stringHand5 = {"8H", "7D", "6S", "5C", "4D"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand5).getCards());

        assertEquals("straight", thePokerHand.getHand().getHandName());

        String[] stringHand6 = {"8H", "7H", "6H", "AH", "4H"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand6).getCards());

        assertEquals("flush", thePokerHand.getHand().getHandName());

        String[] stringHand7 = {"8H", "8H", "8C", "AD", "AH"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand7).getCards());

        assertEquals("full house", thePokerHand.getHand().getHandName());

        String[] stringHand8 = {"8H", "8H", "8C", "8D", "AH"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand8).getCards());

        assertEquals("four of a kind", thePokerHand.getHand().getHandName());

        String[] stringHand9 = {"JH", "TH", "9H", "8H", "7H"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand9).getCards());

        assertEquals("straight flush", thePokerHand.getHand().getHandName());

        String[] stringHand10 = {"TH", "TH", "TH", "TH", "TD"};
        thePokerHand = new PokerHand(new CardGenerator(stringHand10).getCards());

        assertEquals("It doesn't match", thePokerHand.getHand().getHandName());
    }
}
