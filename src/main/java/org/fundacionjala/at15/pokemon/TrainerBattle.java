package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.TrainerBattle.*;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TrainerBattle extends Battle {
    private final Trainer trainer1;
    private final Trainer trainer2;
    private int turn = 0;

    public TrainerBattle() {
        this.trainer1 = null;
        this.trainer2 = null;
    }

    public TrainerBattle(Trainer newTrainer1, Trainer newTrainer2) {
        this.type = BATTLE;
        this.id = Identifier.generateId(this);
        this.trainer1 = newTrainer1;
        this.trainer2 = newTrainer2;
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
                damageReceived.affectHP(pokemonTrainer2, pokemonTrainer1.getPokemonType());
            } else {
                damageReceived = new DamageReceived(getpotency(pokemonTrainer2));
                damageReceived.affectHP(pokemonTrainer1, pokemonTrainer2.getPokemonType());
            }
            pokemonTrainer1 = getPokemonAvailable(trainer1);
            pokemonTrainer2 = getPokemonAvailable(trainer2);
        } while (!battleOver);
        // if the turn in which the battle is over is odd, trainer 1 wins. Even, trainer
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

    public Trainer getTrainer1() {
        return this.trainer1;
    }

    public Trainer getTrainer2() {
        return this.trainer2;
    }

    public boolean getBattleOver() {
        return this.battleOver;
    }

    public int getTurn() {
        return turn;
    }
}