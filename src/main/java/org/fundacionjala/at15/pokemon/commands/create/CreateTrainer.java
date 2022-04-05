package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;

import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "trainer", description = "Create a trainer")
public class CreateTrainer implements Callable<Integer> {
    private String idTrainerCreated;

    @Option(names = { "-name", "-n" }, description = "trainer name")
    private String trainerName;

    @Option(names = { "-pokeID", "-pID" }, description = "add pokemon to trainer")
    private String pokemonId;

    @Override
    public Integer call() throws IncompleteArguments {
        if (trainerName == null || pokemonId == null) {
            throw new IncompleteArguments(
                    "Error. Incomplete arguments to create a trainer command. Required arguments: -n -pID.",
                    null, true, false);
        }
        Pokemon poke = (Pokemon) Reader.read(pokemonId);

        Trainer trainer = new Trainer(poke, trainerName);
        trainer.write();
        idTrainerCreated = trainer.getId();
        System.out.println(
                "Trainer Created: \n"
                        + "Name: " + trainer.getName() + "\n"
                        + poke.getId() + " added to pokemon team" + "\n"
                        + "ID: " + idTrainerCreated);
        return 0;
    }

    public String getIdTrainerCreated() {
        return idTrainerCreated;
    }
}
