package org.fundacionjala.at15.pokemon.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import static org.fundacionjala.at15.pokemon.io.PathHandler.*;
import static org.fundacionjala.at15.pokemon.io.Query.*;
import org.fundacionjala.at15.pokemon.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QueryTest {
    @Test
    public void getFilesTest() throws IOException {
        Pokemon pokemon = new Pokemon(100, "Bulbasaur");
        String jsonString = new Gson().toJson(pokemon);
        String fileName = pokemon.getId();
        FileWriter file = new FileWriter(getPath(fileName));
        file.write(jsonString);
        file.flush();
        file.close();

        ArrayList<String> list = getMatches(EntityType.POKEMON, pokemon.getPokemonName());
        assertEquals(pokemon.getId(), list.get(0));
    }
}
