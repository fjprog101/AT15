package org.fundacionjala.at15.katas.pokerhands.agustin;

import org.fundacionjala.at15.katas.pokerhands.agustin.Games.Flush;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlushTest {
    @Test
    public void itShouldReturnFlushTrue() {
        Card one = new Card();
        one.setValue(Notation.SIX.getValue());
        one.setSuit(Suit.SPADES.getSuit());
        one.setNotation(Notation.SIX.getNotation());

        Card two = new Card();
        two.setValue(Notation.THREE.getValue());
        two.setSuit(Suit.SPADES.getSuit());
        two.setNotation(Notation.THREE.getNotation());

        Card three = new Card();
        three.setValue(Notation.TWO.getValue());
        three.setSuit(Suit.SPADES.getSuit());
        three.setNotation(Notation.TWO.getNotation());

        Card four = new Card();
        four.setValue(Notation.FOUR.getValue());
        four.setSuit(Suit.SPADES.getSuit());
        four.setNotation(Notation.FOUR.getNotation());

        Card five = new Card();
        five.setValue(Notation.FIVE.getValue());
        five.setSuit(Suit.SPADES.getSuit());
        five.setNotation(Notation.FIVE.getNotation());

        Card[] cardCollection = {one,two,three,four,five};
        Flush white = new Flush(cardCollection);

        assertTrue(white.check());
    }
}
