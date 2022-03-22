package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlushSimpleHandTieBreakerTest {
    @Test
    public void itShouldDecideFinalWinnerBlackFirstHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("Q", "D");
        Card card3Player1 = new Card("5", "D");
        Card card4Player1 = new Card("6", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerBlackSecondHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("5", "D");
        Card card4Player1 = new Card("6", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerBlackThirdHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("6", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("Q", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerBlackFourthHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("7", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("T", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("8", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerBlackFifthHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("7", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("T", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalTie() {
        Card card1Player1 = new Card("5", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("7", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("T", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("Tie", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteFirstHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("Q", "D");
        Card card3Player1 = new Card("5", "D");
        Card card4Player1 = new Card("6", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("5", "H");
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
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteSecondHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("5", "D");
        Card card4Player1 = new Card("6", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteThirdHighCard() {
        Card card1Player1 = new Card("Q", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("6", "D");
        Card card5Player1 = new Card("3", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteFourthHighCard() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("9", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("T", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("8", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDecideFinalWinnerWhiteFifthHighCard() {
        Card card1Player1 = new Card("6", "D");
        Card card2Player1 = new Card("A", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("7", "D");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("T", "H");
        Card card3Player2 = new Card("5", "H");
        Card card4Player2 = new Card("7", "H");
        Card card5Player2 = new Card("A", "H");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new FlushSimpleHandTieBreaker();
        judge.theTieBreak(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }
}
