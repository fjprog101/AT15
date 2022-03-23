package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class DoublePairIdentifierTest {
    @Test
    public void itShouldIdentifyDoublePair() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("4", "S");
        Card card4 = new Card("4", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        Identifier doublePairIdentificationTest = new DoublePairIdentifier();
        doublePairIdentificationTest.theIdentification(cardList);

        assertTrue(doublePairIdentificationTest.isDoublePair());
    }

    @Test
    public void itShouldNotIdentifyDoublePairWithOnlyPair() {
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
        Identifier doublePairIdentificationTest = new DoublePairIdentifier();
        doublePairIdentificationTest.theIdentification(cardList);

        assertFalse(doublePairIdentificationTest.isDoublePair());
    }
}
