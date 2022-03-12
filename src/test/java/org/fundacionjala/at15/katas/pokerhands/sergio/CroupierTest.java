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

        assertEquals("White", judge.getFirstDecision());
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

        assertEquals("Black", judge.getFirstDecision());
    }

    @Test
    public void itShouldDeclareTie() {
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
        Card card3Player2 = new Card("2", "C");
        Card card4Player2 = new Card("5", "D");
        Card card5Player2 = new Card("5", "S");
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(card1Player2);
        cardList2.add(card2Player2);
        cardList2.add(card3Player2);
        cardList2.add(card4Player2);
        cardList2.add(card5Player2);

        Player player1 = new Player(cardList1, "White");
        Player player2 = new Player(cardList2, "Black");

        Croupier judge = new Croupier(player1, player2);

        assertEquals("Tie", judge.getFirstDecision());
    }
}
