package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.FourOfKind;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class FourOfKindTest {
    @Test
    public void itShouldReturnFourOfKind() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(8);
        numbers.add(2);
        numbers.add(8);
        numbers.add(8);
        FourOfKind fourOfKind = new FourOfKind();
        int result = fourOfKind.analysisOfRule(numbers);
        assertEquals(8, result);
    }
}
