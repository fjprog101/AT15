package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class StoreTest {
    // @Test
    // public void itShouldGiveAPokeballAndChargeCost() {
    //     ArrayList<Pokeball> pokeballs = new ArrayList<Pokeball>();
    //     int initialSize = pokeballs.size();
    //     Wallet wallet = new Wallet();
    //     Store.buyPokeball(pokeballs, wallet);

    //     assertEquals(initialSize + 1, pokeballs.size());
    //     assertEquals(80, wallet.getMoneyInWallet());
    // }

    @Test
    public void itShouldGiveAPotionAndChargeCost() {
        ArrayList<HealingPotion> potions = new ArrayList<HealingPotion>();
        int initialSize = potions.size();
        Wallet wallet = new Wallet();
        Store.buyHealingPotion(potions, wallet);

        assertEquals(initialSize + 1, potions.size());
        assertEquals(60, wallet.getMoneyInWallet());
    }
}
