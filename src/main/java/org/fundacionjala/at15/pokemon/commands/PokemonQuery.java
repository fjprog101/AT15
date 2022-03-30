package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "query", subcommands = {},

        description = "Entry point to create objects in Pokemon world")

public class PokemonQuery implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Put your business logic here...... $%Diana#$%#^$%");
        return null;
    }

}
