package org.fundacionjala.at15.katas.pokerhands.sergio;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyIdentifier extends Identifier {
    private List<Card> pokerHand = new ArrayList<>();
    private int[] valuePokerHandChecked = new int[NUMBER_5];
    private int[] valuePokerHand = new int[NUMBER_5];
    private List<Integer> value = new ArrayList<>();
    private List<Integer> frequency = new ArrayList<>();
    private static final int NUMBER_5 = 5;

    public List<Integer> getFrequency() {
        return frequency;
    }

    public List<Integer> getValue() {
        return value;
    }

    public int[] getValuePokerHand() {
        return valuePokerHand;
    }

    public List<Card> getPokerHand() {
        return pokerHand;
    }

    private void valuePokerHandFill() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            valuePokerHand[ind] = pokerHand.get(ind).getValue();
        }
    }

    public void theIdentification(List<Card> newPokerHand) {
        this.pokerHand = newPokerHand;
        valuePokerHandFill();
        Arrays.sort(valuePokerHand);
        int checked = -1;
        for (int ind = 0; ind < valuePokerHand.length; ind++) {
            int count = 1;
            for (int ind2 = ind + 1; ind2 < valuePokerHand.length; ind2++) {
                if (valuePokerHand[ind] == valuePokerHand[ind2]) {
                    count++;
                    valuePokerHandChecked[ind2] = checked;
                }
            }
            if (valuePokerHandChecked[ind] != checked) {
                valuePokerHandChecked[ind] = count;
            }
        }
        for (int ind = 0; ind < valuePokerHandChecked.length; ind++) {
            if (valuePokerHandChecked[ind] != checked) {
                value.add(valuePokerHand[ind]);
                frequency.add(valuePokerHandChecked[ind]);
            }
        }
    }
}
