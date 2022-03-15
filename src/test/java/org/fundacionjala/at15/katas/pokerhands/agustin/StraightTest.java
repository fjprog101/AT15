package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.Straight;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StraightTest {
    @Test
    public void itShouldReturnStraightTrue() {
        Card one = new Card();
        one.setValue(Notation.SIX.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.SIX.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.FIVE.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.FIVE.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        Straight white = new Straight(cardCollection);

        assertTrue(white.check());
    }

    @Test
    public void itShouldReturnStraightFalse() {
        Card one = new Card();
        one.setValue(Notation.ACE.getValue());
        one.setSuit(Suit.HEARTS.getSuit());
        one.setNotation(Notation.ACE.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.DIAMONDS.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.FIVE.getValue());
        four.setSuit(Suit.CLUB.getSuit());
        four.setNotation(Notation.FIVE.getNotation());

        Card five = new Card();
        five.setValue(Notation.FIVE.getValue());
        five.setSuit(Suit.DIAMONDS.getSuit());
        five.setNotation(Notation.FIVE.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        Straight white = new Straight(cardCollection);

        assertFalse(white.check());
    }
}
