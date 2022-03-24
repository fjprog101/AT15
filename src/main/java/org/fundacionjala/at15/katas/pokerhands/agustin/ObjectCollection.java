package org.fundacionjala.at15.katas.pokerhands.agustin;

import java.util.ArrayList;

public abstract class ObjectCollection {
    protected Card[] cardSet;
    protected ArrayList<CardCollection> coll;

    public ObjectCollection(Card[] cardSet) {
        this.cardSet = cardSet;
        this.coll = new ArrayList<>();
        filterByValue();
        addItem();

    }

    public void filterByValue() {

        ArrayList<Integer> arrTemp = new ArrayList<>();
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

    public void addItem() {
        for (CardCollection collection : this.coll) {
            int count = 0;
            for (Card card : this.cardSet) {
                if (collection.getValue() == card.getValue()) {
                    count++;
                }
            }
            collection.setQuantity(count);
        }
    }

    public ArrayList<CardCollection> getColl() {
        return this.coll;
    }
}
