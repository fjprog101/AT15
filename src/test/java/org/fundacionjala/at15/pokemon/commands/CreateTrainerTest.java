package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreateTrainer;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class CreateTrainerTest {

    @Test
    public void commandShouldCreateATrainerJsonFile() throws IncompleteArguments {
        CreatePokemon pokemon = new CreatePokemon();
        new CommandLine(pokemon).parseArgs("-n", "squirtle", "-hp", "100");
        pokemon.call();
        CreateTrainer trainer = new CreateTrainer();
        new CommandLine(trainer).parseArgs("-n", "AshKetchup", "-pID", pokemon.getIdPokemonCreated());
        trainer.call();
        Reader.read(trainer.getIdTrainerCreated());
        String expected = "id: " + trainer.getIdTrainerCreated() + " name: AshKetchup badges: 0 money: 100";
        assertEquals(expected, Reader.getResult());
    }
    @Test(expected = IncompleteArguments.class)
    public void commandShouldVerifyCreateTrainerCommandException() throws IncompleteArguments {
        CreateTrainer trainer = new CreateTrainer();
        new CommandLine(trainer).parseArgs();
        trainer.call();
    }
}
