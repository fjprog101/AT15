package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHand extends Hand {
    //private String[] valueHand;
    private ValueHandPair pair = new ValueHandPair();

    public String getValueHand(String[] hand) {
        final String value = pair.comare(hand);
        return value;
    }
}