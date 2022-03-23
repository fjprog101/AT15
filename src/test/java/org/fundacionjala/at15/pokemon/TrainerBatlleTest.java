package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrainerBatlleTest {
    @Test
    public void itShouldReturnAvailablePokemon() {
        Pokemon pokemon1 = new Pokemon(100, "pikachu");
        Trainer trainer1 = new Trainer(pokemon1, "Trainer1");
        Pokemon pokemon2 = new Pokemon(100, "Squirtle");
        Trainer trainer2 = new Trainer(pokemon2, "Trainer2");
        TrainerBattle trainerBattle = new TrainerBattle(trainer1, trainer2);
        Pokemon pokemonAvailable = trainerBattle.getPokemonAvailable(trainer2);
        String actual = pokemonAvailable.getPokemonName();
        assertEquals("Squirtle", actual);
    }

    /*@Test
    public void itShouldReturnAWinner() {
        Pokemon pokemon1 = new Pokemon(100, "pikachu");
        Trainer trainer1 = new Trainer(pokemon1, "Trainer1");
        Pokemon pokemon2 = new Pokemon(100, "Squirtle");
        Trainer trainer2 = new Trainer(pokemon2, "Trainer2");
        TrainerBattle trainerBattle = new TrainerBattle(trainer1, trainer2);
        trainerBattle.fight();
        Trainer winner = trainerBattle.getWinner();
        String winnerName = winner.getName();
        assertEquals("Trainer1", winnerName);
    }*/
}
