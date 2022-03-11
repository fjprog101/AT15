package org.fundacionjala.at15.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StraightFlushIdentifierTest {

    @Test
    public void itShouldIdentifyIfStraightFlush() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("4", "D");
        Card card4 = new Card("5", "D");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        StraightFlushIdentifier straightFlushIdentificationTest = new StraightFlushIdentifier();
        straightFlushIdentificationTest.theIdentification(cardList);

        assertTrue(straightFlushIdentificationTest.isStraightFlush());
    }

    @Test
    public void itShouldIdentifyIfNotStraightFlushValue() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("8", "D");
        Card card4 = new Card("5", "D");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        StraightFlushIdentifier straightFlushIdentificationTest = new StraightFlushIdentifier();
        straightFlushIdentificationTest.theIdentification(cardList);

        assertFalse(straightFlushIdentificationTest.isStraightFlush());
    }

    @Test
    public void itShouldIdentifyIfNotStraightFlushSuit() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("4", "S");
        Card card4 = new Card("5", "D");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        StraightFlushIdentifier straightFlushIdentificationTest = new StraightFlushIdentifier();
        straightFlushIdentificationTest.theIdentification(cardList);
        assertFalse(straightFlushIdentificationTest.isStraightFlush());
    }
}
