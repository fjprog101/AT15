package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class TrainerBattleCLITest {
    @Test
    public void commandShouldCreateATrainerJsonFile() {
        PokemonCreateCLI pokemon1 = new PokemonCreateCLI();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();
        TrainerCreateCLI trainer1 = new TrainerCreateCLI();
        new CommandLine(trainer1).parseArgs("-n", "Ash1", "-pID", pokemon1.getIdPokemonCreated());
        trainer1.call();
        PokemonCreateCLI pokemon2 = new PokemonCreateCLI();
        new CommandLine(pokemon2).parseArgs("-n", "squirtle", "-hp", "250");
        pokemon2.call();
        TrainerCreateCLI trainer2 = new TrainerCreateCLI();
        new CommandLine(trainer2).parseArgs("-n", "Ash2", "-pID", pokemon2.getIdPokemonCreated());
        trainer2.call();

        TrainerBattleCLI trainerBattleCLI = new TrainerBattleCLI();
        new CommandLine(trainerBattleCLI).parseArgs("-tID1", trainer1.getIdTrainerCreated(), "-tID2", trainer2.getIdTrainerCreated());
        trainerBattleCLI.call();

        Reader.readJson(trainerBattleCLI.getIdCreateTrainerBattle());
        String expected = "id: " + trainerBattleCLI.getIdCreateTrainerBattle() + " trainer1 name: Ash1 trainer2 name: Ash2 isBattleOver: false";
        assertEquals(expected, Reader.getResult());
    }
}
