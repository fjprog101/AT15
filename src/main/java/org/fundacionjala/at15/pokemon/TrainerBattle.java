package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.TrainerBattle.*;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;

public class TrainerBattle extends Battle {
    private Trainer trainer1;
    private Trainer trainer2;
    private boolean battleOver = false;
    private int turn = 0;

    public TrainerBattle(Trainer newTrainer1, Trainer newTrainer2) {
        this.path = BATTLE;
        this.identifier = Identifier.generateId(this);
        this.trainer1 = newTrainer1;
        this.trainer2 = newTrainer2;
    }

    // get pokemon available starting with the first (0)
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

    // get potency of movement pokemon
    public int getpotency(Pokemon pokemon) {
        Move move = pokemon.getMove(0);
        return move.getPotency();
    }

    @Override
    public void fight() {
        Pokemon pokemonTrainer1 = getPokemonAvailable(trainer1);
        Pokemon pokemonTrainer2 = getPokemonAvailable(trainer2);
        DamageReceived damageReceived;
        do {
            // if the turn is even, trainer1 attacks first
            turn++;
            if (turn % 2 != 0) {
                damageReceived = new DamageReceived(getpotency(pokemonTrainer1));
                damageReceived.affectHP(pokemonTrainer2);
            } else {
                damageReceived = new DamageReceived(getpotency(pokemonTrainer2));
                damageReceived.affectHP(pokemonTrainer1);
            }
            pokemonTrainer1 = getPokemonAvailable(trainer1);
            pokemonTrainer2 = getPokemonAvailable(trainer2);
        } while (!battleOver);
        // if the turn in wich the battle is over is odd, trainer 1 wins. Even, trainer
        // 2 wins
    }

    // get the winner and win money and lose money
    public Trainer getWinner() {
        if (turn % 2 != 0) {
            trainer1.getWallet().winMoney(MONEY);
            trainer2.getWallet().loseMoney(MONEY);
            return trainer1;
        } else {
            trainer2.getWallet().winMoney(MONEY);
            trainer1.getWallet().loseMoney(MONEY);
            return trainer2;
        }
    }

    public String getPrefix() {
        return "btt";
    }
}