package org.fundacionjala.at15.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
    @Test
    public void itShouldGetTheValueOfTheCard() {
        Card theCard = new Card("A","H");
        int value = 13;
        int result = theCard.getValueOfCard();
        assertEquals(value, result);

        Card theCard1 = new Card("Q","H");
        int value1 = 11;
        int result1 = theCard1.getValueOfCard();
        assertEquals(value1, result1);

        Card theCard2 = new Card("7","H");
        int value2 = 6;
        int result2 = theCard2.getValueOfCard();
        assertEquals(value2, result2);

        Card theCard3 = new Card("4","H");
        int value3 = 3;
        int result3 = theCard3.getValueOfCard();
        assertEquals(value3, result3);

        Card theCard6 = new Card("6","H");
        int value6 = 5;
        int result6 = theCard6.getValueOfCard();
        assertEquals(value6, result6);

        Card theCard8 = new Card("8","H");
        int value8 = 7;
        int result8 = theCard8.getValueOfCard();
        assertEquals(value8, result8);

        Card theCard10 = new Card("10","H");
        int value10 = 9;
        int result10 = theCard10.getValueOfCard();
        assertEquals(value10, result10);

        Card theCardj = new Card("J","H");
        int valuej = 10;
        int resultj = theCardj.getValueOfCard();
        assertEquals(valuej, resultj);
    }
}
