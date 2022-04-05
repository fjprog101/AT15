package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.behavior.Select;
import org.fundacionjala.at15.pokemon.io.FileEraser;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;
import org.junit.Test;
import picocli.CommandLine;

public class SubCommandSelectTest {
    @Test
    public void itShouldSelectAPokemon() {
        Pokemon newPokemon = new Pokemon(200, "Pikachu");
        Writer.writeToJson(new CurrentEntities());
        Writer.writeToJson(newPokemon);

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", newPokemon.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(newPokemon.getId(), current.getPokemon());

        FileEraser.eraseFile(newPokemon.getId());
    }

    @Test
    public void itShouldSelectATrainer() {
        Pokemon newPokemon = new Pokemon(200, "Pikachu");
        Trainer newTrainer = new Trainer(newPokemon, "Ash");
        Writer.writeToJson(new CurrentEntities());
        Writer.writeToJson(newTrainer);

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", newTrainer.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(newTrainer.getId(), current.gettrainer());

        FileEraser.eraseFile(newTrainer.getId());
    }

    @Test
    public void itShouldSelectATown() {
        Town town = new Town();
        Writer.writeToJson(new CurrentEntities());
        Writer.writeToJson(town);

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", town.getId());
        select.call();

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assertEquals(town.getId(), current.getTown());

        FileEraser.eraseFile(town.getId());
    }
}
