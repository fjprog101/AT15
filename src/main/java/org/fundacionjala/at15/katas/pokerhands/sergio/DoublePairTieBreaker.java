package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoublePairTieBreaker extends TieBreaker {
    private List<Integer> value1 = new ArrayList<>();
    private List<Integer> value2 = new ArrayList<>();
    private List<Integer> frequencyValues1 = new ArrayList<>();
    private List<Integer> frequencyValues2 = new ArrayList<>();
    private List<Integer> doubleFrequencyPosition1 = new ArrayList<>();
    private List<Integer> doubleFrequencyPosition2 = new ArrayList<>();
    private int[] doubleValues1 = new int[2];
    private int[] doubleValues2 = new int[2];
    private int singlePosition1;
    private int singlePosition2;

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
        frequencyPosition1();
        frequencyPosition2();
        doubleValuesFill1();
        doubleValuesFill2();
        versus(1);


    }

    private void frequencyPosition1() {
        for (int ind = 0; ind < frequencyValues1.size(); ind++) {
            if (frequencyValues1.get(ind) == 2) {
                doubleFrequencyPosition1.add(ind);
            } else {
                singlePosition1 = ind;
            }
        }
    }

    private void frequencyPosition2() {
        for (int ind = 0; ind < frequencyValues2.size(); ind++) {
            if (frequencyValues2.get(ind) == 2) {
                doubleFrequencyPosition2.add(ind);
            } else {
                singlePosition2 = ind;
            }
        }
    }

    private void doubleValuesFill1() {
        doubleValues1[0] = value1.get(doubleFrequencyPosition1.get(0));
        doubleValues1[1] = value1.get(doubleFrequencyPosition1.get(1));
        Arrays.sort(doubleValues1);
    }

    private void doubleValuesFill2() {
        doubleValues2[0] = value2.get(doubleFrequencyPosition2.get(0));
        doubleValues2[1] = value2.get(doubleFrequencyPosition2.get(1));
        Arrays.sort(doubleValues1);
    }

    private void versus(int indicator) {
        if (doubleValues2[indicator] > doubleValues1[indicator]) {
            setFinalDecision(player2.getName());
        } else if (doubleValues2[indicator] < doubleValues1[indicator]) {
            setFinalDecision(player1.getName());
        } else {
            if (indicator == 0) {
                if (value1.get(singlePosition1) > value2.get(singlePosition2)) {
                    setFinalDecision(player1.getName());
                } else if (value1.get(singlePosition1) < value2.get(singlePosition2)) {
                    setFinalDecision(player2.getName());
                } else {
                    setFinalDecision("Tie");
                }
            } else {
                versus(indicator - 1);
            }
        }
    }
}
