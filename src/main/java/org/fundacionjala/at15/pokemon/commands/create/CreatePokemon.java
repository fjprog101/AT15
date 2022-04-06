package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;

import org.fundacionjala.at15.pokemon.io.XmlWriter;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "pokemon", description = "Create a pokemon")
public class CreatePokemon implements Callable<Integer> {
    private String idPokemonCreated;

    @Option(names = { "-name", "-n" }, description = "pokemon name")
    private String pokemonName;

    @Option(names = { "-hitPoints", "-hp" }, description = "pokemon Hit-Points")
    private int hitPoints;

    @Option(names = { "--xml" }, description = "create the object in xml format")
    private boolean xml;

    @Option(names = { "-type", "-t" }, description = "pokemon type", defaultValue = "Normal")
    private String pokemonType;

    @Override
    public Integer call() throws IncompleteArguments {
        if ((hitPoints <= 0) || (pokemonName == null)) {
            throw new IncompleteArguments(
                    "Error. Incomplete arguments for the create pokemon command. Required arguments: -name -hitPoints.",
                    null, true, false);
        }
        Pokemon newPokemon = new Pokemon(hitPoints, pokemonName);
        newPokemon = new Pokemon(hitPoints, pokemonName);
        newPokemon.setPokemonType(pokemonType);
        this.idPokemonCreated = newPokemon.getId();
        if (!xml) {
            newPokemon.write();
        } else {
            newPokemon.write(new XmlWriter());
        }

        System.out.println(
                "Pokemon Created: \n"
                        + "Name:         " + newPokemon.getPokemonName() + "\n"
                        + "Hit points:   " + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
                        + "Pokemon type: " + newPokemon.getPokemonType() + "\n"
                        + "ID:           " + idPokemonCreated);
        return 0;
    }

    public String getIdPokemonCreated() {
        return idPokemonCreated;
    }
}