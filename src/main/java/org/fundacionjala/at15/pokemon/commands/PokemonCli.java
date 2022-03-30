package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "pkm", subcommands = { CreateCLI.class, PokemonQuery.class, PokemonBehavior.class,
        TrainerBehavior.class,
        CommandLine.HelpCommand.class }, description = "Create data for the Pokemon World")

public class PokemonCli {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PokemonCli()).execute(args);
        System.exit(exitCode);
    }
}
