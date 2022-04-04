package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.io.Writer;
import org.fundacionjala.at15.pokemon.Pokemon;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "pokemon", description = "Create a pokemon")
public class CreatePokemon implements Callable<Integer> {
    private String idPokemonCreated;
    private Pokemon newPokemon;
    private String warningMessage = "";

    @Option(names = { "-name", "-n" }, description = "pokemon name")
    private String pokemonName;

    @Option(names = { "-hitPoints", "-hp" }, description = "pokemon Hit-Points")
    private int hitPoints;

    @Override
    public Integer call() throws IncompleteArguments {
        try {
            newPokemon = new Pokemon(hitPoints, pokemonName);
            this.idPokemonCreated = newPokemon.getId();
            Writer.writeToJson(newPokemon);
            System.out.println(
                    "Pokemon Created: \n"
                            + "Name: " + newPokemon.getPokemonName() + "\n"
                            + "Hit points:" + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
                            + "ID: " + idPokemonCreated);
        } catch (IncompleteArguments ex) {
            warningMessage = "Error. Incomplete arguments for the create pokemon command.";
            ex.warningCreatePokemon();
        }
        return 0;
    }

    public String getIdPokemonCreated() {
        return idPokemonCreated;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
}