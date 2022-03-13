package org.fundacionjala.at15.katas.pokerhands.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CroupierTest {

    @Test
    public void itShouldDeclareWinnerWhite() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("3", "D");
        Card card3Player1 = new Card("4", "D");
        Card card4Player1 = new Card("5", "D");
        Card card5Player1 = new Card("6", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("2", "D");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("2", "S");
        Card card4Player2 = new Card("2", "C");
        Card card5Player2 = new Card("6", "D");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieStraightFlush() {
        Card card1Player1 = new Card("7", "D");
        Card card2Player1 = new Card("8", "D");
        Card card3Player1 = new Card("9", "D");
        Card card4Player1 = new Card("T", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("2", "H");
        Card card2Player2 = new Card("3", "H");
        Card card3Player2 = new Card("4", "H");
        Card card4Player2 = new Card("5", "H");
        Card card5Player2 = new Card("6", "H");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTiePoker() {
        Card card1Player1 = new Card("8", "S");
        Card card2Player1 = new Card("8", "H");
        Card card3Player1 = new Card("8", "C");
        Card card4Player1 = new Card("8", "D");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("7", "H");
        Card card2Player2 = new Card("7", "C");
        Card card3Player2 = new Card("7", "D");
        Card card4Player2 = new Card("7", "S");
        Card card5Player2 = new Card("6", "H");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieFullHouse() {
        Card card1Player1 = new Card("8", "S");
        Card card2Player1 = new Card("8", "H");
        Card card3Player1 = new Card("8", "C");
        Card card4Player1 = new Card("J", "S");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("7", "H");
        Card card2Player2 = new Card("7", "C");
        Card card3Player2 = new Card("7", "D");
        Card card4Player2 = new Card("6", "S");
        Card card5Player2 = new Card("6", "H");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieFlush() {
        Card card1Player1 = new Card("A", "S");
        Card card2Player1 = new Card("8", "S");
        Card card3Player1 = new Card("7", "S");
        Card card4Player1 = new Card("J", "S");
        Card card5Player1 = new Card("2", "S");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("7", "H");
        Card card2Player2 = new Card("6", "H");
        Card card3Player2 = new Card("2", "H");
        Card card4Player2 = new Card("K", "H");
        Card card5Player2 = new Card("T", "H");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieStraight() {
        Card card1Player1 = new Card("A", "S");
        Card card2Player1 = new Card("K", "H");
        Card card3Player1 = new Card("T", "C");
        Card card4Player1 = new Card("Q", "S");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("7", "H");
        Card card2Player2 = new Card("6", "D");
        Card card3Player2 = new Card("5", "S");
        Card card4Player2 = new Card("9", "C");
        Card card5Player2 = new Card("8", "H");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieThreesome() {
        Card card1Player1 = new Card("A", "S");
        Card card2Player1 = new Card("A", "H");
        Card card3Player1 = new Card("A", "C");
        Card card4Player1 = new Card("Q", "S");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("K", "H");
        Card card2Player2 = new Card("6", "D");
        Card card3Player2 = new Card("K", "S");
        Card card4Player2 = new Card("9", "C");
        Card card5Player2 = new Card("K", "D");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieDoublePair() {
        Card card1Player1 = new Card("A", "S");
        Card card2Player1 = new Card("A", "H");
        Card card3Player1 = new Card("7", "C");
        Card card4Player1 = new Card("7", "S");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("A", "H");
        Card card2Player2 = new Card("6", "D");
        Card card3Player2 = new Card("A", "C");
        Card card4Player2 = new Card("6", "C");
        Card card5Player2 = new Card("K", "D");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerWhiteTieSimpleHand() {
        Card card1Player1 = new Card("A", "S");
        Card card2Player1 = new Card("3", "H");
        Card card3Player1 = new Card("7", "C");
        Card card4Player1 = new Card("2", "S");
        Card card5Player1 = new Card("J", "D");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("T", "H");
        Card card2Player2 = new Card("6", "D");
        Card card3Player2 = new Card("9", "C");
        Card card4Player2 = new Card("3", "S");
        Card card5Player2 = new Card("8", "D");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("White", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareWinnerBlack() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("2", "H");
        Card card3Player1 = new Card("2", "C");
        Card card4Player1 = new Card("5", "D");
        Card card5Player1 = new Card("5", "S");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("2", "D");
        Card card2Player2 = new Card("2", "H");
        Card card3Player2 = new Card("2", "S");
        Card card4Player2 = new Card("2", "C");
        Card card5Player2 = new Card("6", "D");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("Black", judge.getFinalDecision());
    }

    @Test
    public void itShouldDeclareTie() {
        Card card1Player1 = new Card("2", "D");
        Card card2Player1 = new Card("Q", "H");
        Card card3Player1 = new Card("2", "C");
        Card card4Player1 = new Card("J", "D");
        Card card5Player1 = new Card("5", "S");
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(card1Player1);
        cardList1.add(card2Player1);
        cardList1.add(card3Player1);
        cardList1.add(card4Player1);
        cardList1.add(card5Player1);
        Card card1Player2 = new Card("2", "H");
        Card card2Player2 = new Card("Q", "S");
        Card card3Player2 = new Card("2", "S");
        Card card4Player2 = new Card("5", "D");
        Card card5Player2 = new Card("J", "S");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("Tie", judge.getFinalDecision());
    }
}
