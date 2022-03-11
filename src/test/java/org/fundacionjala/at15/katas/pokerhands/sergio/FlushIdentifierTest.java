package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlushIdentifierTest {
    @Test
    public void itShouldIdentifyIfFlush() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("4", "D");
        Card card4 = new Card("6", "D");
        Card card5 = new Card("8", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);

        FlushIdentifier identificationTest = new FlushIdentifier();
        identificationTest.theIdentification(cardList);

        assertTrue(identificationTest.getIsFlush());
    }

    @Test
    public void itShouldIdentifyIfNotFlush() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "S");
        Card card3 = new Card("4", "D");
        Card card4 = new Card("6", "D");
        Card card5 = new Card("8", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);

        FlushIdentifier identificationTest = new FlushIdentifier();
        identificationTest.theIdentification(cardList);

        assertFalse(identificationTest.getIsFlush());
    }
}
