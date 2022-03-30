package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "learn", description = "Pokemon learns a new Move")
public class LearnCLI implements Callable<Integer> {
    @Option(names = { "-name" }, description = "Name of Attack Movement")
    private String movement;

    @Option(names = { "-damage" }, description = "Attack potency")
    private int potency;

    @Override
    public Integer call() {
        if (movement != "" && potency > 0) {
            System.out.println("Your Pokemon learn a new Attack movement");
        } else {
            System.out.println("Arguments are invalid");
        }
        return 0;
    }
}
