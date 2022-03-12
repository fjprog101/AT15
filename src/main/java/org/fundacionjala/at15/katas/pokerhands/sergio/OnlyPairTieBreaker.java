package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlyPairTieBreaker extends TieBreaker {
    private List<Integer> value1 = new ArrayList<>();
    private List<Integer> value2 = new ArrayList<>();
    private List<Integer> frequencyValues1 = new ArrayList<>();
    private List<Integer> frequencyValues2 = new ArrayList<>();
    private int doubleFrequencyPosition1;
    private int doubleFrequencyPosition2;
    private int[] singleValues1 = new int[NUMBER_3];
    private int[] singleValues2 = new int[NUMBER_3];
    private List<Integer> singlePosition1 = new ArrayList<>();
    private List<Integer> singlePosition2 = new ArrayList<>();

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
        singleValuesFill1();
        singleValuesFill2();
        versus(2);

    }

    private void frequencyPosition1() {
        for (int ind = 0; ind < frequencyValues1.size(); ind++) {
            if (frequencyValues1.get(ind) == 2) {
                doubleFrequencyPosition1 = ind;
            } else {
                singlePosition1.add(ind);
            }
        }
    }

    private void frequencyPosition2() {
        for (int ind = 0; ind < frequencyValues2.size(); ind++) {
            if (frequencyValues2.get(ind) == 2) {
                doubleFrequencyPosition2 = ind;
            } else {
                singlePosition2.add(ind);
            }
        }
    }

    private void singleValuesFill1() {
        singleValues1[0] = value1.get(singlePosition1.get(0));
        singleValues1[1] = value1.get(singlePosition1.get(1));
        singleValues1[2] = value1.get(singlePosition1.get(2));
        Arrays.sort(singleValues1);
    }

    private void singleValuesFill2() {
        singleValues2[0] = value2.get(singlePosition2.get(0));
        singleValues2[1] = value2.get(singlePosition2.get(1));
        singleValues2[2] = value2.get(singlePosition2.get(2));
        Arrays.sort(singleValues1);
    }

    private void versus(int indicator) {
        if (value1.get(doubleFrequencyPosition1) > value2.get(doubleFrequencyPosition2)) {
            setFinalDecision(player1.getName());
        } else if (value1.get(doubleFrequencyPosition1) < value2.get(doubleFrequencyPosition2)) {
            setFinalDecision(player2.getName());
        } else {
            if (singleValues1[indicator] > singleValues2[indicator]) {
                setFinalDecision(player1.getName());
            } else if (singleValues1[indicator] < singleValues2[indicator]) {
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
}
