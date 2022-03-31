package org.fundacionjala.at15.pokemon.commands;
import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Move;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "learn", description = "Learn an Attack movement")
public class SubCommandLearn implements Callable<Integer> {

    //@Option(names = { "-ID" }, description = "Attack movement")
    //private String pokemonID;

    @Option(names = { "-name" }, description = "Attack movement")
    private String movement;

    @Option(names = { "-damage" }, description = "Attack potency", defaultValue = "40")
    private int potency;


    String id;
    @Override
    public Integer call() {

        if (movement != "" && potency > 0) {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            id =  current.getPokemon();
            Pokemon pokemon = (Pokemon) Reader.readJson(id);
            Move move = new Move();
            move.serMovement(movement);
            move.setPotency(potency);
            pokemon.setMoveToList(move);
            Writer.writeToJson(pokemon);

            System.out.println("Your Pokemon learn a new Attack movement");
        } else {
            System.out.println("Arguments are invalid");
        }
        return 0;
    }
    public String getIdPOkemon() {
        return id;
    }
}
