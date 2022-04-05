package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.Exeptions.TrainerItemsException;
import org.fundacionjala.at15.pokemon.io.Reader;
import picocli.CommandLine.Command;

@Command(name = "catch", description = "Attempt to catch a wild pokemon")
public class Catch implements Callable<Integer> {

    @Override
    public Integer call() throws TrainerItemsException {

        CurrentEntities current = (CurrentEntities) Reader.read("crt-12345678");
        assert current != null;
        Pokemon wildPokemon = (Pokemon) Reader.read(current.getPokemonOpponent());
        Trainer trainer = (Trainer) Reader.read(current.gettrainer());

        assert wildPokemon != null;
        if (wildPokemon.getHitPoints().is20Percent()) {
            assert trainer != null;
            trainer.usePokeball(wildPokemon);
            current.setPokemonOpponent("");
            current.write();
            System.out.println("Pokemon catch!");
        } else {
            System.out.println("Pokemon escaped!");
        }
        return 0;
    }

}
