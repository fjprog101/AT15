package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "admin:create", subcommands = { PokemonCreateCLI.class, TrainerCreateCLI.class, TownCLI.class,
        TrainerBattleCLI.class, WildPokemonBattleCLI.class },

        description = "Entry point to create objects in Pokemon world")
class CreateCLI implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Subcommand :pokemon, :trainer, :town needed, :wildbattle :trainerBattle");
        return 0;
    }
}