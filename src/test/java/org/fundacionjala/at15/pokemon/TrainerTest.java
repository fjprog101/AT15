package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrainerTest {
    @Test
    public void itShouldReturnCurrentPokemon() {
        Pokemon pokemon = new Pokemon(100);
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon expectedPokemon = new Pokemon(100);
        int actual = trainer.currentPokemon(0).getMaxHitPoints();
        int expected = expectedPokemon.getMaxHitPoints();
        assertEquals(expected, actual);
    }

    @Test
    public void itShouldRemoveOneHealingPotion() {
        Pokemon pokemon = new Pokemon(100);
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        HealingPotion healingPotion1 = new HealingPotion();
        HealingPotion healingPotion2 = new HealingPotion();
        trainer.getHealingPotion().add(healingPotion1);
        trainer.getHealingPotion().add(healingPotion2);
        trainer.useHealingPotion(0);
        assertEquals(1, trainer.getHealingPotion().size());
    }

    @Test
    public void itShouldRemoveOnePokeball() {
        Pokemon pokemon = new Pokemon(100);
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon wildPokemon = new Pokemon(10);
        Pokeball pokeball1 = new Pokeball();
        Pokeball pokeball2 = new Pokeball();
        trainer.getPokeballs().add(pokeball1);
        trainer.getPokeballs().add(pokeball2);
        trainer.usePokeball(wildPokemon);
        assertEquals(1, trainer.getPokeballs().size());
    }
}
