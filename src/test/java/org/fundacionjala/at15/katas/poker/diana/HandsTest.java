package org.fundacionjala.at15.katas.poker.diana;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.fundacionjala.at15.katas.pokerhands.diana.Hands;
import org.junit.Test;

public class HandsTest {
    Hands hand = new Hands();
    String blackHand[] = { "2H", "3D", "5S", "9C", "KD" };

    @Test
    public void itShouldHaveFiveCards() {
        int result = hand.countCards(blackHand);
        assertEquals(5, result);
    }

    @Test
    public void itShouldReturnTheValueOfTheCard() {
        List<Integer> blackHandValues = Arrays.asList(2, 3, 5, 9, 12);
        ArrayList<Integer> result = hand.valueOfCards(blackHand);
        assertEquals(blackHandValues, result);
    }

    @Test
    public void itShouldReturnTheSuitOfTheCard() {
        List<String> blackHandValues = Arrays.asList("H", "D", "S", "C", "D");
        ArrayList<String> result = hand.suitOfCards(blackHand);
        assertEquals(blackHandValues, result);
    }
}
