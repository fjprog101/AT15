package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.ArrayList;

public class Grouper {
    private Card[] cards;
    private ArrayList<String> group;

    public Grouper(Card[] cards) {
        this.cards = cards;
        this.group = new ArrayList<String>();
        groupValues();
    }

    public void groupValues() {
        String value;
        for (Card card : this.cards) {
            value = String.valueOf(card.getCharValue());
            if (!group.contains(value)) {
                group.add(value);
            }
        }
    }

    public ArrayList<String> getGroup() {
        return this.group;
    }
}
