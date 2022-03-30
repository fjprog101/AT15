package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "pokemon", subcommands = { SubCommandSelect.class, SubCommandLearn.class,
        SubCommandFight.class, SubCommandUse.class },

        description = "Subcommands of Pokemon Behavior")
public class PokemonBehavior implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Subcommands :select, learn, fight, use");
        return null;
    }
}
