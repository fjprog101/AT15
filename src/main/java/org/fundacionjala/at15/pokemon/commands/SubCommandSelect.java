package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "select", description = "Select a Pokemon in the Pokemon world")
public class SubCommandSelect implements Callable<Integer> {
    @Option(names = { "-id" }, description = "Entity ID")
    private String entityID;

    @Override
    public Integer call() {
        System.out.println("Your business logic here....");
        return 0;
    }
}
