package org.fundacionjala.at15.pokemon.commands.create;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.io.JsonWriter;

import picocli.CommandLine.Command;

@Command(name = "current", description = "Create a new current entities json file")
public class CreateCurrentEntities implements Callable<Integer> {

    @Override
    public Integer call() {
        CurrentEntities currentEntities = new CurrentEntities();
        currentEntities.write(new JsonWriter());
        System.out.println("File created successfully");
        return 0;
    }
}