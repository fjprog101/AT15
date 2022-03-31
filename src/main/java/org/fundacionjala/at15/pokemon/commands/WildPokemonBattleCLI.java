package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.WildPokemonBattle;
import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "wildbattle", description = "create a battle with a wild pokemon")
public class WildPokemonBattleCLI implements Callable<Integer> {
    private String idCreateWildPokemonBattle;

    @Option(names = { "-btltrID", "-bt" }, description = "trainer ID")
    private String trainerID;

    @Option(names = { "-btlpokeID", "-bp" }, description = "Wild pokemon ID")
    private String pokemonID;

    @Override
    public Integer call() {
        Pokemon poke = (Pokemon) Reader.readJson(pokemonID);
        Trainer trainer = (Trainer) Reader.readJson(trainerID);
        WildPokemonBattle wildBattle = new WildPokemonBattle(trainer, poke);
        Writer.writeToJson(wildBattle);
        idCreateWildPokemonBattle = wildBattle.getId();
        System.out.println(
                "Battle Created: \n"
                + trainer.getId() + " trainer added to battle" + "\n"
                + poke.getId() + " pokemon added to battle" + "\n"
                + "ID: " + idCreateWildPokemonBattle);
        return 0;
    }

    public String getIdCreateWildPokemonBattle() {
        return idCreateWildPokemonBattle;
    }
}
