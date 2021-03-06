package org.fundacionjala.at15.pokemon;

public abstract class Battle extends Entity {
    protected boolean battleOver = false;

    public abstract void fight();

    public Pokemon getPokemonAvailable(Trainer trainer) {
        int currentHitPoints;
        PokemonTeam pokemonTeam = trainer.getPokemonTeam();
        Pokemon currentPokemon = pokemonTeam.getPokemonsOfTeam().get(0);
        for (int ind = 0; ind < pokemonTeam.getPokemonsOfTeam().size(); ind++) {
            currentPokemon = pokemonTeam.getPokemonsOfTeam().get(ind);
            currentHitPoints = currentPokemon.getHitPoints().getCurrentHitPoints();
            if (currentHitPoints > 0) {
                return currentPokemon;
            }
        }
        battleOver = true;
        return currentPokemon;
    }
}