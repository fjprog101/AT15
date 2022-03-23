package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FrequencyIdentifierTest {
    @Test
    public void itShouldIdentifyFrequencyInPokerHand2Equals() {
        Card card1 = new Card("6", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("6", "S");
        Card card4 = new Card("2", "C");
        Card card5 = new Card("4", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FrequencyIdentifier frequencyIdentificationTest = new FrequencyIdentifier();
        frequencyIdentificationTest.theIdentification(cardList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(2);

        assertEquals(expectedList.get(0), frequencyIdentificationTest.getFrequency().get(0));
        assertEquals(expectedList.get(1), frequencyIdentificationTest.getFrequency().get(1));
        assertEquals(expectedList.get(2), frequencyIdentificationTest.getFrequency().get(2));
        assertEquals(expectedList.get(3), frequencyIdentificationTest.getFrequency().get(3));
    }

    @Test
    public void itShouldIdentifyFrequencyInPokerHand3Equals() {
        Card card1 = new Card("6", "D");
        Card card2 = new Card("6", "H");
        Card card3 = new Card("6", "S");
        Card card4 = new Card("2", "C");
        Card card5 = new Card("4", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FrequencyIdentifier frequencyIdentificationTest = new FrequencyIdentifier();
        frequencyIdentificationTest.theIdentification(cardList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(3);

        assertEquals(expectedList.get(0), frequencyIdentificationTest.getFrequency().get(0));
        assertEquals(expectedList.get(1), frequencyIdentificationTest.getFrequency().get(1));
        assertEquals(expectedList.get(2), frequencyIdentificationTest.getFrequency().get(2));
    }

    @Test
    public void itShouldIdentifyFrequencyInPokerHand4Equals() {
        Card card1 = new Card("6", "D");
        Card card2 = new Card("6", "H");
        Card card3 = new Card("6", "S");
        Card card4 = new Card("6", "C");
        Card card5 = new Card("4", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FrequencyIdentifier frequencyIdentificationTest = new FrequencyIdentifier();
        frequencyIdentificationTest.theIdentification(cardList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(4);


        assertEquals(expectedList.get(0), frequencyIdentificationTest.getFrequency().get(0));
        assertEquals(expectedList.get(1), frequencyIdentificationTest.getFrequency().get(1));
    }

    @Test
    public void itShouldIdentifyFrequencyInPokerHandFull() {
        Card card1 = new Card("6", "D");
        Card card2 = new Card("6", "H");
        Card card3 = new Card("6", "S");
        Card card4 = new Card("4", "C");
        Card card5 = new Card("4", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FrequencyIdentifier frequencyIdentificationTest = new FrequencyIdentifier();
        frequencyIdentificationTest.theIdentification(cardList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);


        assertEquals(expectedList.get(0), frequencyIdentificationTest.getFrequency().get(0));
        assertEquals(expectedList.get(1), frequencyIdentificationTest.getFrequency().get(1));
    }

    @Test
    public void itShouldIdentifyFrequencyInPokerHand2Pairs() {
        Card card1 = new Card("6", "D");
        Card card2 = new Card("6", "H");
        Card card3 = new Card("K", "S");
        Card card4 = new Card("4", "C");
        Card card5 = new Card("4", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FrequencyIdentifier frequencyIdentificationTest = new FrequencyIdentifier();
        frequencyIdentificationTest.theIdentification(cardList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(2);
        expectedList.add(1);


        assertEquals(expectedList.get(0), frequencyIdentificationTest.getFrequency().get(0));
        assertEquals(expectedList.get(1), frequencyIdentificationTest.getFrequency().get(1));
        assertEquals(expectedList.get(2), frequencyIdentificationTest.getFrequency().get(2));
    }

    @Test
    public void itShouldIdentifyFrequencyInPokerHandUniques() {
        Card card1 = new Card("6", "D");
        Card card2 = new Card("3", "H");
        Card card3 = new Card("K", "S");
        Card card4 = new Card("J", "C");
        Card card5 = new Card("4", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        FrequencyIdentifier frequencyIdentificationTest = new FrequencyIdentifier();
        frequencyIdentificationTest.theIdentification(cardList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(1);
        expectedList.add(1);


        assertEquals(expectedList.get(0), frequencyIdentificationTest.getFrequency().get(0));
        assertEquals(expectedList.get(1), frequencyIdentificationTest.getFrequency().get(1));
        assertEquals(expectedList.get(2), frequencyIdentificationTest.getFrequency().get(2));
        assertEquals(expectedList.get(3), frequencyIdentificationTest.getFrequency().get(3));
        assertEquals(expectedList.get(4), frequencyIdentificationTest.getFrequency().get(4));
    }
}
