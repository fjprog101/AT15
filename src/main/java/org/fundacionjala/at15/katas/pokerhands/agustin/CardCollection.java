package org.fundacionjala.at15.katas.pokerhands.agustin;

public class CardCollection {
    private int value;
    private int quantity;

    public CardCollection(int valueParam) {
        this.value = valueParam;
        this.quantity = 0;
    }

    public int getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qua) {
        this.quantity = qua;
    }
}
