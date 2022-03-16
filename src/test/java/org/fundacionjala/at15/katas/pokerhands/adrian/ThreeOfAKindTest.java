package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void valueOfThreeTest() {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        int result = threeOfAKind.valueOfThree("2H 7D 7S 5C 7D");
        assertEquals(7, result);
    }

    @Test
    public void theHandHasThreeOfAKindTest() {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        boolean result = threeOfAKind.theHandHasThreeOfAKind("2H 7D 7S 5C 7D");
        assertEquals(true, result);
        result = threeOfAKind.theHandHasThreeOfAKind("2H 7D 7S 5C 6D");
        assertEquals(false, result);
    }

    @Test
    public void compareHandsWithThreeOfAKindTest() {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        String result = threeOfAKind.compareHandsWithThreeOfAKind("2H 7D 7S 5C 7D", "8C 7H KS KC KH");
        assertEquals("8C 7H KS KC KH", result);

        result = threeOfAKind.compareHandsWithThreeOfAKind("2H 7D 7S 5C 7D", "6C 6H 6S KC 2H");
        assertEquals("2H 7D 7S 5C 7D", result);

        result = threeOfAKind.compareHandsWithThreeOfAKind("2H 7D 7S 5C 7D", "7C 7H 7S KC 2H");
        assertEquals("Tie", result);
    }
}
