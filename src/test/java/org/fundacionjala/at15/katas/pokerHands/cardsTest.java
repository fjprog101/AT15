package org.fundacionjala.at15.katas.pokerHands;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at15.katas.pokerhands.DeckOfCards;
import org.junit.Test;

public class cardsTest {
    @Test
    public void itShouldBeCardsClub() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  clubs = new ArrayList<>();
        clubs.add("2C");
        clubs.add("3C");
        clubs.add("4C");
        clubs.add("5C");
        clubs.add("6C");
        clubs.add("7C");
        clubs.add("8C");
        clubs.add("9C");
        clubs.add("TC");
        clubs.add("JC");
        clubs.add("QC");
        clubs.add("KC");
        clubs.add("AC");
        List<String> compare = deck.clubsSuit();
        assertEquals(clubs, compare);
    }

    @Test
    public void itShouldBeCardsDiamons() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  diamons = new ArrayList<>();
        diamons.add("2D");
        diamons.add("3D");
        diamons.add("4D");
        diamons.add("5D");
        diamons.add("6D");
        diamons.add("7D");
        diamons.add("8D");
        diamons.add("9D");
        diamons.add("TD");
        diamons.add("JD");
        diamons.add("QD");
        diamons.add("KD");
        diamons.add("AD");
        List<String> compare = deck.diamondsSuit();
        assertEquals(diamons, compare);
    }

    @Test
    public void itShouldBeCardsHearts() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  hearts = new ArrayList<>();
        hearts.add("2H");
        hearts.add("3H");
        hearts.add("4H");
        hearts.add("5H");
        hearts.add("6H");
        hearts.add("7H");
        hearts.add("8H");
        hearts.add("9H");
        hearts.add("TH");
        hearts.add("JH");
        hearts.add("QH");
        hearts.add("KH");
        hearts.add("AH");
        List<String> compare = deck.heartsSuit();
        assertEquals(hearts, compare);
    }

    @Test
    public void itShouldBeCardsSpades() {
        DeckOfCards deck = new DeckOfCards();
        List<String>  spades = new ArrayList<>();
        spades.add("2S");
        spades.add("3S");
        spades.add("4S");
        spades.add("5S");
        spades.add("6S");
        spades.add("7S");
        spades.add("8S");
        spades.add("9S");
        spades.add("TS");
        spades.add("JS");
        spades.add("QS");
        spades.add("KS");
        spades.add("AS");
        List<String> compare = deck.spadesSuit();
        assertEquals(spades, compare);
    }
}
