package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;

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
        if ((hitPoints <= 0) || (pokemonName == null)) {
            throw new IncompleteArguments(
                    "Error. Incomplete arguments for the create pokemon command. Required arguments: -name -hitpoints.",
                    null, true, false);
        }
        newPokemon = new Pokemon(hitPoints, pokemonName);
        this.idPokemonCreated = newPokemon.getId();
        newPokemon.write();
        System.out.println(
                "Pokemon Created: \n"
                        + "Name: " + newPokemon.getPokemonName() + "\n"
                        + "Hit points:" + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
                        + "ID: " + idPokemonCreated);
        return 0;
    }

    public String getIdPokemonCreated() {
        return idPokemonCreated;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
}