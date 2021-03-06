package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

public class Center implements HPAffecter {
    private ArrayList<Pokemon> pokemonTeam = new ArrayList<Pokemon>();

    public void healTeam(PokemonTeam team) {
        this.pokemonTeam = team.getPokemonsOfTeam();
        for (int ind = 0; ind < pokemonTeam.size(); ind++) {
            affectHP(pokemonTeam.get(ind));
        }
    }

    public void affectHP(Pokemon pokemon) {
        pokemon.getHitPoints().fullRestore();
    }
}
