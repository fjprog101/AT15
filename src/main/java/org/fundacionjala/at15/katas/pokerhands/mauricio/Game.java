package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Game {
    private PokerHand h1;
    private PokerHand h2;
    private final int tie3 = 3;
    private final int tie4 = 4;

    public Game(PokerHand hand1, PokerHand hand2) {
        this.h1 = hand1;
        this.h2 = hand2;
    }

    public String whoWins() {
        String winner = "";

        // if (pairs() == 1) {
        // winner = "Black wins";

        // } else if (pairs() == 2) {
        // winner = "White wins";
        //
        // } else if (pairs() == tie4) {
        // winner = "Tie!";
        //
        // } else if (highCard() == 1) {
        // winner = "Black wins";
        //
        // } else if (highCard() == 2) {
        // winner = "White wins";
        //
        // } else if (highCard() == tie3) {
        // winner = "Tie!";
        // }

        if (cardsWithTheSameValue() == 1) {
            winner = "Black wins";
        } else if (cardsWithTheSameValue() == 2) {
            winner = "White wins";
        } else if (highCard() == 1) {
            winner = "Black wins";
        } else if (highCard() == 2) {
            winner = "White wins";
        }

        return winner;
    }

    public int highCard() {
        int aux1 = 0;
        int auxH1 = h1.getPokerHandScore();
        int auxH2 = h2.getPokerHandScore();
        if (auxH1 > auxH2) { // 1 = wins black, 2 = wins white, 3 = empate
            aux1 = 1;
        } else if (auxH1 < auxH2) {
            aux1 = 2;
        } else if (auxH1 == auxH2) {
            aux1 = tie3;
        }
        return aux1;
    }

    public int cardsWithTheSameValue() {
        int aux1 = 0;
        int auxH1 = h1.getPairCardsScore();
        int auxH2 = h2.getPairCardsScore();
        if (auxH1 > auxH2) { // 1 = wins black, 2 = wins white, 3 = empate
            aux1 = 1;
        } else if (auxH1 < auxH2) {
            aux1 = 2;
        } else if (auxH1 == auxH2) {
            aux1 = tie4;
        }
        return aux1;
    }

}
