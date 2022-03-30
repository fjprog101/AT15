package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.WildPokemonBattle;
import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":wildbattle", description = "create a battle with a wild pokemon")
public class WildPokemonBattleCommands implements Callable<Integer> {

    @Option(names = { "-btltrID"}, description = "trainer ID")
    private String trainerID;

    @Option(names = { "-btlpokeID"}, description = "Wild pokemon ID")
    private String pokemonID;

    @Override
    public Integer call() {
        Pokemon poke = (Pokemon) Reader.readJson(pokemonID);
        Trainer trainer = (Trainer) Reader.readJson(trainerID);
        WildPokemonBattle wildBattle = new WildPokemonBattle(trainer, poke);
        Writer.writeToJson(wildBattle);
        return 0;
    }
}
