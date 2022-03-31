package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "trainer", description = "create a trainer")
public class TrainerCreateCLI implements Callable<Integer> {
    private String idTrainerCreated;

    @Option(names = { "-name", "-n" }, description = "trainer name")
    private String trainerName;

    @Option(names = { "-pokeID", "-pID" }, description = "add pokemon to trainer")
    private String pokemonId;

    @Override
    public Integer call() {
        Pokemon poke = (Pokemon) Reader.readJson(pokemonId);

        Trainer trainer = new Trainer(poke, trainerName);
        Writer.writeToJson(trainer);
        idTrainerCreated = trainer.getId();
        System.out.println(
                "Trainer " + trainer.getName() + " created" + "\n"
                        + poke.getId() + " added to pokemon team" + "\n"
                        + "ID: " + idTrainerCreated);
        return 0;
    }

    public String getIdTrainerCreated() {
        return idTrainerCreated;
    }
}
