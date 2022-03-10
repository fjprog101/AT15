package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Game {
    public String comparePlayersHands(String player1, String hand1, String player2, String hand2) {
        Hand handsComparer = new Hand();
        String winner = handsComparer.compareHands(hand1, hand2);

        if (winner.equals(hand1)) {
            return player1 + " wins";
        } else {
            return player2 + " wins";
        }
    }
}
