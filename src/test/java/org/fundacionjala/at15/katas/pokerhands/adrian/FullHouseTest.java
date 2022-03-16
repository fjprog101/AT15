package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FullHouseTest {
    @Test
    public void fullHouseTest() {
        FullHouse fullHouse = new FullHouse();
        assertEquals(5, fullHouse.fullHouse("5H 5S 5C 4D 4H")[0]);
        assertEquals(4, fullHouse.fullHouse("5H 5S 5C 4D 4H")[1]);
        assertEquals(3, fullHouse.fullHouse("5H 5S 5C 4D 4H")[2]);
    }

    @Test
    public void theHandIsFullHouseTest() {
        FullHouse fullHouse = new FullHouse();
        boolean result = fullHouse.theHandIsFullHouse("2H 4S 4C 2D 4H");
        assertEquals(true, result);
        result = fullHouse.theHandIsFullHouse("2H 4S 4C 2D 5H");
        assertEquals(false, result);
        result = fullHouse.theHandIsFullHouse("5H 5S 5C 5D 4H");
        assertEquals(false, result);
    }

    @Test
    public void compareHandsFullHouseTest() {
        FullHouse fullHouse = new FullHouse();
        String result = fullHouse.compareHandsFullHouse("2H 4S 4C 2D 4H", "4H 4S 7C 7D 7H");
        assertEquals("4H 4S 7C 7D 7H", result);
        result = fullHouse.compareHandsFullHouse("2H 4S 4C 2D 4H", "3H 3S 3C 7D 7H");
        assertEquals("2H 4S 4C 2D 4H", result);
        result = fullHouse.compareHandsFullHouse("8H 8S 8C 7D 7H", "8H 6S 6C 8D 8H");
        assertEquals("8H 8S 8C 7D 7H", result);
        result = fullHouse.compareHandsFullHouse("8H 8S 8C 5D 5H", "8H 9S 9C 8D 8H");
        assertEquals("8H 9S 9C 8D 8H", result);
        result = fullHouse.compareHandsFullHouse("7S 7C AD AH 7H", "7H AS AC 7D 7H");
        assertEquals("Tie", result);
    }
}
