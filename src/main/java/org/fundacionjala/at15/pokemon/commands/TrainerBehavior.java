package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "trainer", subcommands = { PokemonBehavior.class,
        SubCommandCatch.class }, description = "Entry point to trainer behavior")
public class TrainerBehavior implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Subcommands: pokemon, catch");
        return null;
    }

}
