package org.fundacionjala.at15.katas.poker.diana;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.fundacionjala.at15.katas.pokerhands.diana.Hands;
import org.junit.Test;

public class HandsTest {
    @Test
    public void itShouldHaveFiveCards() {
        Hands hand = new Hands();
        String blackHand[] = { "2H", "3D", "5S", "9C", "KD" };
        int result = hand.countCards(blackHand);
        assertEquals(5, result);
    }

    @Test
    public void itShouldReturnTheValueOfTheCard() {
        Hands hand = new Hands();
        String blackHand[] = { "2H", "3D", "5S", "9C", "KD" };
        List<String> blackHandValues = Arrays.asList("2", "3", "5", "9", "K");
        ArrayList<String> result = hand.valueOfCards(blackHand);
        assertEquals(blackHandValues, result);
    }

    @Test
    public void itShouldReturnTheSuitOfTheCard() {
        Hands hand = new Hands();
        String blackHand[] = { "2H", "3D", "5S", "9C", "KD" };
        List<String> blackHandValues = Arrays.asList("H", "D", "S", "C", "D");
        ArrayList<String> result = hand.suitOfCards(blackHand);
        assertEquals(blackHandValues, result);
    }
}
