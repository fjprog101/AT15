package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PairTest {

    @Test
    public void valueOfPairCardTest() {
        Pair pair = new Pair();
        String hand = "2H QD QS 9C AD";
        int result = pair.valueOfPairCard(hand);
        assertEquals(12, result);
    }

    @Test
    public void theHandHasAPairTest() {
        Pair pair = new Pair();
        boolean result = pair.theHandHasAPair("QH 7D AS 5C 7D");
        assertEquals(true, result);
        result = pair.theHandHasAPair("QH 7D AS 5C 8D");
        assertEquals(false, result);
    }

    @Test
    public void compareHandsWithPairsTest() {
        Pair pair = new Pair();
        String hand1 = "2H JD 3S JC AD";
        String hand2 = "2C 8H 4S 8C AH";
        String result = pair.compareHandsWithPairs(hand1, hand2);
        assertEquals(hand1, result);

        hand1 = "2H 5D 3S 5C AD";
        hand2 = "2C 8H 4S 8C KH";
        result = pair.compareHandsWithPairs(hand1, hand2);
        assertEquals(hand2, result);

        hand1 = "2H 7D 3S 7C AD";
        hand2 = "2C 7H 4S 7C QH";
        result = pair.compareHandsWithPairs(hand1, hand2);
        assertEquals("Tie", result);
    }
}
