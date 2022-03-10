package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Game {
    private PokerHand h1;
    private PokerHand h2;

    public Game(PokerHand hand1, PokerHand hand2) {
        this.h1 = hand1;
        this.h2 = hand2;
    }

    public String whoWins() {
        String winner = "";
        if (highCard()) {
            winner = "Black wins";
        } else {
            winner = "White wins";
        }
        return winner;
    }

    public Boolean highCard() {
        boolean aux1;
        int auxH1 = h1.getPokerHandScore();
        int auxH2 = h2.getPokerHandScore();
        if ((auxH1 > auxH2)) {
            aux1 =  true;
        } else {
            aux1 =  false;
        }
        return aux1;
    }
}
