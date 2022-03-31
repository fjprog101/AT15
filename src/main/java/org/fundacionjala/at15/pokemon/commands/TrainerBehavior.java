package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "trainer", subcommands = { SubCommandSelect.class, PokemonBehavior.class,
        SubCommandCatch.class }, description = "Trainer behavior")
public class TrainerBehavior implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Subcommands: select, pokemon, catch");
        return null;
    }

}
