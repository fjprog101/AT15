package org.fundacionjala.at15.katas.poker.diana;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.fundacionjala.at15.katas.pokerhands.diana.ThreeOfKind;

import org.junit.Test;

public class ThreeOfKindTest {
    @Test
    public void itShouldReturnThreeOfAKind() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        ThreeOfKind threeOfKind = new ThreeOfKind();
        int result = threeOfKind.analysisOfRule(numbers);
        assertEquals(2, result);
    }

}
