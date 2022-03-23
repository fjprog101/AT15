package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

public class Town {
    private ArrayList<Pokemon> wildPokemons;
    private ArrayList<Trainer> trainers;
    private Store store;
    private static final int POKEMON_HP = 100;
    // Center center;
    // Gym gym;

    public Town() {
        wildPokemons = new ArrayList<Pokemon>();
        trainers = new ArrayList<Trainer>();
        store = new Store();
        // center = new Center();
        // gym = new Gym();
    }

    public void addWildPokemonsToTown(int wildPokemonsTotal) {
        for (int ind = 0; ind < wildPokemonsTotal; ind++) {
            wildPokemons.add(new Pokemon(POKEMON_HP, "Pokemon" + ind));
        }
    }

    public void addTrainersToTown(int trainersTotal) {
        for (int ind = 0; ind < trainersTotal; ind++) {
            Pokemon pokemon = new Pokemon(POKEMON_HP, "Pikachu");
            trainers.add(new Trainer(pokemon, "Trainer" + ind));
        }
    }

    public Store getStore() {
        return store;
    }

}
