package org.fundacionjala.at15.katas.poker;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.diana.Hands;
import org.junit.Test;

public class PokerTest {
    @Test
    public void itShouldHaveFiveCards() {
        Hands hand = new Hands();
        String blackHand[] = { "2H", "3D", "5S", "9C", "KD" };
        int result = hand.countCards(blackHand);
        assertEquals(5, result);
    }

}
