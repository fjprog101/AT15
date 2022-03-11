package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandTest {

    @Test
    public void compareHandsTest() {
        Hand handsComparer = new Hand();
        String hand1 = "2H 3D 5S 9C KD";
        String hand2 = "2C 3H 4S 8C AH";
        String result = handsComparer.compareHands(hand1, hand2);
        assertEquals(hand2, result);

        hand1 = "2H 8D 3S 4C 8D";
        hand2 = "2C 7H 4S 7C QH";
        result = handsComparer.compareHands(hand1, hand2);
        assertEquals(hand1, result);

        //tie
        hand1 = "2H 3D 5S 9C KD";
        hand2 = "2D 3H 5C 9S KH";
        result = handsComparer.compareHands(hand1, hand2);
        assertEquals("It is a tie", result);
    }

    @Test
    public void itShouldReturnTheHighestCardOfHand() {
        HighCard checkHighCard = new HighCard();
        String hand1 = "2H 3D 5S 9C AD";
        int winner = checkHighCard.sortedHand(hand1)[4];
        int expectedResult = 14;
        assertEquals(expectedResult, winner);
    }

    @Test
    public void valueOfCardTest() {
        Hand handsComparer = new Hand();
        int result;
        result = handsComparer.valueOfCard('2');
        assertEquals(2, result);
        result = handsComparer.valueOfCard('3');
        assertEquals(3, result);
        result = handsComparer.valueOfCard('4');
        assertEquals(4, result);
        result = handsComparer.valueOfCard('5');
        assertEquals(5, result);
        result = handsComparer.valueOfCard('6');
        assertEquals(6, result);
        result = handsComparer.valueOfCard('7');
        assertEquals(7, result);
        result = handsComparer.valueOfCard('8');
        assertEquals(8, result);
        result = handsComparer.valueOfCard('9');
        assertEquals(9, result);
        result = handsComparer.valueOfCard('T');
        assertEquals(10, result);
        result = handsComparer.valueOfCard('J');
        assertEquals(11, result);
        result = handsComparer.valueOfCard('Q');
        assertEquals(12, result);
        result = handsComparer.valueOfCard('K');
        assertEquals(13, result);
        result = handsComparer.valueOfCard('A');
        assertEquals(14, result);
        result = handsComparer.valueOfCard('/');
        assertEquals(0, result);
    }

}
