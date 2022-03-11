package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.Pair;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class PairTest {

    @Test
    public void itShouldReturnPair() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(13);
        Pair pair = new Pair();
        int result = pair.analysisOfRule(numbers);
        assertEquals(5, result);
    }

}