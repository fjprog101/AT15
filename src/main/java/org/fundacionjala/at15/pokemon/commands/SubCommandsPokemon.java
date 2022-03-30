package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "pokemon", subcommands = { SubCommandSelect.class, SubCommandLearn.class,
        CommandLine.HelpCommand.class }, description = "Sub-command Pokemon")
public class SubCommandsPokemon implements Runnable {

    @Override
    public void run() {
        System.out.println("I need context");
    }
}