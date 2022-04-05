package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TownTest {

    @Test
    public void itShouldAddPokemonsToTown() {
        Town paleta = new Town("Paleta");
        Pokemon wildPokemon1 = new Pokemon(100, "Pikachu");
        Pokemon wildPokemon2 = new Pokemon(100, "Squirtle");

        paleta.addWildPokemonsToTown(wildPokemon1, wildPokemon2);
        String pokemonName = paleta.getWildPokemons().get(0).getPokemonName();
        String expected = "Pikachu";
        assertEquals(expected, pokemonName);

    }

    @Test
    public void itShouldAddTrainersToTown() {
        Town paleta = new Town("Paleta");
        Trainer trainer1 = new Trainer(new Pokemon(100, "Pikachu"), "Ash");
        Trainer trainer2 = new Trainer(new Pokemon(100, "Squirtle"), "Brook");
        paleta.addTrainersToTown(trainer1, trainer2);

        int numberOfTrainer = paleta.getTrainers().size();
        int expected = 2;
        assertEquals(expected, numberOfTrainer);

    }

    @Test
    public void itShouldAddAStoreToTown() {
        Town paleta = new Town("Paleta");
        Store fourTwenty = new Store();
        paleta.getStore().getClass();

        assertEquals(fourTwenty.getClass(), paleta.getStore().getClass());
    }

    @Test
    public void itShouldAddACenterToTown() {
        Town paleta = new Town("Paleta");
        Center pokemonCenter = new Center();
        paleta.getStore().getClass();

        assertEquals(pokemonCenter.getClass(), paleta.getCenter().getClass());
    }

    @Test
    public void itShouldAddAGymTown() {
        Town paleta = new Town("Paleta");
        Gym pokemonGym = new Gym();
        paleta.getStore().getClass();

        assertEquals(pokemonGym.getClass(), paleta.getGym().getClass());
    }
}
