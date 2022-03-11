package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlushTest {

    @Test
    public void theHandIsFlushTest() {
        Flush flush = new Flush();
        boolean result = flush.theHandIsFlush("QH 7H AH 5H 8H");
        assertEquals(true, result);
        result = flush.theHandIsFlush("2H KD AS 7C 2D");
        assertEquals(false, result);
    }

    @Test
    public void compareHandsWithFlushTest() {
        Flush flush = new Flush();
        String result = flush.compareHandsWithFlush("QH 7H AH 5H 8H", "4S KS 8S 7S 2S");
        assertEquals("QH 7H AH 5H 8H", result);
        result = flush.compareHandsWithFlush("2H 7H 3H 5H 8H", "4S QS 8S 7S 5S");
        assertEquals("4S QS 8S 7S 5S", result);
        result = flush.compareHandsWithFlush("2H 7H 3H 5H 8H", "2S 7S 3S 5S 8S");
        assertEquals("Tie", result);
    }
}
