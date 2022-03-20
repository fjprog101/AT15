package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class StoreTest {
    @Test
    public void itShouldGiveAPokeballAndChargeCost() {
        ArrayList<Pokeball> pokeballs = new ArrayList<Pokeball>();
        int initialSize = pokeballs.size();
        Store.buyPokeball(pokeballs);

        assertEquals(initialSize + 1, pokeballs.size());
    }

    @Test
    public void itShouldGiveAPotionAndChargeCost() {
        ArrayList<Potion> potions = new ArrayList<Potion>();
        int initialSize = potions.size();
        Store.buyPokeball(potions);

        assertEquals(initialSize + 1, potions.size());
    }
}
