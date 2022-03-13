package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Cards.Notation;
import org.fundacionjala.at15.katas.pokerhands.agustin.Cards.Suit;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HandTest {
    @Test
    public void itShouldReturnPair() {
        Card H2 = new Card();
        H2.setValue(Notation.TWO.getValue());
        H2.setSuit(Suit.HEARTS.getSuit());
        H2.setNotation(Notation.TWO.getNotation());

        Card D3 = new Card();
        D3.setValue(Notation.THREE.getValue());
        D3.setSuit(Suit.DIAMONDS.getSuit());
        D3.setNotation(Notation.THREE.getNotation());

        Card S5 = new Card();
        S5.setValue(Notation.FIVE.getValue());
        S5.setSuit(Suit.SPADES.getSuit());
        S5.setNotation(Notation.FIVE.getNotation());

        Card C9 = new Card();
        C9.setValue(Notation.NINE.getValue());
        C9.setSuit(Suit.CLUB.getSuit());
        C9.setNotation(Notation.NINE.getNotation());

        Card KD = new Card();
        KD.setValue(Notation.KING.getValue());
        KD.setSuit(Suit.DIAMONDS.getSuit());
        KD.setNotation(Notation.KING.getNotation());

        Card[] cardCollection =  {H2,D3,S5,C9,KD};
        Hand white = new Hand(cardCollection);
        assertFalse(white.pair());
    }

    @Test
    public void itShouldReturnTwoPairs() {
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

        Card[] cardCollection =  {one,two,three,four,five};
        Hand white = new Hand(cardCollection);
        assertFalse(white.twoPairs());
    }
}
