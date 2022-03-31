package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assume.assumeTrue;

import org.fundacionjala.at15.pokemon.commands.create.PokemonCreateCLI;
import org.fundacionjala.at15.pokemon.commands.create.TrainerCreateCLI;
import org.fundacionjala.at15.pokemon.commands.create.WildPokemonBattleCLI;
import org.junit.Test;
import picocli.CommandLine;

public class WildPokemonBattleCLITest {
    @Test
    public void commandShouldCreateAPokemonBetweenTrainerBattleJsonFile() {
        PokemonCreateCLI pokemon1 = new PokemonCreateCLI();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();
        TrainerCreateCLI trainer1 = new TrainerCreateCLI();
        new CommandLine(trainer1).parseArgs("-n", "Ash1", "-pID", pokemon1.getIdPokemonCreated());
        trainer1.call();
        PokemonCreateCLI pokemon2 = new PokemonCreateCLI();
        new CommandLine(pokemon2).parseArgs("-n", "squirtle", "-hp", "250");
        pokemon2.call();

        WildPokemonBattleCLI wildBattleCLI = new WildPokemonBattleCLI();
        new CommandLine(wildBattleCLI).parseArgs("-bt", trainer1.getIdTrainerCreated(), "-bp", pokemon2.getIdPokemonCreated());
        wildBattleCLI.call();

        boolean expected = wildBattleCLI.getIdCreateWildPokemonBattle().isEmpty();
        assumeTrue(expected);
    }
}
