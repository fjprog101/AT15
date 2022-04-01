package org.fundacionjala.at15.pokemon.commands.create;
import static org.fundacionjala.at15.pokemon.io.Writer.*;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;

import picocli.CommandLine.Command;

@Command(name = "current", description = "Create a new current entities json file")
public class CreateCurrentEntities implements Callable<Integer> {

    @Override
    public Integer call() {
        CurrentEntities currentEntities = new CurrentEntities();
        writeToJson(currentEntities);
        System.out.println("File created successfully");
        return 0;
    }
}