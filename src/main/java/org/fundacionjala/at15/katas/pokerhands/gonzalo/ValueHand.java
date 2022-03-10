package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHand extends Hand {
    private String value;
    private ValueHandPair pair = new ValueHandPair();

    public String getValueHand(String[] hand) {
        if (pair.comare(hand) != null) {
            value = pair.comare(hand);
        } else {
            value = "no pair";
        }
        return value;
    }
}