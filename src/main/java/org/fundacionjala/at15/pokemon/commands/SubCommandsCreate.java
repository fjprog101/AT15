package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

<<<<<<< HEAD
@Command(name = ":create", subcommands = {PokemonCommands.class, TrainerCommands.class},
=======
@Command(name = ":create", subcommands = {PokemonCommands.class, TrainerCommands.class, TownCommands.class},
>>>>>>> f5d1903 (commands/TownCommands.java added)
        description = "Entry point to create objects in Pokemon world")
class SubCommandsCreate implements Callable<Integer> {

    @Override
    public Integer call() {
<<<<<<< HEAD
        System.out.println("Subcommand :pokemon or :trainer needed");
        return 0;
    }
}
=======
        System.out.println("Subcommand :pokemon, :trainer or :town needed");
        return 0;
    }
}
>>>>>>> f5d1903 (commands/TownCommands.java added)
