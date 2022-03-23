package org.fundacionjala.at15.pokemon;

public class WildPokemonBattle extends Battle {

    private Pokemon wildPokemon;
    private Pokemon actualPokemon;
    private Trainer trainer;
    private boolean wildPokemonCapture = false;
    private boolean pokemonLeft = false;
    private final double datTwo = 0.2;
    private int turn = 0;
    public WildPokemonBattle(Trainer trainer, Pokemon pokemon) {
        this.trainer = trainer;
        this.wildPokemon = pokemon;
    }

    public Pokemon getActualPokemon(Trainer trainer1) {
        int actualHitPoints;
        PokemonTeam team = trainer1.getPokemonTeam();
        for (int index = 0; index < team.getPokemonTeam().size(); index++) {
            actualPokemon = team.getPokemonTeam().get(index);
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
        int twentyPercentHP = (int) (wildPokemon.getHitPoints().getCurrentHitPoints() * datTwo);
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
                if (wildPokemon.getHitPoints().getCurrentHitPoints() <= twentyPercentHP) {
                    trainer.usePokeball(wildPokemon);
                    wildPokemonCapture = true;
                    break;
                }
            }
            myPokemon = getActualPokemon(trainer);
        } while (!pokemonLeft);
    }

    public boolean getResult() {
        return this.wildPokemonCapture;
    }
}