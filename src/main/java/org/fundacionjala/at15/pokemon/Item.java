package org.fundacionjala.at15.pokemon;

public abstract class Item {
    private int cost;

    public Item(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int newCost) {
        this.cost = newCost;
    }
}