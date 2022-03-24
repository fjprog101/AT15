package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TownTest {

    @Test
    public void itShouldAddPokemonsToTown() {
        Town paleta = new Town();
        paleta.addWildPokemonsToTown(2);
        String pokemonName = paleta.getWildPokemons().get(0).getPokemonName();
        String expected = "Pokemon";
        assertEquals(expected, pokemonName);

    }

    @Test
    public void itShouldAddTrainersToTown() {
        Town paleta = new Town();
        paleta.addTrainersToTown(4);

        int numberOfTrainer = paleta.getTrainers().size();
        int expected = 4;
        assertEquals(expected, numberOfTrainer);

    }

    @Test
    public void itShouldAddAStoreToTown() {
        Town paleta = new Town();
        Store fourTwenty = new Store();
        paleta.getStore().getClass();

        assertEquals(fourTwenty.getClass(), paleta.getStore().getClass());
    }
    @Test
    public void itShouldAddACenterToTown() {
        Town paleta = new Town();
        Center pokemonCenter = new Center();
        paleta.getStore().getClass();

        assertEquals(pokemonCenter.getClass(), paleta.getCenter().getClass());
    }
    @Test
    public void itShouldAddAGymTown() {
        Town paleta = new Town();
        Gym pokemonGym = new Gym();
        paleta.getStore().getClass();

        assertEquals(pokemonGym.getClass(), paleta.getGym().getClass());
    }
}
