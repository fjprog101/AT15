package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.junit.Test;

public class IdentifierTest {

    @Test
    public void itShouldBeTheSameIdForTheSamePokemon() {
        Pokemon pokemon = new Pokemon(1000, "Pikachu");
        int hCode = pokemon.hashCode();
        String expected = "pkm" + Integer.toString(hCode);
        assertEquals(expected, Identifier.generateId(pokemon));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentPokemon() {
        Pokemon pokemon = new Pokemon(1000, "Pikachu");
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        int hCode = pokemon1.hashCode();
        String expected = "pkm" + Integer.toString(hCode);
        assertNotSame(expected, Identifier.generateId(pokemon));
    }

    @Test
    public void itShouldBeTheSameIdForTheSameTrainer() {
        Pokemon pokemon = new Pokemon(1000, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        int hCode = trainer.hashCode();
        String expected = "trn" + Integer.toString(hCode);
        assertEquals(expected, Identifier.generateId(trainer));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentTrainer() {
        Pokemon pokemon = new Pokemon(1000, "Pikachu");
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Trainer trainer1 = new Trainer(pokemon1, "Ash");
        int hCode = trainer1.hashCode();
        String expected = "trn" + Integer.toString(hCode);
        assertNotSame(expected, Identifier.generateId(trainer));
    }

    @Test
    public void itShouldBeTheSameIdForTheSameBattle() {
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        Pokemon pokemon2 = new Pokemon(1000, "Snorlax");
        Trainer trainer1 = new Trainer(pokemon1, "Ash");
        Trainer trainer2 = new Trainer(pokemon2, "Diana");
        Battle battle = new TrainerBattle(trainer1, trainer2);
        int hCode1 = battle.hashCode();
        String expected = "btt" + Integer.toString(hCode1);
        assertEquals(expected, Identifier.generateId(battle));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentBattle() {
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        Pokemon pokemon2 = new Pokemon(1000, "Snorlax");
        Trainer trainer1 = new Trainer(pokemon1, "Ash");
        Trainer trainer2 = new Trainer(pokemon2, "Diana");
        Battle battle1 = new TrainerBattle(trainer1, trainer2);
        Pokemon pokemon3 = new Pokemon(1000, "Pikachu");
        Pokemon pokemon4 = new Pokemon(1000, "Snorlax");
        Trainer trainer3 = new Trainer(pokemon3, "Ash");
        Trainer trainer4 = new Trainer(pokemon4, "Diana");
        Battle battle2 = new TrainerBattle(trainer3, trainer4);
        int hCode = battle2.hashCode();

        String expected = "btt" + Integer.toString(hCode);
        assertNotSame(expected, Identifier.generateId(battle1));
    }

    @Test
    public void itShouldBeTheSameIdForTheSameTown() {
        Town paleta = new Town();
        int hCode = paleta.hashCode();
        String expected = "twn" + Integer.toString(hCode);
        assertEquals(expected, Identifier.generateId(paleta));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentTown() {
        Town paleta1 = new Town();
        Town paleta2 = new Town();
        int hCode = paleta2.hashCode();
        String expected = "twn" + Integer.toString(hCode);
        assertNotSame(expected, Identifier.generateId(paleta1));
    }
}