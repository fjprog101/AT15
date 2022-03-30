package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "learn", description = "Learn an Attack movement")
public class SubCommandLearn implements Callable<Integer> {
    @Option(names = { "-name" }, description = "Attacke movement")
    private String movement;

    @Option(names = { "-damage" }, description = "Attack potency", defaultValue = "40")
    private int potency;

    @Override
    public Integer call() throws Exception {
        System.out.println("Your business logic here....");
        return null;
    }
}
