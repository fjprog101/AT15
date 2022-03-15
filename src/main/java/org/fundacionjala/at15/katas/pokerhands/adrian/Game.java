package org.fundacionjala.at15.katas.pokerhands.adrian;

public class Game {
    public String comparePlayersHands(String player1, Hand hand01, String player2, Hand hand02) {
        String hand1 = hand01.getHand();
        String hand2 = hand02.getHand();
        HandHandler handsComparer = new HandHandler();
        String winner = handsComparer.compareHands(hand1, hand2);

        if (winner.equals(hand1)) {
            return player1 + " wins";
        } else if (winner.equals(hand2)) {
            return player2 + " wins";
        } else {
            return winner;
        }
    }
}
