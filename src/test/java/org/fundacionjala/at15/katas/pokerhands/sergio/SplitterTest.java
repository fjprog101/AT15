package org.fundacionjala.at15.katas.pokerhands.sergio;

import static org.junit.Assert.assertArrayEquals;
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
        String[] black = { "TH", "JD", "QS", "KC", "AD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplitValue();
        splitterTest.valuesHandCorrection();
        assertEquals("10", splitterTest.getValuesHand(0));
        assertEquals("11", splitterTest.getValuesHand(1));
        assertEquals("12", splitterTest.getValuesHand(2));
        assertEquals("13", splitterTest.getValuesHand(3));
        assertEquals("14", splitterTest.getValuesHand(4));
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

    @Test
    public void itShouldSplitSuit() {
        String[] black = { "2H", "3D", "5S", "9C", "KD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplitSuit();
        assertEquals("H", splitterTest.getSuitPokerHand(0));
        assertEquals("D", splitterTest.getSuitPokerHand(1));
        assertEquals("S", splitterTest.getSuitPokerHand(2));
        assertEquals("C", splitterTest.getSuitPokerHand(3));
        assertEquals("D", splitterTest.getSuitPokerHand(4));
    }

    @Test
    public void itShouldDoTheCompleteSplit() {
        String[] black = { "2H", "3D", "5S", "9C", "KD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplit();
        int[] expectedValueArray = {2, 3, 5, 9, 13};
        String[] expectedSuitArray = {"H", "D", "S", "C", "D"};
        assertArrayEquals(expectedValueArray, splitterTest.getValuesPokerHand());
        assertArrayEquals(expectedSuitArray, splitterTest.getSuitPokerHand());
    }

}
