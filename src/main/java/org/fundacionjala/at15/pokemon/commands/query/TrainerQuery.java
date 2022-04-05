package org.fundacionjala.at15.pokemon.commands.query;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.Query;
import static org.fundacionjala.at15.pokemon.io.Reader.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "trainer", description = "Fetch trainer data")

public class TrainerQuery implements Callable<Integer> {
    private ArrayList<String> list;

    @Option(names = { "-name", "-n" }, description = "trainer name")
    private String name;

    @Override
    public Integer call() {
        list = Query.getMatches(EntityType.TRAINER, name);
        for (String item : list) {
            read(item);
        }
        return 0;
    }

    public ArrayList<String> getList() {
        return list;
    }
}