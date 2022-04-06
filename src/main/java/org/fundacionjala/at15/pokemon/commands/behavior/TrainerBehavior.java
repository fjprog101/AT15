package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "trainer", subcommands = { Select.class, PokemonBehavior.class,
        Catch.class, BuyItems.class }, description = "Trainer behavior")
public class TrainerBehavior implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Subcommands: select, pokemon, catch");
        return null;
    }

}
