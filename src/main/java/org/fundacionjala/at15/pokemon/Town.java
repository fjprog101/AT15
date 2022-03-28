package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Town.*;
import java.util.ArrayList;

public class Town {
    private ArrayList<Pokemon> wildPokemons;
    private ArrayList<Trainer> trainers;
    private Store store;
    private Center center;
    private Gym gym;

    public Town() {
        wildPokemons = new ArrayList<Pokemon>();
        trainers = new ArrayList<Trainer>();
        store = new Store();
        center = new Center();
        gym = new Gym();
    }

    public void addWildPokemonsToTown(int wildPokemonsTotal) {
        for (int ind = 0; ind < wildPokemonsTotal; ind++) {
            wildPokemons.add(ind, new Pokemon(STANDAR_POKEMON_HP, "Pokemon"));
        }
    }

    public void addTrainersToTown(int trainersTotal) {
        for (int ind = 0; ind < trainersTotal; ind++) {
            Pokemon pokemon = new Pokemon(STANDAR_POKEMON_HP, "Pikachu");
            trainers.add(ind, new Trainer(pokemon, "Trainer"));
        }
    }

    public Center getCenter() {
        return center;
    }

    public Store getStore() {
        return store;
    }

    public Gym getGym() {
        return gym;
    }

    public ArrayList<Pokemon> getWildPokemons() {
        return wildPokemons;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

}
