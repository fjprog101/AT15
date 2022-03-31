package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "catch", description = "Attempt to catch a wild pokemon")
public class Catch implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Pokemon catch!");
        return 0;
    }

}
