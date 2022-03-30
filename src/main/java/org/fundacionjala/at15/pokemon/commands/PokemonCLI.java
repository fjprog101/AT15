package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "pkm", subcommands = { CreateCLI.class, PokemonBehaviorCLI.class, TrainerBehaviorCLI.class,
    CommandLine.HelpCommand.class }, description = "Create data for the Pokemon World")
public class PokemonCLI {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PokemonCLI()).execute(args);
        System.exit(exitCode);
    }
}

