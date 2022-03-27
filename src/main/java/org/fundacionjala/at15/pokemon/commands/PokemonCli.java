package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.Trainer;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

@Command(name = "pkm admin", subcommands = { SubCommandsMethods.class,
    CommandLine.HelpCommand.class }, description = "Create data for the Pokemon World")
public class PokemonCli {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PokemonCli()).execute(args);
        System.exit(exitCode);
    }
}

@Command(name = ":create", description = "Entry point to create objects in Pokemon world")
class SubCommandsMethods implements Callable<Integer> {

    @Command(name = ":pokemon", description = "create a pokemon")
    public Integer pokemon(
            @Option(names = {"-name", "-n"}, description = "pokemon name")
            @Parameters(paramLabel = "NAME") String pokemonName,
            @Option(names = {"-hitPoints", "-hp"}, description = "pokemon Hit-Points")
            @Parameters(paramLabel = "HIT-POINTS") int hitPoints) {

        Pokemon newPokemon = new Pokemon(hitPoints, pokemonName);
        String hCode = Identifier.generateIdPokemon(newPokemon);
        System.out.println(
                "Pokemon created: \n"
                        + "Name: " + newPokemon.getPokemonName() + "\n"
                        + "HitPoints: " + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
                        + "ID: " + hCode);
        return 0;
    }

    @Command(name = ":trainer", description = "create a trainer")
    public Integer trainer(
            @Option(names = {"-name", "-n"}, description = "trainer name")
            @Parameters(paramLabel = "NAME") String trainerName,
            @Option(names = {"-pokeID", "-pID"}, description = "add pokemon to trainer")
            @Parameters(paramLabel = "POKEMON-ID") Pokemon pokemon
    ) {
        Trainer trainer = new Trainer(pokemon, trainerName);
        String hCode = Identifier.generateIdTrainer(trainer);
        System.out.println(
                "Trainer " + trainer.getName() + " created" + "\n"
                + pokemon.hashCode() + " added to pokemon team" + "\n"
                + "ID: " + hCode
        );
        return 0;
    }

    @Override
    public Integer call() {
        System.out.println("Subcommand :pokemon or :trainer needed");
        return 0;
    }
}