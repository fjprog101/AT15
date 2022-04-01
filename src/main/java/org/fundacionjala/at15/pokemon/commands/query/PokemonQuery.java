package org.fundacionjala.at15.pokemon.commands.query;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.Query;
import static org.fundacionjala.at15.pokemon.io.Reader.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "pokemon", description = "Fetch pokemon data")

public class PokemonQuery implements Callable<Integer> {

    @Option(names = {"-name", "-n"}, description = "pokemon name")
    private String name;

    @Override
    public Integer call() {
        ArrayList<String> list = Query.getMatches(EntityType.POKEMON, name);
        for (String item : list) {
            readJson(item);
        }
        return 0;
    }
}