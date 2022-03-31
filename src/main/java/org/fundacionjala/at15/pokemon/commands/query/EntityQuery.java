package org.fundacionjala.at15.pokemon.commands.query;

import java.util.concurrent.Callable;


import picocli.CommandLine.Command;

@Command(name = "query", subcommands = {PokemonQuery.class, TrainerQuery.class},

        description = "Fetch Data")

public class EntityQuery implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Exit code 1, you need to specify an exit command");
        return 0;
    }
}