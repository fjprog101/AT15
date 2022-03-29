package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(name = "trainer", description = "select, pokemon & catch")
public class TrainerBehaviorCLI implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Subcommand required");
        return 0;
    }
}
