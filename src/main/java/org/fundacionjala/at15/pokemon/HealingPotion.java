package org.fundacionjala.at15.pokemon;

public class HealingPotion extends Item {
    public static final int POTION_COST = 40;

    public HealingPotion() {

        this.setCost(POTION_COST);
    }

    public void restoreHpToMax(Pokemon p1) {

        if (p1.getCurrentHitPoints() < p1.getMaxHitPoints()) {
            p1.heal();
        }
    }
}
