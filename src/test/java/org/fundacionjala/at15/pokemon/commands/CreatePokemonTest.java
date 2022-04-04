package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;

import picocli.CommandLine;

public class CreatePokemonTest {
    @Test
    public void commandShouldCreateAPokemonJsonFile() throws IncompleteArguments {
        CreatePokemon params = new CreatePokemon();
        new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
        params.call();
        Reader.readJson(params.getIdPokemonCreated());
        String expected = "id: " + params.getIdPokemonCreated() + " name: squirtle hitpoints: 100/100";
        assertEquals(expected, Reader.getResult());
    }

    @Test
    public void commandShouldNotreateAPokemonJsonFile() throws IncompleteArguments {
        CreatePokemon params = new CreatePokemon();
        new CommandLine(params).parseArgs("-hp", "100");
        params.call();
        String expected = "Error. Incomplete arguments for the create pokemon command.";
        assertEquals(expected, params.getWarningMessage());
    }
}
