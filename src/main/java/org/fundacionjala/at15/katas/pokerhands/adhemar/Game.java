package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Game {
    private Player[] players;
    private String result;

    public Game(Player[] players) {
        this.players = players;
        obtainResult();
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public boolean isTie() {
        int pivot = players[0].getPokerHand().getHand().getRank();
        for (Player player : players) {
            if (player.getPokerHand().getHand().getRank() != pivot) {
                return false;
            }
            pivot = player.getPokerHand().getHand().getRank();
        }
        return true;
    }

    public Player getWinner() {

        Player winner = players[0];
        for (Player player : this.players) {
            if (player.getPokerHand().getHand().getRank() > winner.getPokerHand().getHand().getRank()) {
                winner = player;
            }
        }
        return winner;
    }

    public void obtainResult() {
        if (isTie()) {
            this.result = "Tie.";
            return;
        }
        Player winner = getWinner();
        this.result = winner.getName() + " wins. - with " + winner.getPokerHand().getHand().getHandName();
    }

    public String getResult() {
        return this.result;
    }
}
