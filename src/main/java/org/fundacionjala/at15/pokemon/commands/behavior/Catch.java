package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.Exceptions.TrainerItemsException;
import org.fundacionjala.at15.pokemon.io.Reader;
import picocli.CommandLine.Command;

import static org.fundacionjala.at15.pokemon.io.Writer.writeToJson;

@Command(name = "catch", description = "Attempt to catch a wild pokemon")
public class Catch implements Callable<Integer> {

    @Override
    public Integer call() {

        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        assert current != null;
        Pokemon wildPokemon = (Pokemon) Reader.readJson(current.getPokemonOpponent());
        Trainer trainer = (Trainer) Reader.readJson(current.gettrainer());

        assert wildPokemon != null;
        if (wildPokemon.getHitPoints().is20Percent()) {
            assert trainer != null;
            try {
                trainer.usePokeball(wildPokemon);
            } catch (TrainerItemsException e) {
                System.out.println("ERROR: ");
                e.printStackTrace(System.out);
            }
            current.setPokemonOpponent("");
            writeToJson(current);
            System.out.println("Pokemon catch!");
        } else {
            System.out.println("Pokemon escaped!");
        }
        return 0;
    }

}
