package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.ArrayList;

public class Grouper {
    private Card[] cards;
    private ArrayList<String> groups;

    public Grouper(Card[] cards) {
        this.cards = cards;
        this.groups = new ArrayList<String>();
        groupValues();
    }

    public void groupValues() {
        String value;
        for (Card card : this.cards) {
            value = String.valueOf(card.getStringValue());
            if (!groups.contains(value)) {
                groups.add(value);
            }
        }
    }

    public ArrayList<String> getGroup() {
        return this.groups;
    }
}
