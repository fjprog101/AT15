package org.fundacionjala.at15.pokemon;

import java.util.*;

public class PokemonTeam {
    private ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();
    private final int maxQuantityOfPokemons = 6;

    public PokemonTeam(Pokemon pokemon) {
        pokemonTeam.add(pokemon);
    }

    public void addPokemon(Pokemon pokemon) {
        if (pokemonTeam.size() < maxQuantityOfPokemons) {
            pokemonTeam.add(pokemon);
        }
    }

    public ArrayList<Pokemon> getPokemonTeam() {
        return this.pokemonTeam;
    }
}