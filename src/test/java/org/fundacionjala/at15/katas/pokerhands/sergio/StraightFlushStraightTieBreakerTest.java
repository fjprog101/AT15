package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StraightFlushStraightTieBreakerTest {
    @Test
    public void itShouldDecideFinalWinnerBlackStraightFlush() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("3", "D");
        Card card3Player1 = new Card("4", "D");
        Card card4Player1 = new Card("5", "D");
        Card card5Player1 = new Card("6", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("J", "H");
        Card card3Player2 = new Card("Q", "H");
        Card card4Player2 = new Card("K", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new StraightFlushStraightTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerBlackStraight() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("3", "H");
        Card card3Player1 = new Card("4", "S");
        Card card4Player1 = new Card("5", "D");
        Card card5Player1 = new Card("6", "S");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("J", "S");
        Card card3Player2 = new Card("Q", "S");
        Card card4Player2 = new Card("K", "C");
        Card card5Player2 = new Card("A", "D");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new StraightFlushStraightTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteStraightFlush() {
        Card card1Player1 = new Card("7", "D");
        Card card2Player1 = new Card("8", "D");
        Card card3Player1 = new Card("9", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("4", "H");
        Card card2Player2 = new Card("5", "H");
        Card card3Player2 = new Card("6", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("8", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new StraightFlushStraightTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteStraight() {
        Card card1Player1 = new Card("7", "H");
        Card card2Player1 = new Card("8", "C");
        Card card3Player1 = new Card("9", "S");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("J", "H");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("4", "H");
        Card card2Player2 = new Card("5", "S");
        Card card3Player2 = new Card("6", "C");
        Card card4Player2 = new Card("7", "S");
        Card card5Player2 = new Card("8", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new StraightFlushStraightTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalDecisionTieStraightFlush() {
        Card card1Player1 = new Card("7", "D");
        Card card2Player1 = new Card("8", "D");
        Card card3Player1 = new Card("9", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("7", "H");
        Card card2Player2 = new Card("8", "H");
        Card card3Player2 = new Card("9", "H");
        Card card4Player2 = new Card("T", "H");
        Card card5Player2 = new Card("J", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new StraightFlushStraightTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Tie", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalDecisionTieStraight() {
        Card card1Player1 = new Card("7", "D");
        Card card2Player1 = new Card("8", "S");
        Card card3Player1 = new Card("9", "C");
        Card card4Player1 = new Card("T", "H");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("7", "S");
        Card card2Player2 = new Card("8", "H");
        Card card3Player2 = new Card("9", "H");
        Card card4Player2 = new Card("T", "S");
        Card card5Player2 = new Card("J", "C");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new StraightFlushStraightTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Tie", judge.getFinalDecision());
    }
}
