package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.PokemonTeam.*;

import java.util.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PokemonTeam {
    private ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();

    public PokemonTeam() {
    }

    public PokemonTeam(Pokemon pokemon) {
        pokemonTeam.add(pokemon);
    }

    public void addPokemon(Pokemon pokemon) {
        if (pokemonTeam.size() < MAX_QUANTITY_OF_POKEMONS) {
            pokemonTeam.add(pokemon);
        }
    }

    @XmlElement
    public ArrayList<Pokemon> getPokemonTeam() {
        return this.pokemonTeam;
    }
}