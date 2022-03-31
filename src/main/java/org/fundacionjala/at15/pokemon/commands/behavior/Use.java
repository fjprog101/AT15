package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "use", description = "Set attacking move")
public class Use implements Callable<Integer> {
    @Option(names = { "-move" }, description = "Pokemon Movement", defaultValue = "tackle")
    private String pokemonMove;

    @Override
    public Integer call() throws Exception {
        System.out.println("Your business logic here....");

        return null;
    }
}
