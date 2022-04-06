package org.fundacionjala.at15.pokemon.io;

import static org.fundacionjala.at15.pokemon.io.Reader.*;
import static org.fundacionjala.at15.pokemon.io.PathHandler.*;
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
        pokemon.write();
        read(pokemon.getId());
        String expected = "id: " + pokemon.getId() + " name: Charizard hitpoints: 100.0/100.0";
        FileEraser.eraseFile(pokemon);
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadATrainerFile() {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        trainer.write();
        String fileName = trainer.getId();
        read(fileName);
        String expected = "id: " + trainer.getId() + " name: Ash badges: 0 money: 100";
        FileEraser.eraseFile(trainer);
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadABattle() {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Trainer trainer2 = new Trainer(pokemon, "Brooke");

        TrainerBattle battle = new TrainerBattle(trainer, trainer2);
        battle.write();
        read(battle.getId());

        String expected = "id: " + battle.getId() + " trainer1 name: Ash trainer2 name: Brooke isBattleOver: false";
        FileEraser.eraseFile(battle);
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadATown() {
        Town town = new Town("Paleta");
        town.write();
        read(town.getId());
        String expected = "id: " + town.getId() + " town's gym leader name: gymLeader";
        FileEraser.eraseFile(town);
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

        Entity entity = read(pokemon.getId());
        assertEquals("class org.fundacionjala.at15.pokemon.Pokemon", entity.getClass().toString());

        String fileString = stringReader(getPath(fileName));
        FileEraser.eraseFile(pokemon);
        assertEquals(jsonString + "\n", fileString);
    }

    @Test
    public void itShouldReadCurrentEntities() throws IOException {
        CurrentEntities entity = new CurrentEntities();
        String jsonString = new Gson().toJson(entity);
        String fileName = entity.getId();
        FileWriter file = new FileWriter(getPath(fileName));
        file.write(jsonString);
        file.flush();
        file.close();

        Entity trueEntity = read(entity.getId());
        FileEraser.eraseFile(entity);
        assertEquals("class org.fundacionjala.at15.pokemon.CurrentEntities", trueEntity.getClass().toString());
    }

    @Test
    public void readerShouldReturnNull() {
        assertEquals(null, read("pkm-testing"));
        assertEquals(null, ReaderJSON.readJSON("testing", "line"));
        File path = PathHandler.getPathXML("pkm-file");
        assertEquals(null, ReaderXML.readXML("testing", path));
    }
}
