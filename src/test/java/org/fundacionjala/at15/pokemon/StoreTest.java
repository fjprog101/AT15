package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StoreTest {
    @Test
    public void itShouldGiveAPokeballAndChargeCost() {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getPokeballs().size();
        Store.buyPokeball(trainer);

        assertEquals(initialSize + 1, trainer.getPokeballs().size());
        assertEquals(80, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldGiveAPotionAndChargeCost() {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getHealingPotions().size();
        Store.buyHealingPotion(trainer);

        assertEquals(initialSize + 1, trainer.getHealingPotions().size());
        assertEquals(60, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldAllowTrainerSellPokeball() {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getPokeballs().size();
        Store.sellPokeball(trainer);

        assertEquals(initialSize - 1, trainer.getPokeballs().size());
        assertEquals(120, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldAllowTrainerSellPotion() {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        Store.buyHealingPotion(trainer);
        int initialSize = trainer.getHealingPotions().size();
        Store.sellHealingPotion(trainer);

        assertEquals(initialSize - 1, trainer.getHealingPotions().size());
        assertEquals(100, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldNotAllowTrainerSellPokeball() {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        for (int index = 0; index < 6; index++) {
            Store.sellPokeball(trainer);
        }
        Store.sellPokeball(trainer);

        assertEquals(0, trainer.getPokeballs().size());
        assertEquals(200, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldNotAllowTrainerSellPotion() {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getHealingPotions().size();
        Store.sellHealingPotion(trainer);

        assertEquals(initialSize, trainer.getHealingPotions().size());
        assertEquals(100, trainer.getWallet().getMoneyInWallet());
    }
}
