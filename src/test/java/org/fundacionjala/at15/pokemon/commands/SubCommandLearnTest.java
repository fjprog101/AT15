package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.behavior.Learn;
import org.fundacionjala.at15.pokemon.commands.behavior.Select;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.io.FileEraser;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import org.fundacionjala.at15.pokemon.commands.create.CreateCurrentEntities;

import picocli.CommandLine;

public class SubCommandLearnTest {
    @Test
    public void commandShouldCreateAddMovementToJsonFile() throws IncompleteArguments {
        CreatePokemon poke = new CreatePokemon();
        new CommandLine(poke).parseArgs("-n", "pikachu", "-hp", "100");
        poke.call();

        CreateCurrentEntities current = new CreateCurrentEntities();
        new CommandLine(current);
        current.call();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", poke.getIdPokemonCreated());
        select.call();

        Learn learn = new Learn();
        new CommandLine(learn).parseArgs("-name", "Patada", "-damage", "400");
        learn.call();

        Pokemon pokemon = (Pokemon) Reader.readJson(learn.getIdPOkemon());
        String expected = pokemon.getMove("Patada").getMovement();
        assertEquals("Patada", expected);

        FileEraser.eraseFile(poke.getIdPokemonCreated());
        FileEraser.eraseFile(learn.getIdPOkemon());
    }
}
