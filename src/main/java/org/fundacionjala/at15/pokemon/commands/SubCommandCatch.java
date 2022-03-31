package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "catch", description = "Attempt to catch a wild pokemon")
public class SubCommandCatch implements Callable<Integer> {

    @Override
    public Integer call() {

        return 0;
    }

}
