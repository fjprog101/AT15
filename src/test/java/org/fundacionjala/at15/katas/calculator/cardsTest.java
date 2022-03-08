package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.pokerhands.Cards;
import org.junit.Test;

public class cardsTest {
    @Test
    public void itShouldBeCardsClub() {
        String suit ="C";
        Cards cardsClubs = new Cards();
        String[] clubs = {"2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AC"};
        String[] compare = cardsClubs.cards(suit);
        assertEquals(clubs, compare);
    }   
}
