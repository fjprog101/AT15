package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.ArrayList;

public class Grouper {
    private Card[] cards;
    private ArrayList<Group> groups;

    public Grouper(Card[] cards) {
        this.cards = cards;
        this.groups = new ArrayList<Group>();
        groupValues();
    }

    public void groupValues() {
        String value;
        ArrayList<String> groupTemp = new ArrayList<String>();
        for (Card card : this.cards) {
            value = String.valueOf(card.getStringValue());
            if (!groupTemp.contains(value)) {
                groupTemp.add(value);
                groups.add(new Group(value));
            }
        }
        groupTemp = null;
    }

    public ArrayList<Group> getGroups() {
        return this.groups;
    }
}
