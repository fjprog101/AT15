package org.fundacionjala.at15.katas.pokerhands.adhemar;

public class Group {
    private String stringValue;
    private int quantity;

    public Group(String stringValue) {
        this.stringValue = stringValue;
        this.quantity = 0;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
