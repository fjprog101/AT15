package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.exceptions.TrainerItemsException;
import org.junit.Test;

public class TrainerTest {
    @Test
    public void itShouldReturnCurrentPokemon() {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon expectedPokemon = new Pokemon(100, "pikachu");
        int actual = trainer.currentPokemon(0).getHitPoints().getMaxHitPoints();
        int expected = expectedPokemon.getHitPoints().getMaxHitPoints();
        assertEquals(expected, actual);
    }

    @Test
    public void itShouldRemoveOneHealingPotion() throws TrainerItemsException {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        HealingPotion healingPotion1 = new HealingPotion();
        HealingPotion healingPotion2 = new HealingPotion();
        trainer.getHealingPotions().add(healingPotion1);
        trainer.getHealingPotions().add(healingPotion2);
        trainer.useHealingPotion(0);
        assertEquals(1, trainer.getHealingPotions().size());
    }

    @Test(expected = TrainerItemsException.class)
    public void itShouldThrowsTheItemPotionException() throws TrainerItemsException {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        trainer.useHealingPotion(0);
    }

    @Test
    public void itShouldRemoveOnePokeball() throws TrainerItemsException {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon wildPokemon = new Pokemon(100, "pikachu");
        wildPokemon.getHitPoints().setCurrentHitPoints(10);
        Pokeball pokeball1 = new Pokeball();
        trainer.getPokeballs().add(pokeball1);
        trainer.usePokeball(wildPokemon);
        assertEquals(2, trainer.getPokemonTeam().getPokemonTeam().size());
    }

    @Test(expected = TrainerItemsException.class)
    public void itShouldHave0Pokeballs() throws TrainerItemsException {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon wildPokemon = new Pokemon(100, "pikachu");
        wildPokemon.getHitPoints().setCurrentHitPoints(10);
        trainer.getPokeballs().clear();
        trainer.usePokeball(wildPokemon);
        assertEquals(0, trainer.getPokeballs().size());
    }

    @Test
    public void itShouldAddPokemon() throws TrainerItemsException {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon wildPokemon = new Pokemon(10, "pikachu");
        Pokeball pokeball1 = new Pokeball();
        Pokeball pokeball2 = new Pokeball();
        trainer.getPokeballs().add(pokeball1);
        trainer.getPokeballs().add(pokeball2);
        trainer.usePokeball(wildPokemon);
        assertEquals(6, trainer.getPokeballs().size());
    }

    @Test
    public void itShouldAddABadge() {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        trainer.winBadge();
        int actualBadge = trainer.getBadge();
        int expectedBadge = 1;
        assertEquals(expectedBadge, actualBadge);
    }
}
