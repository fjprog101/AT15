package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.StraightFlush;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StraightFlushTest {
    @Test
    public void itShouldReturnStraightFlushTrue() {
        Card one = new Card();
        one.setValue(Notation.SIX.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.SIX.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.HEARTS.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.HEARTS.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.HEARTS.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.FIVE.getValue());
        five.setSuit(Suit.HEARTS.getSuit());
        five.setNotation(Notation.FIVE.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        StraightFlush white = new StraightFlush(cardCollection);

        assertTrue(white.check());
    }

    @Test
    public void itShouldReturnStraightFlushFalse() {
        Card one = new Card();
        one.setValue(Notation.SIX.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.SIX.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.HEARTS.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.HEARTS.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.HEARTS.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.FIVE.getValue());
        five.setSuit(Suit.SPADES.getSuit());
        five.setNotation(Notation.FIVE.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        StraightFlush white = new StraightFlush(cardCollection);

        assertFalse(white.check());
    }
}
