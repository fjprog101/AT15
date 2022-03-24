package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.TwoPairs;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TwoPairTest {
    @Test
    public void itShouldReturnTwoPairsTrue() {
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
        four.setValue(Notation.FIVE.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FIVE.getNotation());

        Card five = new Card();
        five.setValue(Notation.KING.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.KING.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        TwoPairs white = new TwoPairs(cardCollection);

        assertTrue(white.check());
    }

    @Test
    public void itShouldReturnTwoPairsFalse() {
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
        four.setValue(Notation.KING.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.KING.getNotation());

        Card five = new Card();
        five.setValue(Notation.KING.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.KING.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        TwoPairs white = new TwoPairs(cardCollection);

        assertTrue(white.check());
    }
}
