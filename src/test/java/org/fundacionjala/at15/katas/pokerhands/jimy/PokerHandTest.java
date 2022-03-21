package org.fundacionjala.at15.katas.pokerhands.jimy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void shoudlDisplayAscendentAndOrderHand() {
        String[] content = {"2H", "5D", "TS", "6C", "3D"};
        PokerHand poker = new PokerHand(content);
        assertEquals(2,poker.getValue(0));
        assertEquals('H',poker.getSuit(0));
        assertEquals(3,poker.getValue(1));
        assertEquals('D',poker.getSuit(1));
        assertEquals(5,poker.getValue(2));
        assertEquals('D',poker.getSuit(2));
        assertEquals(6,poker.getValue(3));
        assertEquals('C',poker.getSuit(3));
        assertEquals(10,poker.getValue(4));
        assertEquals('S',poker.getSuit(4));
    }
}
