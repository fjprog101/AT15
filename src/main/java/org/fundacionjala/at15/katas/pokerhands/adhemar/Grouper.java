package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.ArrayList;

public abstract class Grouper {
    protected Card[] cards;
    protected ArrayList<Group> groups;

    public Grouper(Card[] cards) {
        this.cards = cards;
        this.groups = new ArrayList<Group>();
        groupValues();
        countGroups();
    }

    public void groupValues() {
        String value;
        ArrayList<String> groupTemp = new ArrayList<String>();
        for (Card card : this.cards) {
            value = card.getStringValue();
            if (!groupTemp.contains(value)) {
                groupTemp.add(value);
                groups.add(new Group(value));
            }
        }
        groupTemp = null;
    }

    public void countGroups() {
        for (Group group : this.groups) {
            int counter = 0;
            for (Card card : this.cards) {
                if (group.getStringValue() == card.getStringValue()) {
                    counter++;
                }
            }
            group.setQuantity(counter);
        }
    }

    public ArrayList<Group> getGroups() {
        return this.groups;
    }

    public Card[] getCards() {
        return this.cards;
    }
}
