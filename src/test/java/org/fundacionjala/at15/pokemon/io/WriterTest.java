package org.fundacionjala.at15.pokemon.io;

import com.google.gson.Gson;

import org.fundacionjala.at15.pokemon.Pokemon;
import static org.fundacionjala.at15.pokemon.io.Writer.*;
import static org.junit.Assert.assertEquals;

import java.io.*;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import org.junit.Test;

public class WriterTest {
    @Test
    public void itShouldWriteAJsonFile() {
        Pokemon pokemon = new Pokemon(200, "Mewto");
        String pokemonJson = new Gson().toJson(pokemon);

        writeToJson(pokemon);

        File inputFile = new File(System.getProperty("user.home") + "/" + POKEMON.getPathString() + "/" + pokemon.getIdentifier() + ".json");
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

        assertEquals(pokemonJson, line);
    }
}
