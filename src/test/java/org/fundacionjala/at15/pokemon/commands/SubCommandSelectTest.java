package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;
import java.io.File;
import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.behavior.Select;
import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import static org.fundacionjala.at15.pokemon.io.PathHandler.*;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;
import org.junit.Test;
import picocli.CommandLine;

public class SubCommandSelectTest {
    @Test
    public void itShouldSelectAPokemon() throws IncompleteArguments {
        Pokemon newPokemon = new Pokemon(200, "Pikachu");
        Writer.writeToJson(new CurrentEntities());
        Writer.writeToJson(newPokemon);

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", newPokemon.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(newPokemon.getId(), current.getPokemon());

        File file = getPath(newPokemon.getId());
        file.delete();
    }

    @Test
    public void itShouldSelectATrainer() throws IncompleteArguments {
        Pokemon newPokemon = new Pokemon(200, "Pikachu");
        Trainer newTrainer = new Trainer(newPokemon, "Ash");
        Writer.writeToJson(new CurrentEntities());
        Writer.writeToJson(newTrainer);

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", newTrainer.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(newTrainer.getId(), current.gettrainer());

        File file = getPath(newTrainer.getId());
        file.delete();
    }

    @Test
    public void itShouldSelectATown() throws IncompleteArguments {
        Town town = new Town();
        Writer.writeToJson(new CurrentEntities());
        Writer.writeToJson(town);

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", town.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(town.getId(), current.getTown());

        File file = getPath(town.getId());
        file.delete();
    }
}
