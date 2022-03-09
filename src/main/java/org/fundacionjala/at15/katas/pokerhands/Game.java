package org.fundacionjala.at15.katas.pokerhands;

public class Game {
    //Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH
    //White wins. - with high card: Ace
    public String comparePlayersHands(String player1, String hand1, String player2, String hand2) {
        Hand winnerHand = new HighCard();
        String winner = winnerHand.compareHands(hand1, hand2);

        if (winner.equals(hand1)) {
            return player1 + " wins";
        } else {
            return player2 + " wins";
        }
    }
}
