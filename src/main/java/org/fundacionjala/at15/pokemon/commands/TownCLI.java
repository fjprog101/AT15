package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":town", description = "Create a Pokemon Town")
public class TownCLI implements Callable<Integer> {


    @Option(names = {"-addwpok", "-tp"}, description = "Add a Wild Pokemon in town")
    private String wildPokemon;

    @Option(names = {"-addtrainer", "-tt"}, description = "Add a trainer in town")
    private String trainerID;

    @Override
    public Integer call() {
        Town newTown = new Town();

        Pokemon poke = (Pokemon) Reader.readJson(wildPokemon);
        newTown.addWildPokemonsToTown(poke);
        Trainer trainer = (Trainer) Reader.readJson(trainerID);
        newTown.addTrainersToTown(trainer);
        Writer.writeToJson(newTown);

        return 0;
    }

}
