package org.fundacionjala.at15.pokemon.io;

import com.google.gson.Gson;

import static org.fundacionjala.at15.pokemon.io.PathHandler.*;
import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import static org.fundacionjala.at15.pokemon.io.Writer.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import java.io.*;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import org.junit.Test;

public class WriterTest {
    @Test
    public void itShouldWriteAJsonFile() {
        Pokemon pokemon = new Pokemon(200, "Mewto");
        String pokemonJson = new Gson().toJson(pokemon);

        writeToJson(pokemon);

        File inputFile = new File(POKEMON.getPath() + "/" + pokemon.getId() + ".json");
        String line = "";
        try {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            line = input.readLine();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        FileEraser.eraseFile(pokemon);

        assertEquals(pokemonJson, line);
    }

    @Test
    public void itShouldCreateACurrentPokemon() {
        Pokemon pokemon = new Pokemon(400, "Mew");
        CurrentEntities currentEntities = new CurrentEntities();
        currentEntities.setPokemon(pokemon.getId());
        writeToJson(currentEntities);

        assertNotSame("", new Gson().toJson(currentEntities));

        File file = getPath(currentEntities.getId());
        file.delete();
    }

    @Test
    public void itShouldCreateANewFolder() {
        File file = new File(EntityType.BATTLE.getPath() + "/test");
        Writer.checkFolder(file);

        assertTrue(file.delete());
    }
}
