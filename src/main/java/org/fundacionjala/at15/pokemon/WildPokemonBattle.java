package org.fundacionjala.at15.pokemon;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.commands.exceptions.TrainerItemsException;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class WildPokemonBattle extends Battle {
    private final Trainer trainer;
    private final Pokemon wildPokemon;
    private boolean wildPokemonCapture = false;
    private int turn = 0;

    public WildPokemonBattle() {
        this.trainer = null;
        this.wildPokemon = null;
    }

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
        boolean pokemonLeft = false;
        do {
            turn++;
            if (turn % 2 != 0) {
                damage = new DamageReceived(getPotency(myPokemon));
                damage.affectHP(wildPokemon, myPokemon.getPokemonType());
            } else {
                damage = new DamageReceived(getPotency(wildPokemon));
                damage.affectHP(myPokemon, wildPokemon.getPokemonType());
                if (wildPokemon.getHitPoints().is20Percent()) {
                    try {
                        trainer.usePokeball(wildPokemon);
                        wildPokemonCapture = true;
                    } catch (TrainerItemsException e) {
                        System.out.println("ERROR: ");
                        e.printStackTrace(System.out);
                    }
                    break;
                }
            }
            myPokemon = getPokemonAvailable(trainer);
        } while (!pokemonLeft); // WARNING: this variable is not updated inside the loop.
    }

    public Boolean isCaptured() {
        return wildPokemonCapture;
    }

    public String getPrefix() {
        return "wbt";
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Pokemon getWildPokemon() {
        return wildPokemon;
    }

    public boolean isWildPokemonCapture() {
        return wildPokemonCapture;
    }

    public int getTurn() {
        return turn;
    }
}