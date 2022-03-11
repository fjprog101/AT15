package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class PokerIdentifierTest {
    @Test
    public void itShouldIdentifyPoker() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("2", "S");
        Card card4 = new Card("2", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PokerIdentifier pokerIdentificationTest = new PokerIdentifier();
        pokerIdentificationTest.theIdentification(cardList);

        assertTrue(pokerIdentificationTest.isPoker());
    }

    @Test
    public void itShouldNotIdentifyPoker() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("3", "S");
        Card card4 = new Card("2", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PokerIdentifier pokerIdentificationTest = new PokerIdentifier();
        pokerIdentificationTest.theIdentification(cardList);

        assertFalse(pokerIdentificationTest.isPoker());
    }
}
