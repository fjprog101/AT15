package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.Arrays;

public class FlushSimpleHandTieBreaker extends TieBreaker {
    private int[] valuePokerHand1 = new int[NUMBER_5];
    private int[] valuePokerHand2 = new int[NUMBER_5];

    public void theTieBreak(Player newPlayer1, Player newPlayer2) {
        this.player1 = newPlayer1;
        this.player2 = newPlayer2;
        FrequencyIdentifier frequency1 = new FrequencyIdentifier();
        frequency1.theIdentification(player1.getPokerHand());
        FrequencyIdentifier frequency2 = new FrequencyIdentifier();
        frequency2.theIdentification(player2.getPokerHand());
        this.valuePokerHand1 = frequency1.getValuePokerHand();
        this.valuePokerHand2 = frequency2.getValuePokerHand();
        Arrays.sort(valuePokerHand1);
        Arrays.sort(valuePokerHand2);
        versus(NUMBER_4);
    }

    private void versus(int indicator) {
        if (valuePokerHand1[indicator] > valuePokerHand2[indicator]) {
            setFinalDecision(player1.getName());
        } else if (valuePokerHand1[indicator] < valuePokerHand2[indicator]) {
            setFinalDecision(player2.getName());
        } else {
            if (indicator == 0) {
                setFinalDecision("Tie");
            } else {
                versus(indicator - 1);
            }
        }
    }
}
