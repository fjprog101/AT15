package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.PokemonCreateCLI;
import org.fundacionjala.at15.pokemon.commands.create.TrainerCreateCLI;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class TrainerCreateCLITest {

    @Test
    public void commandShouldCreateATrainerJsonFile() {
        PokemonCreateCLI pokemon = new PokemonCreateCLI();
        new CommandLine(pokemon).parseArgs("-n", "squirtle", "-hp", "100");
        pokemon.call();
        TrainerCreateCLI trainer = new TrainerCreateCLI();
        new CommandLine(trainer).parseArgs("-n", "AshKetchup", "-pID", pokemon.getIdPokemonCreated());
        trainer.call();
        Reader.readJson(trainer.getIdTrainerCreated());
        String expected = "id: " + trainer.getIdTrainerCreated() + " name: AshKetchup badges: 0 money: 100";
        assertEquals(expected, Reader.getResult());
    }

}
