package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.junit.Test;

public class TownTest {

    @Test
    public void itShouldAddPokemonsToTown() throws IncompleteArguments {
        Town paleta = new Town();
        Pokemon wildPokemon1 = new Pokemon(100, "Pikachu");
        Pokemon wildPokemon2 = new Pokemon(100, "Squirtle");

        paleta.addWildPokemonsToTown(wildPokemon1, wildPokemon2);
        String pokemonName = paleta.getWildPokemons().get(0).getPokemonName();
        String expected = "Pikachu";
        assertEquals(expected, pokemonName);

    }

    @Test
    public void itShouldAddTrainersToTown() throws IncompleteArguments {
        Town paleta = new Town();
        Trainer trainer1 = new Trainer(new Pokemon(100, "Pikachu"), "Ash");
        Trainer trainer2 = new Trainer(new Pokemon(100, "Squirtle"), "Brook");
        paleta.addTrainersToTown(trainer1, trainer2);

        int numberOfTrainer = paleta.getTrainers().size();
        int expected = 2;
        assertEquals(expected, numberOfTrainer);

    }

    @Test
    public void itShouldAddAStoreToTown() throws IncompleteArguments {
        Town paleta = new Town();
        Store fourTwenty = new Store();
        paleta.getStore().getClass();

        assertEquals(fourTwenty.getClass(), paleta.getStore().getClass());
    }

    @Test
    public void itShouldAddACenterToTown() throws IncompleteArguments {
        Town paleta = new Town();
        Center pokemonCenter = new Center();
        paleta.getStore().getClass();

        assertEquals(pokemonCenter.getClass(), paleta.getCenter().getClass());
    }

    @Test
    public void itShouldAddAGymTown() throws IncompleteArguments {
        Town paleta = new Town();
        Gym pokemonGym = new Gym();
        paleta.getStore().getClass();

        assertEquals(pokemonGym.getClass(), paleta.getGym().getClass());
    }
}
