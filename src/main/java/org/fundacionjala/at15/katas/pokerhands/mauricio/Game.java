package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Game {
    private PokerHand hand1;
    private PokerHand hand2;
    private final int tie3 = 3;

    private final int player1Hand = 1;
    private final int player2Hand = 2;

    public Game(PokerHand hand1, PokerHand hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public String whoWins() {
        String winner = "";

        if (flushCards() == player1Hand) { // Ordered from high to low poker hand rank
            winner = "Black wins";
        } else if (flushCards() == player2Hand) {
            winner = "White wins";
        } else if (cardsWithTheSameValue() == player1Hand) {
            winner = "Black wins";
        } else if (cardsWithTheSameValue() == player2Hand) {
            winner = "White wins";
        } else if (highCard() == player1Hand) {
            winner = "Black wins";
        } else if (highCard() == player2Hand) {
            winner = "White wins";
        }
        return winner;
    }

    public int highCard() {
        int auxH1 = hand1.getPokerHandScore();
        int auxH2 = hand2.getPokerHandScore();
        int aux1 = compareTwohands(auxH1, auxH2);
        return aux1;
    }

    public int cardsWithTheSameValue() {
        int auxH1 = hand1.getPairCardsScore();
        int auxH2 = hand2.getPairCardsScore();
        int aux1 = compareTwohands(auxH1, auxH2);
        return aux1;
    }

    public int flushCards() {
        int auxH1 = hand1.getFlushScore();
        int auxH2 = hand2.getFlushScore();
        int aux1 = compareTwohands(auxH1, auxH2);
        return aux1;
    }

    public int compareTwohands(int auxHand1, int auxHand2) {
        int aux1 = 0;
        if (auxHand1 > auxHand2) { // 1 = wins black, 2 = wins white, 3 = empate
            aux1 = 1;
        } else if (auxHand1 < auxHand2) {
            aux1 = 2;
        } else if (auxHand1 == auxHand2) {
            aux1 = tie3;
        }
        return aux1;
    }
}
