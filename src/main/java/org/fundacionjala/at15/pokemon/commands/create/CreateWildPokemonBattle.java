package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.WildPokemonBattle;
import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.io.XmlWriter;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "wildbattle", description = "Create a battle against a wild pokemon")
public class CreateWildPokemonBattle implements Callable<Integer> {
    private String idCreateWildPokemonBattle;

    @Option(names = { "-btltrID", "-bt" }, description = "trainer ID")
    private String trainerID;

    @Option(names = { "-btlpokeID", "-bp" }, description = "Wild pokemon ID")
    private String pokemonID;

    @Option(names = { "--xml" }, description = "create the object in xml format")
    private boolean xml;

    @Override
    public Integer call() {
        Pokemon poke = (Pokemon) Reader.read(pokemonID);
        Trainer trainer = (Trainer) Reader.read(trainerID);
        WildPokemonBattle wildBattle = new WildPokemonBattle(trainer, poke);

        if (!xml) {
            wildBattle.write();
        } else {
            wildBattle.write(new XmlWriter());
        }


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
