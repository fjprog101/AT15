package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.junit.Test;

public class IdentifierTest {

    @Test
    public void itShouldBeTheSameIdForTheSamePokemon() {
        Pokemon pokemon = new Pokemon (1000, "Pikachu");
        int hCode = pokemon.hashCode();
        String expected = "pkm" + Integer.toString(hCode);
        Identifier ide = new Identifier();
        assertEquals(expected, ide.generateIdPokemon(pokemon));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentPokemon() {
        Pokemon pokemon = new Pokemon (1000, "Pikachu");
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        int hCode = pokemon1.hashCode();
        String expected = "pkm" + Integer.toString(hCode);
        Identifier ide = new Identifier();
        assertNotEquals(expected, ide.generateIdPokemon(pokemon));
    }

    @Test
    public void itShouldBeTheSameIdForTheSameTrainer() {
        Pokemon pokemon = new Pokemon (1000, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        int hCode = trainer.hashCode();
        String expected = "trn" + Integer.toString(hCode);
        Identifier ide = new Identifier();
        assertEquals(expected, ide.generateIdTrainer(trainer));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentTrainer() {
        Pokemon pokemon = new Pokemon (1000, "Pikachu");
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Trainer trainer1 = new Trainer(pokemon1, "Ash");
        int hCode = trainer1.hashCode();
        String expected = "trn" + Integer.toString(hCode);
        Identifier ide = new Identifier();
        assertNotEquals(expected, ide.generateIdTrainer(trainer));
    }
}