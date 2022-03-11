package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class FullHouseIdentifierTest {
    @Test
    public void itShouldIdentifyFullHouse() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("2", "S");
        Card card4 = new Card("6", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FullHouseIdentifier fullHouseIdentificationTest = new FullHouseIdentifier();
        fullHouseIdentificationTest.theIdentification(cardList);

        assertTrue(fullHouseIdentificationTest.isFullHouse());
    }

    @Test
    public void itShouldNotIdentifyFullHouseWithThreesome() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("2", "S");
        Card card4 = new Card("3", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FullHouseIdentifier fullHouseIdentificationTest = new FullHouseIdentifier();
        fullHouseIdentificationTest.theIdentification(cardList);

        assertFalse(fullHouseIdentificationTest.isFullHouse());
    }

    @Test
    public void itShouldNotIdentifyFullHouseWithDuet() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("4", "S");
        Card card4 = new Card("3", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FullHouseIdentifier fullHouseIdentificationTest = new FullHouseIdentifier();
        fullHouseIdentificationTest.theIdentification(cardList);

        assertFalse(fullHouseIdentificationTest.isFullHouse());
    }
}
