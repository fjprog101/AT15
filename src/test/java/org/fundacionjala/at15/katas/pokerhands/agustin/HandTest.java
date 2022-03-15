package org.fundacionjala.at15.katas.pokerhands.agustin;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {
    @Test
    public void itShouldReturnSortedCards() {
        Card one = new Card();
        one.setValue(Notation.TWO.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.TWO.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.SIX.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.SIX.getNotation());

        Card four = new Card();
        four.setValue(Notation.FIVE.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FIVE.getNotation());

        Card five = new Card();
        five.setValue(Notation.FOUR.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.FOUR.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        new Hand(cardCollection);

        assertEquals(2, Hand.sort(cardCollection)[0].getValue());
        assertEquals(3, Hand.sort(cardCollection)[1].getValue());
        assertEquals(4, Hand.sort(cardCollection)[2].getValue());
        assertEquals(5, Hand.sort(cardCollection)[3].getValue());
        assertEquals(6, Hand.sort(cardCollection)[4].getValue());

    }

}
