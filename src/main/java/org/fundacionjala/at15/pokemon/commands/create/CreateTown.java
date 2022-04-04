package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "town", description = "Create a town")
public class CreateTown implements Callable<Integer> {
    private String idCreateTown;

    @Option(names = { "-addwpok", "-tp" }, description = "Add a Wild Pokemon in town")
    private String wildPokemon;

    @Option(names = { "-addtrainer", "-tt" }, description = "Add a trainer in town")
    private String trainerID;

    @Override
    public Integer call() throws IncompleteArguments {
        Town newTown = new Town();

        Pokemon poke = (Pokemon) Reader.readJson(wildPokemon);
        newTown.addWildPokemonsToTown(poke);
        Trainer trainer = (Trainer) Reader.readJson(trainerID);
        newTown.addTrainersToTown(trainer);
        Writer.writeToJson(newTown);
        idCreateTown = newTown.getId();
        System.out.println(
                "Town Created: \n"
                        + trainer.getId() + " trainer added to town" + "\n"
                        + poke.getId() + " pokemon added to town" + "\n"
                        + "ID: " + idCreateTown);

        return 0;
    }

    public String getIdCreateTrainerBattle() {
        return idCreateTown;
    }

}
