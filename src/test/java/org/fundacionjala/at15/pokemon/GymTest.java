package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GymTest {
    @Test
    public void getGymPokemonTeamsTest() {
        Gym gym = new Gym();
        ArrayList<PokemonTeam> gymPokemonTeams = gym.getGymPokemonTeams();
        String leadersPokemon = gymPokemonTeams.get(2).getPokemonTeam().get(0).getPokemonName();
        assertEquals("gymLeaderPokemon", leadersPokemon);
        int hitpoints = gymPokemonTeams.get(2).getPokemonTeam().get(0).getHitPoints().getCurrentHitPoints();
        assertEquals(100, hitpoints);
    }

    @Test
    public void getTrainersTest() {
        Gym gym = new Gym();
        ArrayList<Trainer> gymTrainers = gym.getTrainers();
        String leadersPokemon = gymTrainers.get(2).getName();
        assertEquals("gymLeader", leadersPokemon);
        String namePokemonLeader = gymTrainers.get(2).getPokemonTeam().getPokemonTeam().get(0).getPokemonName();
        assertEquals("gymLeaderPokemon", namePokemonLeader);
    }
}