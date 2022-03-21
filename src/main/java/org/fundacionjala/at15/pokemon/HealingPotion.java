package org.fundacionjala.at15.pokemon;

public class HealingPotion extends Item {
    private int moneyCost;
    public static final int POTION_COST = 40;

    public HealingPotion() {
        this.moneyCost = POTION_COST;
    }

    /*
     * public void restoreHpToMax(Pokemon p1) {
     *
     * if(p1.getCurrentHealthPoints() < p1.getMaxHealthPoints()){
     * setCurrentHealthPointsWithPotion(p1.getMaxHealthPoints())
     * }
     * }
     */
    public int getCost() { // este metodo entraria al spendMoney de la clase Wallet
        return moneyCost;
    }
}
