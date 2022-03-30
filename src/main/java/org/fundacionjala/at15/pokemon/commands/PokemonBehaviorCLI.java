package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "pokemon", subcommands = { SelectCLI.class, LearnCLI.class,
        CommandLine.HelpCommand.class }, description = "Sub-command Pokemon")
public class PokemonBehaviorCLI implements Runnable {

    @Override
    public void run() {
        System.out.println("I need context");
    }
}