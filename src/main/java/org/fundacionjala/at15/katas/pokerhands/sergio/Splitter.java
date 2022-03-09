package org.fundacionjala.at15.katas.pokerhands.sergio;

public class Splitter {
    private String[] pokerHand;
    private int[] valuesPokerHand = new int[NUMBER_5];
    private String[] suitPokerHand = new String[NUMBER_5];
    private String[] valuesHand = new String[NUMBER_5];
    private static final int NUMBER_5 = 5;


    public Splitter(String[] pokerHand) {
        this.pokerHand = pokerHand;

    }

    public String getValuesHand(int ind) {
        return this.valuesHand[ind];
    }

    public int getValuesPokerHand(int ind) {
        return this.valuesPokerHand[ind];
    }

    public String getSuitPokerHand(int ind) {
        return this.suitPokerHand[ind];
    }

    public void theSplit() {
        theSplitValue();
        valuesHandCorrection();
        valuesHandToInt();
        theSplitSuit();
    }

    public void theSplitValue() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            valuesHand[ind] = pokerHand[ind].substring(0, 1);
        }
    }

    public void valuesHandCorrection() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            if (valuesHand[ind].equals("T")) {
                this.valuesHand[ind] = "10";
            } else if (valuesHand[ind].equals("J")) {
                this.valuesHand[ind] = "11";
            } else if (valuesHand[ind].equals("Q")) {
                this.valuesHand[ind] = "12";
            } else if (valuesHand[ind].equals("K")) {
                this.valuesHand[ind] = "13";
            } else if (valuesHand[ind].equals("A")) {
                valuesHand[ind] = "14";
            }
        }
    }

    public void valuesHandToInt() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            valuesPokerHand[ind] = Integer.parseInt(valuesHand[ind]);
        }
    }

    public void theSplitSuit() {
        for (int ind = 0; ind < NUMBER_5; ind++) {
            suitPokerHand[ind] = pokerHand[ind].substring(1, 2);
        }
    }

}
