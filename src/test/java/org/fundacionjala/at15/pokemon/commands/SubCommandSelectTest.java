package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;
import java.io.File;
import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.behavior.Select;
import static org.fundacionjala.at15.pokemon.io.PathHandler.*;

import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class SubCommandSelectTest {
    @Test
    public void itShouldSelectAPokemon() {
        Pokemon newPokemon = new Pokemon(200, "Pikachu");
        new CurrentEntities().write();
        newPokemon.write();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", newPokemon.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(newPokemon.getId(), current.getPokemon());

        File file = getPath(newPokemon.getId());
        file.delete();
    }

    @Test
    public void itShouldSelectATrainer() {
        Pokemon newPokemon = new Pokemon(200, "Pikachu");
        Trainer newTrainer = new Trainer(newPokemon, "Ash");
        new CurrentEntities().write();
        newTrainer.write();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", newTrainer.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(newTrainer.getId(), current.gettrainer());

        File file = getPath(newTrainer.getId());
        file.delete();
    }

    @Test
    public void itShouldSelectATown() {
        Town town = new Town();
        new CurrentEntities().write();
        town.write();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", town.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(town.getId(), current.getTown());

        File file = getPath(town.getId());
        file.delete();
    }
}
