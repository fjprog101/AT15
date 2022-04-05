package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
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
    public void itShouldRemoveOneHealingPotion() {
        Pokemon pokemon = new Pokemon(100, "pikachu");
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
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon wildPokemon = new Pokemon(100, "pikachu");
        wildPokemon.getHitPoints().setCurrentHitPoints(10);
        Pokeball pokeball1 = new Pokeball();
        trainer.getPokeballs().add(pokeball1);
        trainer.usePokeball(wildPokemon);
        assertEquals(2, trainer.getPokemonTeam().getPokemonsOfTeam().size());
    }

    @Test
    public void itShouldHave0Pokeballs() {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "Trainer1");
        Pokemon wildPokemon = new Pokemon(100, "pikachu");
        wildPokemon.getHitPoints().setCurrentHitPoints(10);

        trainer.getPokeballs().clear();

        trainer.usePokeball(wildPokemon);
        assertEquals(0, trainer.getPokeballs().size());
    }

    @Test
    public void itShouldAddPokemon() {
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
