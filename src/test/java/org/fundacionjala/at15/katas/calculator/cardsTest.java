package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at15.katas.pokerhands.CardSuit;
import org.fundacionjala.at15.katas.pokerhands.DeckOfCards;
//import org.fundacionjala.at15.katas.pokerhands.Cards;
import org.junit.Test;

public class cardsTest {
    @Test
    public void itShouldBeCardsClub() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  clubs = new ArrayList<>(List.of("2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AC"));
        List<String> compare = deck.clubsSuit();
        assertEquals(clubs, compare);
    }

    @Test
    public void itShouldBeCardsDiamons() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  diamons = new ArrayList<>(List.of("2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AD"));
        List<String> compare = deck.diamondsSuit();
        assertEquals(diamons, compare);
    }

    @Test
    public void itShouldBeCardsHearts() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  hearts = new ArrayList<>(List.of("2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AH"));
        List<String> compare = deck.heartsSuit();
        assertEquals(hearts, compare);
    }

    @Test
    public void itShouldBeCardsSpades() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  spades = new ArrayList<>(List.of("2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS"));
        List<String> compare = deck.spadesSuit();
        assertEquals(spades, compare);
    }
}
