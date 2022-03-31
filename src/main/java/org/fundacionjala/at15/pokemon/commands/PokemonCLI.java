package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.commands.behavior.PokemonBehavior;
import org.fundacionjala.at15.pokemon.commands.behavior.TrainerBehavior;
import org.fundacionjala.at15.pokemon.commands.create.CreateCLI;
import org.fundacionjala.at15.pokemon.commands.query.QueryCLI;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "pkm", subcommands = { CreateCLI.class, QueryCLI.class, PokemonBehavior.class,
        TrainerBehavior.class,
        CommandLine.HelpCommand.class }, description = "Pokemon CLI")

public class PokemonCLI {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PokemonCLI()).execute(args);
        System.exit(exitCode);
    }
}
