package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "use", description = "Use a movement to Attack other Pokemon")
public class SubCommandUse implements Callable<Integer> {
    @Option(names = { "-move" }, description = "Pokemon Movement", defaultValue = "tackle")
    private String pokemonMove;

    @Override
    public Integer call() throws Exception {
        System.out.println("Your business logic here....");

        return null;
    }
}
