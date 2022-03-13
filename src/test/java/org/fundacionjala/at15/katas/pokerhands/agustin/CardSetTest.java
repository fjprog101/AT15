package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Cards.Notation;
import org.fundacionjala.at15.katas.pokerhands.agustin.Cards.Suit;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardSetTest {

    @Test
    public void itShouldReturnHighestCardInHand() {
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
        CardSet white = new Hand(cardCollection);
        white.setHighestCard();

        assertEquals(13, white.getHighestCard().getValue());
    }

    @Test
    public void itShouldReturnTheCardCollection() {
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
        CardSet white = new Hand(cardCollection);

        assertEquals("2H 3D 5S 9C KD ", white.getHandNotation());
    }

    @Test
    public void itShouldHaveCardCollection() {
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
        CardSet white = new Hand(cardCollection);
        Card[] collection = white.getCardCollection();

        assertArrayEquals(collection, white.getCardCollection());
    }
}
