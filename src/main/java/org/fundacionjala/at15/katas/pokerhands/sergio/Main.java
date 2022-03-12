package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Card card1Player1 = new Card("Q", "S");
        Card card2Player1 = new Card("Q", "D");
        Card card3Player1 = new Card("K", "D");
        Card card4Player1 = new Card("7", "C");
        Card card5Player1 = new Card("J", "H");
        List<Card> cardListPlayer1 = new ArrayList<>();
        cardListPlayer1.add(card1Player1);
        cardListPlayer1.add(card2Player1);
        cardListPlayer1.add(card3Player1);
        cardListPlayer1.add(card4Player1);
        cardListPlayer1.add(card5Player1);
        Card card1Player2 = new Card("Q", "H");
        Card card2Player2 = new Card("Q", "C");
        Card card3Player2 = new Card("K", "H");
        Card card4Player2 = new Card("5", "S");
        Card card5Player2 = new Card("7", "D");
        List<Card> cardListPlayer2 = new ArrayList<>();
        cardListPlayer2.add(card1Player2);
        cardListPlayer2.add(card2Player2);
        cardListPlayer2.add(card3Player2);
        cardListPlayer2.add(card4Player2);
        cardListPlayer2.add(card5Player2);
        Player player1 = new Player(cardListPlayer1, "White");
        Player player2 = new Player(cardListPlayer2, "Black");
        TieBreaker judge = new OnlyPairTieBreaker();
        judge.theTieBreak(player1, player2);


    }
}
