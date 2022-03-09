package org.fundacionjala.at15.katas.pokerhands;

import java.util.ArrayList;
import java.util.List;

public class ValueHand {
    private List<String> valueHand;
    private List<String> hand;
    public List<String> hand(String card1, String card2, String card3, String card4, String card5) {
        valueHand = new ArrayList<String>();
        //call CompareHandValue class
        return valueHand;
    }

    public List<String> getValueHand(String card1, String card2, String card3, String card4, String card5) {
        hand = new ArrayList<String>();
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        hand.add(card5);
        return hand;
    }
}