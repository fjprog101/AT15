package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class TownCLITest {
    @Test
    public void commandShouldCreateATwonJsonFile() {
        PokemonCreateCLI pokemon1 = new PokemonCreateCLI();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();
        TrainerCreateCLI trainer = new TrainerCreateCLI();
        new CommandLine(trainer).parseArgs("-n", "Ash1", "-pID", pokemon1.getIdPokemonCreated());
        trainer.call();
        PokemonCreateCLI pokemon2 = new PokemonCreateCLI();
        new CommandLine(pokemon2).parseArgs("-n", "squirtle", "-hp", "250");
        pokemon2.call();

        TownCLI townCLI = new TownCLI();
        new CommandLine(townCLI).parseArgs("-tp", pokemon2.getIdPokemonCreated(), "-tt", trainer.getIdTrainerCreated());
        townCLI.call();

        Reader.readJson(townCLI.getIdCreateTrainerBattle());
        String expected = "id: " + townCLI.getIdCreateTrainerBattle() + " town's gym leader name: gymLeader";
        assertEquals(expected, Reader.getResult());
    }
}
