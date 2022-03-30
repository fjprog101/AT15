package org.fundacionjala.at15.pokemon;
import static org.fundacionjala.at15.pokemon.io.Path.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;

import org.junit.Test;

public class QueryTest {
    @Test
    public void itShouldGetTheFiles() {
        String pathDirectory = System.getProperty("user.home") + POKEMON.getPathString();
        ArrayList<String> names = Query.getFiles(pathDirectory);
        ArrayList<String> expecteds = new ArrayList<String>();
        expecteds.add("Diana");
        assertNotSame(expecteds, names);
    }

    @Test
    public void itShouldGetTheMathcesPokemon() {
        ArrayList<String> names = Query.getMatches(POKEMON, "Mewto");
        ArrayList<String> expecteds = new ArrayList<String>();
        expecteds.add("Diana");
        assertNotSame(expecteds, names);
    }

    @Test
    public void itShouldGetTheMathcesTrainer() {
        ArrayList<String> names = Query.getMatches(TRAINER, "Diana");
        ArrayList<String> expecteds = new ArrayList<String>();
        expecteds.add("Diana");
        assertNotSame(expecteds, names);
    }
}