package org.fundacionjala.at15.katas.pokerhands.sergio;

import java.util.*;


public class RepetitionIdentifier extends Identifier {
    private boolean isPoker = false;
    private int[] valuePokerHandChecked = new int[valuePokerHand.length];
    private ArrayList<Integer> value = new ArrayList<Integer>();
    private ArrayList<Integer> frequency = new ArrayList<Integer>();

    public RepetitionIdentifier(Splitter pokerHandSplitted) {
        this.valuePokerHand = pokerHandSplitted.getValuePokerHand();
    }

    public void theIdentification() {

    }

    public void frequencyIdentifier() {
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
