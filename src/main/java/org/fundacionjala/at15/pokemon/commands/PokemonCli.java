package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.commands.create.CreateCLI;
import org.fundacionjala.at15.pokemon.commands.query.EntityQuery;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "pkm", subcommands = { CreateCLI.class, EntityQuery.class, PokemonBehavior.class,
        TrainerBehavior.class,
        CommandLine.HelpCommand.class }, description = "Pokemon CLI")

public class PokemonCli {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PokemonCli()).execute(args);
        System.exit(exitCode);
    }
}
