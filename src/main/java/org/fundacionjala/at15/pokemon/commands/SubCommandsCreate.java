package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = ":create", subcommands = {PokemonCommands.class, TrainerCommands.class, TownCommands.class, TrainerBattleCommand.class, WildPokemonBattleCommands.class},

        description = "Entry point to create objects in Pokemon world")
class SubCommandsCreate implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Subcommand :pokemon, :trainer, :town needed, :wildbattle :trainerBattle");
        return 0;
    }
}