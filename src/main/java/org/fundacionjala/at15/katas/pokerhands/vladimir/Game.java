package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Game {

    public String playGame(PokerHands pokerHand, Hand blackHand, Hand whiteHand) {
        return pokerHand.sameHandComparation(blackHand, whiteHand);
    }
}
