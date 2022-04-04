package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.junit.Test;

public class GymTest {
    @Test
    public void getTrainersTest() throws IncompleteArguments {
        Gym gym = new Gym();
        ArrayList<Trainer> gymTrainers = gym.getTrainers();
        String leadersPokemon = gymTrainers.get(2).getName();
        assertEquals("gymLeader", leadersPokemon);
        String namePokemonLeader = gymTrainers.get(2).getPokemonTeam().getPokemonsOfTeam().get(0).getPokemonName();
        assertEquals("gymLeaderPokemon", namePokemonLeader);
    }

    @Test
    public void itShouldReturnTheGymLeader() throws IncompleteArguments {
        Gym gym = new Gym();
        Trainer gymLeader = gym.getGymLeader();
        assertEquals("gymLeader", gymLeader.getName());
        assertEquals("gymLeaderPokemon", gymLeader.getPokemonTeam().getPokemonsOfTeam().get(0).getPokemonName());
    }

    @Test
    public void itShouldHaveATournamentWinner() throws IncompleteArguments {
        Pokemon pikachu = new Pokemon(500, "Pikachu");
        Trainer trainer = new Trainer(pikachu, "Ash Ketchup");
        Gym gym = new Gym();
        boolean isWinner = gym.startTournament(trainer);
        assertTrue(isWinner);
    }

    @Test
    public void itShouldHaveATournamentLoser() throws IncompleteArguments {
        Pokemon pikachu = new Pokemon(200, "Pikachu");
        Trainer trainer = new Trainer(pikachu, "Ash Ketchup");
        Gym gym = new Gym();
        boolean isWinner = gym.startTournament(trainer);
        assertFalse(isWinner);
    }
}
