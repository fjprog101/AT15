package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "catch", description = "Attempt to catch a wild pokemon")
public class CatchCLI implements Callable<Integer> {
    private String pokID;

    @Override
    public Integer call() {
        System.out.println("");
        return 0;
    }
}
