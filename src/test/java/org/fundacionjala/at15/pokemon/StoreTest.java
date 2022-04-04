package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.junit.Test;

public class StoreTest {
    @Test
    public void itShouldGiveAPokeballAndChargeCost() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getPokeballs().size();
        Store.buyPokeball(trainer);

        assertEquals(initialSize + 1, trainer.getPokeballs().size());
        assertEquals(80, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldGiveAPotionAndChargeCost() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getHealingPotion().size();
        Store.buyHealingPotion(trainer);

        assertEquals(initialSize + 1, trainer.getHealingPotion().size());
        assertEquals(60, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldAllowTrainerSellPokeball() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getPokeballs().size();
        Store.sellPokeball(trainer);

        assertEquals(initialSize - 1, trainer.getPokeballs().size());
        assertEquals(120, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldAllowTrainerSellPotion() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        Store.buyHealingPotion(trainer);
        int initialSize = trainer.getHealingPotion().size();
        Store.sellHealingPotion(trainer);

        assertEquals(initialSize - 1, trainer.getHealingPotion().size());
        assertEquals(100, trainer.getWallet().getMoneyInWallet());
    }

    @Test
    public void itShouldNotAllowTrainerSellPokeball() throws IncompleteArguments {
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
    public void itShouldNotAllowTrainerSellPotion() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(100, "pokemon");
        Trainer trainer = new Trainer(pokemon, "trainer");
        int initialSize = trainer.getHealingPotion().size();
        Store.sellHealingPotion(trainer);

        assertEquals(initialSize, trainer.getHealingPotion().size());
        assertEquals(100, trainer.getWallet().getMoneyInWallet());
    }
}
