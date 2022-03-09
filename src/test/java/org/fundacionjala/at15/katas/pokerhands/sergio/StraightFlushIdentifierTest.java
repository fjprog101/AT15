package org.fundacionjala.at15.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert.*;

public class StraightFlushIdentifierTest {

    @Test
    public void itShouldIdentifyIfStraightFlush() {
        String[] pokerHand = {"AD", "JD", "TD", "QD", "KD"};
        Splitter splitterTest = new Splitter(pokerHand);
        splitterTest.theSplit();
        StraightFlushIdentifier theIdentificationTest = new StraightFlushIdentifier(splitterTest);
        theIdentificationTest.theIdentification();

        assertTrue(theIdentificationTest.getIsStraightFlush());
    }

    @Test
    public void itShouldIdentifyIfNotStraightFlush() {
        String[] pokerHand = {"AS", "JD", "TD", "QD", "KD"};
        String[] pokerHand2 = {"AD", "JD", "2D", "QD", "KD"};
        Splitter splitterTest = new Splitter(pokerHand);
        splitterTest.theSplit();
        StraightFlushIdentifier theIdentificationTest = new StraightFlushIdentifier(splitterTest);
        theIdentificationTest.theIdentification();

        assertFalse(theIdentificationTest.getIsStraightFlush());

        Splitter splitterTest2 = new Splitter(pokerHand2);
        splitterTest2.theSplit();
        StraightFlushIdentifier theIdentificationTest2 = new StraightFlushIdentifier(splitterTest2);
        theIdentificationTest2.theIdentification();

        assertFalse(theIdentificationTest2.getIsStraightFlush());
    }

    @Test
    public void itShouldIdentifyIfFlush() {
        String[] pokerHand = {"AD", "JD", "3D", "5D", "KD"};
        Splitter splitterTest = new Splitter(pokerHand);
        splitterTest.theSplit();
        StraightFlushIdentifier theIdentificationTest = new StraightFlushIdentifier(splitterTest);
        theIdentificationTest.flushIdentifier();

        assertTrue(theIdentificationTest.getIsFlush());
    }

    @Test
    public void itShouldIdentifyIfNotFlush() {
        String[] pokerHand = {"AD", "JD", "3D", "5H", "KD"};
        Splitter splitterTest = new Splitter(pokerHand);
        splitterTest.theSplit();
        StraightFlushIdentifier theIdentificationTest = new StraightFlushIdentifier(splitterTest);
        theIdentificationTest.flushIdentifier();

        assertFalse(theIdentificationTest.getIsFlush());
    }

    @Test
    public void itShouldIdentifyIfStraight() {
        String[] pokerHand = {"AD", "JH", "QD", "TS", "KD"};
        Splitter splitterTest = new Splitter(pokerHand);
        splitterTest.theSplit();
        StraightFlushIdentifier theIdentificationTest = new StraightFlushIdentifier(splitterTest);
        theIdentificationTest.straightIdentifier();

        assertTrue(theIdentificationTest.getIsStraight());
    }

    @Test
    public void itShouldIdentifyIfNotStraight() {
        String[] pokerHand = {"AD", "2H", "QD", "7S", "KD"};
        Splitter splitterTest = new Splitter(pokerHand);
        splitterTest.theSplit();
        StraightFlushIdentifier theIdentificationTest = new StraightFlushIdentifier(splitterTest);
        theIdentificationTest.straightIdentifier();

        assertFalse(theIdentificationTest.getIsStraight());
    }

}
