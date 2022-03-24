package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.FullHouse;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FullHouseTest {
    @Test
    public void itShouldReturnFullHouseTrue() {
        Card one = new Card();
        one.setValue(Notation.SIX.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.SIX.getNotation());

        Card two = new Card();
        two.setValue(Notation.SIX.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.SIX.getNotation());

        Card three = new Card();
        three.setValue(Notation.SIX.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.SIX.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.FOUR.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.FOUR.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        FullHouse white = new FullHouse(cardCollection);

        assertTrue(white.check());
    }

    @Test
    public void itShouldReturnFullHouseFalse() {
        Card one = new Card();
        one.setValue(Notation.SIX.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.SIX.getNotation());

        Card two = new Card();
        two.setValue(Notation.ACE.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.ACE.getNotation());

        Card three = new Card();
        three.setValue(Notation.SIX.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.SIX.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.FOUR.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.FOUR.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        FullHouse white = new FullHouse(cardCollection);

        assertFalse(white.check());
    }
}
