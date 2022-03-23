package org.fundacionjala.at15.pokemon;

import java.util.*;

public class Gym {
    private final int hitpoints = 100;
    private Pokemon gymLeaderPokemon = new Pokemon(hitpoints, "gymLeaderPokemon");
    private Trainer gymLeader = new Trainer(gymLeaderPokemon, "gymLeader");
    private Pokemon pokemon1 = new Pokemon(hitpoints, "pokemon1");
    private Trainer lowerRankingMember1 = new Trainer(pokemon1, "lowerRankingMember1");
    private Pokemon pokemon2 = new Pokemon(hitpoints, "pokemon2");
    private Trainer lowerRankingMember2 = new Trainer(pokemon2, "lowerRankingMember2");

    private ArrayList<PokemonTeam> gymPokemonTeams = new ArrayList<PokemonTeam>();
    private ArrayList<Trainer> trainers = new ArrayList<Trainer>();

    public Gym() {
        trainers.add(lowerRankingMember2);
        trainers.add(lowerRankingMember1);
        trainers.add(gymLeader);
        gymPokemonTeams.add(lowerRankingMember2.getPokemonTeam());
        gymPokemonTeams.add(lowerRankingMember1.getPokemonTeam());
        gymPokemonTeams.add(gymLeader.getPokemonTeam());
    }


    public ArrayList<PokemonTeam> getGymPokemonTeams() {
        return this.gymPokemonTeams;
    }

    public ArrayList<Trainer> getTrainers() {
        return this.trainers;
    }
}
