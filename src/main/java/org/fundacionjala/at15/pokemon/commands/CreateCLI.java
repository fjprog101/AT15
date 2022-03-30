package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "admin:create", subcommands = {PokemonCreateCLI.class, TrainerCreateCLI.class},
        description = "Create objects")
class CreateCLI implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Subcommand pokemon or trainer needed");
        return 0;
    }
}