package org.fundacionjala.at15.pokemon;

public abstract class Item {
    protected int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int newCost) {
        this.cost = newCost;
    }
}