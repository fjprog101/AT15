package org.fundacionjala.at15.katas.pokerhands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClubCardTest {
    @Test
    public void itShouldHaveAValue() {
        ClubCard clubCard = new ClubCard('6');
        assertEquals('6', clubCard.getValue());
    }

    @Test
    public void itShouldHaveASuit() {
        ClubCard clubCard = new ClubCard('2');
        assertEquals('C', clubCard.getSuit());
    }
}
