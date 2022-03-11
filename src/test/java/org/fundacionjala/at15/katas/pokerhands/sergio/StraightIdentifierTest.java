package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StraightIdentifierTest {
    @Test
    public void itShouldIdentifyIfStraight() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "S");
        Card card3 = new Card("4", "C");
        Card card4 = new Card("5", "H");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        StraightIdentifier identificationTest = new StraightIdentifier(cardList);

        assertTrue(identificationTest.isStraight());
    }

    @Test
    public void itShouldIdentifyIfNotStraight() {
        Card card1 = new Card("J", "D");
        Card card2 = new Card("3", "S");
        Card card3 = new Card("4", "C");
        Card card4 = new Card("5", "H");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        StraightIdentifier identificationTest = new StraightIdentifier(cardList);

        assertFalse(identificationTest.isStraight());
    }
}
