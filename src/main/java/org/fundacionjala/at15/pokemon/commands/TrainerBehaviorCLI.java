package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(name = "trainer", subcommands = { PokemonBehaviorCLI.class, SelectCLI.class}, description = "select, pokemon & catch")
public class TrainerBehaviorCLI implements Callable<Integer> {

    @Option(names={})

    @Override
    public Integer call() {
        System.out.println("Subcommand required");
        return 0;
    }
}
