package org.fundacionjala.at15.katas.pokerhands.agustin;

import java.util.ArrayList;

public abstract class ObjectCollection {
    protected Card[] cardSet;
    protected ArrayList<CardCollection> coll;

    public ObjectCollection(Card[] cardSet) {
        this.cardSet = cardSet;
        this.coll = new ArrayList<CardCollection>();

    }

    public void filterByValue() {

        ArrayList<Integer> arrTemp = new ArrayList<Integer>();
        int value;

        for (Card card : this.cardSet) {
            value = card.getValue();
            if (!arrTemp.contains(value)) {
                arrTemp.add(value);
                coll.add(new CardCollection(value));
            }
        }
        arrTemp = null;
    }

    public ArrayList<CardCollection> getColl() {
        return this.coll;
    }
}
