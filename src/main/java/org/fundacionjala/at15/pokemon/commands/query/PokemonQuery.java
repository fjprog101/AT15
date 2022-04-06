package org.fundacionjala.at15.pokemon.commands.query;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.*;
import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.Query;
import static org.fundacionjala.at15.pokemon.io.Reader.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "pokemon", description = "Fetch pokemon data")

public class PokemonQuery implements Callable<Integer> {
    private ArrayList<String> list;
    private ArrayList<String> trainerList;

    @Option(names = { "-name", "-n" }, description = "pokemon name")
    private String name;

    @Option(names = { "-trainer", "-t" }, description = "trainer name")
    private String trainer;

    @Override
    public Integer call() {
        trainerList = Query.getMatches(EntityType.TRAINER, name);
        for (String trainer : trainerList) {
            Entity entity = read(trainer);
            Trainer selectedTrainer = (Trainer) entity;
            for (Pokemon pokemon : selectedTrainer.getPokemonTeam().getPokemonTeam()) {
                read(pokemon.getId());
            }
        }

        list = Query.getMatches(EntityType.POKEMON, name);
        for (String item : list) {
            read(item);
        }
        return 0;
    }

    public ArrayList<String> getList() {
        return list;
    }
}