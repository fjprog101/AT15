package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assume.assumeTrue;

import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreateTrainer;
import org.fundacionjala.at15.pokemon.commands.create.CreateWildPokemonBattle;
import org.fundacionjala.at15.pokemon.io.FileEraser;
import org.junit.Test;
import picocli.CommandLine;

public class CreateWildPokemonBattleTest {
    @Test
    public void commandShouldCreateAPokemonBetweenTrainerBattleJsonFile() throws IncompleteArguments {
        CreatePokemon pokemon1 = new CreatePokemon();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();
        CreateTrainer trainer1 = new CreateTrainer();
        new CommandLine(trainer1).parseArgs("-n", "Ash1", "-pID", pokemon1.getIdPokemonCreated());
        trainer1.call();
        CreatePokemon pokemon2 = new CreatePokemon();
        new CommandLine(pokemon2).parseArgs("-n", "squirtle", "-hp", "250");
        pokemon2.call();

        CreateWildPokemonBattle wildBattleCLI = new CreateWildPokemonBattle();
        new CommandLine(wildBattleCLI).parseArgs("-bt", trainer1.getIdTrainerCreated(), "-bp",
                pokemon2.getIdPokemonCreated());
        wildBattleCLI.call();

        boolean expected = wildBattleCLI.getIdCreateWildPokemonBattle().isEmpty();
        assumeTrue(expected);

        FileEraser.eraseFile(pokemon1.getIdPokemonCreated());
        FileEraser.eraseFile(trainer1.getIdTrainerCreated());
        FileEraser.eraseFile(pokemon2.getIdPokemonCreated());
        FileEraser.eraseFile(wildBattleCLI.getIdCreateWildPokemonBattle());
    }
}
