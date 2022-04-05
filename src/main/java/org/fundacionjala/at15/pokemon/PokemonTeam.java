package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.PokemonTeam.*;

import java.util.*;

public class PokemonTeam {
    private ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();

    public PokemonTeam(Pokemon pokemon) {
        pokemonTeam.add(pokemon);
    }

    public void addPokemon(Pokemon pokemon) {
        if (pokemonTeam.size() < MAX_QUANTITY_OF_POKEMONS) {
            pokemonTeam.add(pokemon);
        }
    }

    public ArrayList<Pokemon> getPokemonsOfTeam() {
        return this.pokemonTeam;
    }
}