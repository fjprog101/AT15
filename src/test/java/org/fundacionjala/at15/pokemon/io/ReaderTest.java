package org.fundacionjala.at15.pokemon.io;

import static org.fundacionjala.at15.pokemon.io.Reader.*;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import org.fundacionjala.at15.pokemon.*;
import org.junit.Test;

public class ReaderTest {
    @Test
    public void itShouldReadAPokemonFile() {
        Pokemon pokemon = new Pokemon(100, "Charizard");
        Writer.writeToJson(pokemon);
        readJson(pokemon.getId());
        String expected = "id: " + pokemon.getId() + " name: Charizard hitpoints: 100/100";
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadATrainerFile() {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Writer.writeToJson(trainer);
        String fileName = trainer.getId();
        readJson(fileName);
        String expected = "id: " + trainer.getId() + " name: Ash badges: 0 money: 100";
        assertEquals(expected, getResult());
    }

   @Test
    public void itShouldReadABattle() {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Trainer trainer2 = new Trainer(pokemon, "Brooke");

        TrainerBattle battle = new TrainerBattle(trainer, trainer2);
        Writer.writeToJson(battle);
        readJson(battle.getId());

        String expected = "id: " + battle.getId() + " trainer1 name: Ash trainer2 name: Brooke isBattleOver: false";
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadATown() {
        Town town = new Town();
        Writer.writeToJson(town);
        readJson(town.getId());
        String expected = "id: " + town.getId() + " town's gym leader name: gymLeader";
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReturnAnfEntityAndReadAFileAsString() throws IOException {
        Pokemon pokemon = new Pokemon(100, "Charizard");
        String jsonString = new Gson().toJson(pokemon);
        String fileName = pokemon.getId();
        FileWriter file = new FileWriter(getPath(fileName));
        file.write(jsonString);
        file.flush();
        file.close();

        Entity entity = readJson(pokemon.getId());
        assertEquals("class org.fundacionjala.at15.pokemon.Pokemon", entity.getClass().toString());

        String fileString = jSonStringReader(getPath(fileName));
        assertEquals(jsonString, fileString);
    }
}
