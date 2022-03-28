package org.fundacionjala.at15.pokemon;

public class WildPokemonBattle extends Battle {
    private Trainer trainer;
    private Pokemon wildPokemon;
    private boolean wildPokemonCapture = false;
    private boolean pokemonLeft = false;
    private int turn = 0;
    public WildPokemonBattle(Trainer trainer, Pokemon pokemon) {
        this.trainer = trainer;
        this.wildPokemon = pokemon;
    }
    public Pokemon getActualPokemon(Trainer trainer1) {
        int actualHitPoints;
        PokemonTeam team = trainer1.getPokemonTeam();
        Pokemon actualPokemon = team.getPokemonsOfTeam().get(0);
        for (int index = 0; index < team.getPokemonsOfTeam().size(); index++) {
            actualPokemon = team.getPokemonsOfTeam().get(index);
            actualHitPoints = actualPokemon.getHitPoints().getCurrentHitPoints();
            if (actualHitPoints > 0) {
                return actualPokemon;
            }
        }
        pokemonLeft = true;
        return actualPokemon;
    }
    public int getpotency(Pokemon pokemon) {
        Move move = pokemon.getMove(1);
        return move.getPotency();
    }
    @Override
    public void fight() {
        Pokemon myPokemon = getActualPokemon(trainer);
        DamageReceived damage;
        do {
            turn++;
            if (turn % 2 != 0) {
                damage = new DamageReceived(getpotency(myPokemon));
                damage.affectHP(wildPokemon);
            } else {
                damage = new DamageReceived(getpotency(wildPokemon));
                damage.affectHP(myPokemon);
                if (wildPokemon.getHitPoints().is20Percent()) {
                    trainer.usePokeball(wildPokemon);
                    wildPokemonCapture = true;
                    break;
                }
            }
            myPokemon = getActualPokemon(trainer);
        } while (!pokemonLeft);
    }
    public Boolean isCaptured() {
        return wildPokemonCapture;
    }
}