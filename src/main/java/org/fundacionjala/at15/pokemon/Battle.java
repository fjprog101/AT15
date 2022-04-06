package org.fundacionjala.at15.pokemon;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class Battle extends Entity {
    protected boolean battleOver = false;

    public abstract void fight();

    public Pokemon getPokemonAvailable(Trainer trainer) {
        double currentHitPoints;
        PokemonTeam pokemonTeam = trainer.getPokemonTeam();
        Pokemon currentPokemon = pokemonTeam.getPokemonTeam().get(0);
        for (int ind = 0; ind < pokemonTeam.getPokemonTeam().size(); ind++) {
            currentPokemon = pokemonTeam.getPokemonTeam().get(ind);
            currentHitPoints = currentPokemon.getHitPoints().getCurrentHitPoints();
            if (currentHitPoints > 0) {
                return currentPokemon;
            }
        }
        battleOver = true;
        return currentPokemon;
    }

    public boolean isBattleOver() {
        return battleOver;
    }
}