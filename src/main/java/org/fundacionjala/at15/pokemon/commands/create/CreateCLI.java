package org.fundacionjala.at15.pokemon.commands.create;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "create", subcommands = { CreatePokemon.class, CreateTrainer.class, CreateTown.class,
        CreateTrainerBattle.class, CreateWildPokemonBattle.class, CreateCurrentEntities.class },

        description = "Create objects")
public class CreateCLI implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Exit code 1: Subcommand needed");
        return 0;
    }
}