package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;

import picocli.CommandLine;

public class PokemonCreateCLITest {
    @Test
    public void commandShouldCreateAPokemonJsonFile() {
        PokemonCreateCLI params = new PokemonCreateCLI();
        new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
        params.call();
        Reader.readJson(params.getIdPokemonCreated());
        String expected = "id: " + params.getIdPokemonCreated() + " name: squirtle hitpoints: 100/100";
        assertEquals(expected, Reader.getResult());
    }
}
