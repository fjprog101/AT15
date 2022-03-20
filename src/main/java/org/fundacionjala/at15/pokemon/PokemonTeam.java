package org.fundacionjala.at15.pokemon;

import java.util.*;

public class PokemonTeam {
    //the currente class works with strings but those strings will be changed to Pokemons in the future
    //ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();
    private final int maxQuantityOfPokemons = 6;
    private ArrayList<String> pokemonTeam = new ArrayList<String>();

    public PokemonTeam(String pokemon) {
        pokemonTeam.add(pokemon);
    }

    public void addPokemon(String pokemon) {
        if (pokemonTeam.size() < maxQuantityOfPokemons) {
            pokemonTeam.add(pokemon);
        }
    }

    public ArrayList<String> getPokemonTeam() {
        return this.pokemonTeam;
    }
}