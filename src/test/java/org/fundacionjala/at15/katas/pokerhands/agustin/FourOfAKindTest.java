package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.FourOfAKind;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FourOfAKindTest {
    @Test
    public void itShouldReturnFourOfAKindTrue() {
        Card one = new Card();
        one.setValue(Notation.TWO.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.TWO.getNotation());

        Card two = new Card();
        two.setValue(Notation.TWO.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.TWO.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.TWO.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.TWO.getNotation());

        Card five = new Card();
        five.setValue(Notation.KING.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.KING.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        FourOfAKind white = new FourOfAKind(cardCollection);

        assertTrue(white.check());
    }

    @Test
    public void itShouldReturnFourOfAKindFalse() {
        Card one = new Card();
        one.setValue(Notation.TWO.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.TWO.getNotation());

        Card two = new Card();
        two.setValue(Notation.TWO.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.TWO.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.KING.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.KING.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        FourOfAKind white = new FourOfAKind(cardCollection);

        assertFalse(white.check());
    }

}
