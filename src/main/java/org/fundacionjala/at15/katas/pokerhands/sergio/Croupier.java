package org.fundacionjala.at15.katas.pokerhands.sergio;

public class Croupier {
    private Player player1;
    private Player player2;
    private String firstDecision;
    private String finalDecision;
    private PointsAssigner player1Points;
    private PointsAssigner player2Points;

    public Croupier(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        doFirstDecision();
    }

    public String getFirstDecision() {
        return firstDecision;
    }

    public void doFirstDecision() {
        this.player1Points = new PointsAssigner(player1.getPokerHand());
        this.player2Points = new PointsAssigner(player2.getPokerHand());


        if (player1Points.getHandPoints() > player2Points.getHandPoints()) {
            firstDecision = player1.getName();
        } else if (player1Points.getHandPoints() < player2Points.getHandPoints()) {
            firstDecision = player2.getName();
        } else if (player1Points.getHandPoints() == player2Points.getHandPoints()) {
            firstDecision = "Tie";
        }

    }

}
