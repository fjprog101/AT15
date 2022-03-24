package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.Pair;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairTest {
    @Test
    public void itShouldReturnPairTrue() {
        Card one = new Card();
        one.setValue(Notation.TWO.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.TWO.getNotation());

        Card two = new Card();
        two.setValue(Notation.TWO.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.TWO.getNotation());

        Card three = new Card();
        three.setValue(Notation.FIVE.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.FIVE.getNotation());

        Card four = new Card();
        four.setValue(Notation.NINE.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.NINE.getNotation());

        Card five = new Card();
        five.setValue(Notation.KING.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.KING.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        Pair white = new Pair(cardCollection);

        assertTrue(white.check());
    }

    @Test
    public void itShouldReturnPairFalse() {
        Card one = new Card();
        one.setValue(Notation.TWO.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.TWO.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.FIVE.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.FIVE.getNotation());

        Card four = new Card();
        four.setValue(Notation.NINE.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.NINE.getNotation());

        Card five = new Card();
        five.setValue(Notation.KING.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.KING.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        Pair white = new Pair(cardCollection);

        assertFalse(white.check());
    }
}
