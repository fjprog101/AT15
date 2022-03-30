package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "catch", description = "Entry point to catch a pokemon")
public class SubCommandCatch implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Your business logic here....");
        return null;
    }

}
