package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "fight", description = "Fight")
public class Fight implements Callable<Integer> {
    @Option(names = { "-id" }, description = "Fight")
    private String entityID;

    @Override
    public Integer call() {
        System.out.println("Your business logic here....");
        return 0;
    }
}
