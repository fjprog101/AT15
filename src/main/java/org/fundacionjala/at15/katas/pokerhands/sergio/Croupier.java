package org.fundacionjala.at15.katas.pokerhands.sergio;

public class Croupier {
    private Player player1;
    private Player player2;
    private String firstDecision;
    private String finalDecision;
    private PointsAssigner player1Points;
    private PointsAssigner player2Points;
    private static final int HAND_POINTS_100 = 100;
    private static final int HAND_POINTS_90 = 90;
    private static final int HAND_POINTS_80 = 80;
    private static final int HAND_POINTS_70 = 70;
    private static final int HAND_POINTS_60 = 60;
    private static final int HAND_POINTS_50 = 50;
    private static final int HAND_POINTS_40 = 40;
    private static final int HAND_POINTS_30 = 30;
    private static final int HAND_POINTS_20 = 20;

    public Croupier(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        doFirstDecision();
        doFinalDecision();
    }

    public String getFinalDecision() {
        return finalDecision;
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

    public void doFinalDecision() {
        if (!firstDecision.equals("Tie")) {
            this.finalDecision = firstDecision;
        } else if (player1Points.getHandPoints() == HAND_POINTS_100) {
            TieBreaker tieBreaker100 = new StraightFlushStraightTieBreaker();
            tieBreaker100.theTieBreak(player1, player2);
            finalDecision = tieBreaker100.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_90) {
            TieBreaker tieBreaker90 = new PokerTieBreaker();
            tieBreaker90.theTieBreak(player1, player2);
            finalDecision = tieBreaker90.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_80) {
            TieBreaker tieBreaker80 = new FullHouseThreesomeTieBreaker();
            tieBreaker80.theTieBreak(player1, player2);
            finalDecision = tieBreaker80.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_70) {
            TieBreaker tieBreaker70 = new FlushSimpleHandTieBreaker();
            tieBreaker70.theTieBreak(player1, player2);
            finalDecision = tieBreaker70.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_60) {
            TieBreaker tieBreaker60 = new StraightFlushStraightTieBreaker();
            tieBreaker60.theTieBreak(player1, player2);
            finalDecision = tieBreaker60.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_50) {
            TieBreaker tieBreaker50 = new FullHouseThreesomeTieBreaker();
            tieBreaker50.theTieBreak(player1, player2);
            finalDecision = tieBreaker50.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_40) {
            TieBreaker tieBreaker40 = new DoublePairTieBreaker();
            tieBreaker40.theTieBreak(player1, player2);
            finalDecision = tieBreaker40.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_30) {
            TieBreaker tieBreaker30 = new OnlyPairTieBreaker();
            tieBreaker30.theTieBreak(player1, player2);
            finalDecision = tieBreaker30.getFinalDecision();
        } else if (player1Points.getHandPoints() == HAND_POINTS_20) {
            TieBreaker tieBreaker20 = new FlushSimpleHandTieBreaker();
            tieBreaker20.theTieBreak(player1, player2);
            finalDecision = tieBreaker20.getFinalDecision();
        }

    }

}
