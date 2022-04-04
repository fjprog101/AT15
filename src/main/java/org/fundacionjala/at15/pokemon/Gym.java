package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Town.*;
import java.util.*;

import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;

public class Gym {
    private Pokemon gymLeaderPokemon = new Pokemon(STANDAR_POKEMON_HP, "gymLeaderPokemon");
    private Trainer gymLeader = new Trainer(gymLeaderPokemon, "gymLeader");
    private Pokemon pokemon1 = new Pokemon(STANDAR_POKEMON_HP, "pokemon1");
    private Trainer lowerRankingMember1 = new Trainer(pokemon1, "lowerRankingMember1");
    private Pokemon pokemon2 = new Pokemon(STANDAR_POKEMON_HP, "pokemon2");
    private Trainer lowerRankingMember2 = new Trainer(pokemon2, "lowerRankingMember2");

    private ArrayList<Trainer> trainers = new ArrayList<Trainer>();

    public Gym() throws IncompleteArguments {
        trainers.add(lowerRankingMember2);
        trainers.add(lowerRankingMember1);
        trainers.add(gymLeader);
    }

    public ArrayList<Trainer> getTrainers() {
        return this.trainers;
    }

    public Trainer getGymLeader() {
        int size = getTrainers().size() - 1;
        return getTrainers().get(size);
    }

    public boolean startTournament(Trainer trainer) {
        boolean isWinner = true;

        for (int index = 0; index < trainers.size(); index++) {
            TrainerBattle battle = new TrainerBattle(trainer, trainers.get(index));
            battle.fight();

            if (trainer.equals(battle.getWinner())) {
                if (index == trainers.size() - 1) {
                    trainer.winBadge();
                }
            } else {
                isWinner = false;
                break;
            }
        }

        return isWinner;
    }
}
