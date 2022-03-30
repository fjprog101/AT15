package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;

public class Town extends Entity {
    private ArrayList<Pokemon> wildPokemons;
    private ArrayList<Trainer> trainers;
    private Store store;
    private Center center;
    private Gym gym;

    public Town() {
        this.path = TOWN;
        this.identifier = Identifier.generateId(this);
        wildPokemons = new ArrayList<Pokemon>();
        trainers = new ArrayList<Trainer>();
        store = new Store();
        center = new Center();
        gym = new Gym();
    }

    public void addWildPokemonsToTown(Pokemon... pokemon) {
        for (int index = 0; index < pokemon.length; index++) {
            wildPokemons.add(pokemon[index]);
        }
    }

    public void addTrainersToTown(Trainer... trainer) {
        for (int index = 0; index < trainer.length; index++) {
            trainers.add(trainer[index]);
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

    public String getPrefix() {
        return "twn";
    }
}
