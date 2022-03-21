package org.fundacionjala.at15.katas.poker.diana;

import org.fundacionjala.at15.katas.pokerhands.diana.HighCard;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class HighCardTest {

    @Test
    public void itShouldReturnHighCard() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(13);
        HighCard highCard = new HighCard();
        int result = highCard.analysisOfRule(numbers);
        assertEquals(13, result);
    }

}
