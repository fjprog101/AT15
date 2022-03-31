package org.fundacionjala.at15.pokemon;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;

public class WildPokemonBattle extends Battle {
    private final Trainer trainer;
    private final Pokemon wildPokemon;
    private boolean wildPokemonCapture = false;
    private boolean pokemonLeft = false;
    private int turn = 0;

    public WildPokemonBattle(Trainer trainer, Pokemon pokemon) {
        this.type = BATTLE;
        this.id = Identifier.generateId(this);
        this.trainer = trainer;
        this.wildPokemon = pokemon;
    }

    public int getPotency(Pokemon pokemon) {
        Move move = pokemon.getMove(0);
        return move.getPotency();
    }

    @Override
    public void fight() {
        Pokemon myPokemon = getPokemonAvailable(trainer);
        DamageReceived damage;
        do {
            turn++;
            if (turn % 2 != 0) {
                damage = new DamageReceived(getPotency(myPokemon));
                damage.affectHP(wildPokemon);
            } else {
                damage = new DamageReceived(getPotency(wildPokemon));
                damage.affectHP(myPokemon);
                if (wildPokemon.getHitPoints().is20Percent()) {
                    trainer.usePokeball(wildPokemon);
                    wildPokemonCapture = true;
                    break;
                }
            }
            myPokemon = getPokemonAvailable(trainer);
        } while (!pokemonLeft);
    }

    public Boolean isCaptured() {
        return wildPokemonCapture;
    }

    public String getPrefix() {
        return "wbt";
    }
}