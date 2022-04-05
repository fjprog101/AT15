package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Move;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.io.JsonWriter;
import org.fundacionjala.at15.pokemon.io.Reader;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "learn", description = "Create and assign an attack to a pokemon")
public class Learn implements Callable<Integer> {

    @Option(names = { "-name" }, description = "Attack movement")
    private String movement;

    @Option(names = { "-damage" }, description = "Attack potency", defaultValue = "40")
    private int potency;

    private String id;
    private final int maxSizeOfMovemments = 4;

    @Override
    public Integer call() throws IncompleteArguments {

        if (movement != "" && potency > 0) {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            id = current.getPokemon();
            Pokemon pokemon = (Pokemon) Reader.readJson(id);
            Move move = new Move();
            move.setMovement(movement);
            move.setPotency(potency);
            if (pokemon.getMovementList().size() == maxSizeOfMovemments) {
                throw new IncompleteArguments("Error, A pokemon cannot learn more than four movements", null, true,
                        false);
            } else {
                pokemon.setMoveToList(move);
                pokemon.write(new JsonWriter());
                System.out.println("Your Pokemon learn a new Attack movement");
            }

        }
        return 0;
    }

    public String getIdPOkemon() {
        return id;
    }
}
