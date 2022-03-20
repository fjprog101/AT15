package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

public class Store {
    public static final int POKEBALL_COST = 20;
    public static final int POTION_COST = 40;

    public static void buyPokeball(ArrayList<Pokeball> pokeballs) {
        pokeballs.add(new Pokeball());
    }

    public static void buyPotion(ArrayList<Potion> potions) {
        potions.add(new Potions());
    }
}
