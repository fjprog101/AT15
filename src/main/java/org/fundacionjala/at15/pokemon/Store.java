package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

public class Store {

    public static void buyPokeball(ArrayList<Pokeball> pokeballs, Wallet wallet) {
        pokeballs.add(new Pokeball());
        wallet.spendMoney(Pokeball.POKEBALL_COST);
    }

    public static void buyHealingPotion(ArrayList<HealingPotion> potions, Wallet wallet) {
        potions.add(new HealingPotion());
        wallet.spendMoney(HealingPotion.POTION_COST);
    }
}
