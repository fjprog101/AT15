package org.fundacionjala.at15.pokemon.io;

import static org.fundacionjala.at15.pokemon.io.Reader.*;
import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.*;
import org.junit.Test;

public class ReaderTest {
    @Test
    public void itShouldReadAPokemonFile() {
        Pokemon pokemon = new Pokemon(100, "Charizard");
        Writer.writeToJson(pokemon);
        readJson(pokemon);
        String expected = "id: " + pokemon.getIdentifier() + " name: Charizard hitpoints: 100/100";
        assertEquals(expected, getResult());
    }
    @Test
    public void itShouldReadATrainerFile() {
        // Trainer pokemon = new Pokemon(100, "Charizard");
        // Writer.writeToJson(pokemon);
        // readJson(pokemon);
        // String expected = "id: " + pokemon.getIdentifier() + " name: Charizard hitpoints: 100/100";
        // assertEquals(expected, getResult());
    }
}
