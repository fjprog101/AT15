package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreateTown;
import org.fundacionjala.at15.pokemon.commands.create.CreateTrainer;
import org.fundacionjala.at15.pokemon.io.FileEraser;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class CreateTownTest {
    @Test
    public void commandShouldCreateATwonJsonFile() throws IncompleteArguments {
        CreatePokemon pokemon1 = new CreatePokemon();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();
        CreateTrainer trainer = new CreateTrainer();
        new CommandLine(trainer).parseArgs("-n", "Ash1", "-pID", pokemon1.getIdPokemonCreated());
        trainer.call();
        CreatePokemon pokemon2 = new CreatePokemon();
        new CommandLine(pokemon2).parseArgs("-n", "squirtle", "-hp", "250");
        pokemon2.call();

        CreateTown townCLI = new CreateTown();
        new CommandLine(townCLI).parseArgs("-tp", pokemon2.getIdPokemonCreated(), "-tt", trainer.getIdTrainerCreated());
        townCLI.call();

        Reader.readJson(townCLI.getIdCreateTown());
        String expected = "id: " + townCLI.getIdCreateTown() + " town's gym leader name: gymLeader";
        assertEquals(expected, Reader.getResult());

        FileEraser.eraseFile(pokemon1.getIdPokemonCreated());
        FileEraser.eraseFile(trainer.getIdTrainerCreated());
        FileEraser.eraseFile(pokemon2.getIdPokemonCreated());
        FileEraser.eraseFile(townCLI.getIdCreateTown());
    }
}
