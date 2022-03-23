package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PokerTieBreakerTest {
    @Test
    public void itShouldDecideFinalWinnerBlack() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("2", "H");
        Card card3Player1 = new Card("2", "S");
        Card card4Player1 = new Card("2", "C");
        Card card5Player1 = new Card("6", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("T", "D");
        Card card3Player2 = new Card("T", "C");
        Card card4Player2 = new Card("T", "S");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new PokerTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhite() {
        Card card1Player1 = new Card("A", "D");
        Card card2Player1 = new Card("A", "H");
        Card card3Player1 = new Card("A", "S");
        Card card4Player1 = new Card("A", "C");
        Card card5Player1 = new Card("6", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("T", "D");
        Card card3Player2 = new Card("T", "C");
        Card card4Player2 = new Card("T", "S");
        Card card5Player2 = new Card("2", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new PokerTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

}
