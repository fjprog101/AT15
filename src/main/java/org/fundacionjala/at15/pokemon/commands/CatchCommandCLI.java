package org.fundacionjala.at15.pokemon.commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "catch", description = "Attempt to catch a wild pokemon")
public class CatchCommandCLI implements Callable<Integer> {
    String pokID;

    @Override
    public Integer call() {
        System.out.println("");
        return 0;
    }
}
