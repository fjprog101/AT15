package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GymTest {
    @Test
    public void getTrainersTest() {
        Gym gym = new Gym();
        ArrayList<Trainer> gymTrainers = gym.getTrainers();
        String leadersPokemon = gymTrainers.get(2).getName();
        assertEquals("gymLeader", leadersPokemon);
        String namePokemonLeader = gymTrainers.get(2).getPokemonTeam().getPokemonsOfTeam().get(0).getPokemonName();
        assertEquals("gymLeaderPokemon", namePokemonLeader);
    }


    @Test
    public void itShouldReturnTheGymLeader() {
        Gym gym = new Gym();
        Trainer gymLeader = gym.getGymLeader();
        assertEquals("gymLeader", gymLeader.getName());
        assertEquals("gymLeaderPokemon", gymLeader.getPokemonTeam().getPokemonsOfTeam().get(0).getPokemonName());
    }
}
