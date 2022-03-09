package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitterTest {

    @Test
    public void itShouldSplitTheValues() {
        String[] black = { "2H", "3D", "5S", "9C", "KD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplitValue();
        assertEquals("2", splitterTest.getValuesHand(0));
        assertEquals("3", splitterTest.getValuesHand(1));
        assertEquals("5", splitterTest.getValuesHand(2));
        assertEquals("9", splitterTest.getValuesHand(3));
        assertEquals("K", splitterTest.getValuesHand(4));
    }

    @Test
    public void itShouldCorrectValuesHand() {
        String[] black = { "2H", "3D", "5S", "9C", "KD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplitValue();
        splitterTest.valuesHandCorrection();
        assertEquals("13", splitterTest.getValuesHand(4));
        assertEquals("2", splitterTest.getValuesHand(0));
    }

    @Test
    public void itShouldChangeValuesHandToInt() {
        String[] black = { "2H", "3D", "5S", "9C", "KD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplitValue();
        splitterTest.valuesHandCorrection();
        splitterTest.valuesHandToInt();
        assertEquals(2, splitterTest.getValuesPokerHand(0));
        assertEquals(3, splitterTest.getValuesPokerHand(1));
        assertEquals(5, splitterTest.getValuesPokerHand(2));
        assertEquals(9, splitterTest.getValuesPokerHand(3));
        assertEquals(13, splitterTest.getValuesPokerHand(4));
    }

}
