package org.fundacionjala.at15.pokemon.commands;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "select", description = "Select a Pokemon")
public class SubCommandSelect implements Callable<Integer> {
    @Option(names = { "-id" }, description = "Pokemon ID")
    private String pokemonID;

    @Override
    public Integer call() {
        if (pokemonID != null) {
            System.out.println("You selected the ID: " + pokemonID + ", I'll try to find this Pokemon...");
        } else {
            System.out.println("I need an ID to select a Pokemon");
        }
        return 0;
    }
}
