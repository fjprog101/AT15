package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class FullHouseThreesomeTieBreaker extends TieBreaker {
    private List<Integer> value1 = new ArrayList<>();
    private List<Integer> value2 = new ArrayList<>();
    private List<Integer> frequencyValues1 = new ArrayList<>();
    private List<Integer> frequencyValues2 = new ArrayList<>();

    public void theTieBreak(Player newPlayer1, Player newPlayer2) {
        this.player1 = newPlayer1;
        this.player2 = newPlayer2;
        FrequencyIdentifier frequency1 = new FrequencyIdentifier();
        frequency1.theIdentification(player1.getPokerHand());
        FrequencyIdentifier frequency2 = new FrequencyIdentifier();
        frequency2.theIdentification(player2.getPokerHand());
        this.value1 = frequency1.getValue();
        this.value2 = frequency2.getValue();
        this.frequencyValues1 = frequency1.getFrequency();
        this.frequencyValues2 = frequency2.getFrequency();
        int indicator1 = 0;
        for (int ind = 0; ind < frequencyValues1.size(); ind++) {
            if (frequencyValues1.get(ind) == NUMBER_3) {
                indicator1 = ind;
            }
        }
        int indicator2 = 0;
        for (int ind = 0; ind < frequencyValues2.size(); ind++) {
            if (frequencyValues2.get(ind) == NUMBER_3) {
                indicator2 = ind;
            }
        }
        if (value1.get(indicator1) > value2.get(indicator2)) {
            setFinalDecision(player1.getName());
        } else {
            setFinalDecision(player2.getName());
        }

    }
}
