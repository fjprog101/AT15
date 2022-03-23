package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class StoreTest {
    @Test
    public void itShouldHaveTrainers() {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Store store = new Store();
        store.addTrainer(trainer);

        assertEquals("Ash", store.getTrainers().get(0).getName());
    }

    @Test
    public void itShouldGiveAPokeballAndChargeCost() {
        ArrayList<Pokeball> pokeballs = new ArrayList<Pokeball>();
        int initialSize = pokeballs.size();
        Wallet wallet = new Wallet();
        Store store = new Store();
        store.buyPokeball(pokeballs, wallet);

        assertEquals(initialSize + 1, pokeballs.size());
        assertEquals(80, wallet.getMoneyInWallet());
    }

    @Test
    public void itShouldGiveAPotionAndChargeCost() {
        ArrayList<HealingPotion> potions = new ArrayList<HealingPotion>();
        int initialSize = potions.size();
        Wallet wallet = new Wallet();
        Store store = new Store();
        store.buyHealingPotion(potions, wallet);

        assertEquals(initialSize + 1, potions.size());
        assertEquals(60, wallet.getMoneyInWallet());
    }
}
