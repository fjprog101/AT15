package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.Flush;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class FlushTest {
    ArrayList<String> suits = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    @Test
    public void itShouldReturnFlush() {
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        suits.add("D");
        Flush flush = new Flush();
        boolean result = flush.analysisOfRule(numbers, suits);
        assertTrue(result);
    }

}
