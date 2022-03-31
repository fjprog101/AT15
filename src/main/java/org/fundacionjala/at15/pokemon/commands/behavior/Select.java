package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.io.Reader;
import static org.fundacionjala.at15.pokemon.io.Writer.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "select", description = "Select an object")
public class Select implements Callable<Integer> {
    @Option(names = { "-id" }, description = "Entity ID")
    private String entityID;

    @Override
    public Integer call() {
        if (entityID.length() > 0) {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            setCurrentEntity(current);
            writeToJson(current);

            System.out.println("You have selected: ");
            System.out.println(getEntitySelected());
        } else {
            System.out.println("Invalid ID, please try with a valid Entity ID");
        }
        return 0;
    }

    private void setCurrentEntity(CurrentEntities current) {
        final int three = 3;

        String prefix = entityID.substring(0, three);

        switch (prefix) {
            case "pkm":
                current.setPokemon(entityID);
                break;

            case "trn":
                current.settrainer(entityID);
                break;

            case "btt":
                current.setBattle(entityID);
                break;

            case "twn":
                current.setTown(entityID);

            default:
                break;
        }
    }

    private String getEntitySelected() {
        final int three = 3;
        Pokemon pokemon;
        Trainer trainer;
        String prefix = entityID.substring(0, three);
        String result = "";

        switch (prefix) {
            case "pkm":
                pokemon = (Pokemon) Reader.readJson(entityID);
                result = "Movements: " + pokemon.getMovementList().size() + "\n";
                break;

            case "trn":
                trainer = (Trainer) Reader.readJson(entityID);
                result = "Pokeballs: " + trainer.getPokeballs().size() + "\n";
                break;

            default:
                break;
        }

        return result;
    }
}
