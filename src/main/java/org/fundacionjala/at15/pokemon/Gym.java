package org.fundacionjala.at15.pokemon;

import java.util.*;

public class Gym {
    private PokemonTeam leaderPokemonTeam;
    private PokemonTeam pokemonTeam1;
    private PokemonTeam pokemonTeam2;
    private Trainer gymLeader;
    private Trainer lowerRankingMember1;
    private Trainer lowerRankingMember2;

    private ArrayList<PokemonTeam> gymPokemonTeams = new ArrayList<PokemonTeam>();

    public Gym() {
        gymPokemonTeams.add(leaderPokemonTeam);
        gymPokemonTeams.add(pokemonTeam1);
        gymPokemonTeams.add(pokemonTeam2);
    }


    public ArrayList<PokemonTeam> getGymPokemonTeams() {
        return gymPokemonTeams;
    }
}
