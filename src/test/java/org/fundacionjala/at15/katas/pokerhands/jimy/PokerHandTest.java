package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokerHandTest {
    @Test
    public void pokerhandsTest(){
        String[] input = {"AS","5D","2H","kD","7S"};
        PokerHand hand = new PokerHand(input);
        assertEquals(14, hand.getValue(0));
        assertEquals('S', hand.getSuit(0));
    }
}
