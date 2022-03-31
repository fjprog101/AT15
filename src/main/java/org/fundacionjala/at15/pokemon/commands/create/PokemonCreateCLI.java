package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.io.Writer;
import org.fundacionjala.at15.pokemon.Pokemon;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "pokemon", description = "Create a pokemon")
public class PokemonCreateCLI implements Callable<Integer> {
    private String idPokemonCreated;

    @Option(names = { "-name", "-n" }, description = "pokemon name", defaultValue = "Pikachu")
    private String pokemonName;

    @Option(names = { "-hitPoints", "-hp" }, description = "pokemon Hit-Points", defaultValue = "100")
    private int hitPoints;

    @Override
    public Integer call() {
        Pokemon newPokemon = new Pokemon(hitPoints, pokemonName);
        this.idPokemonCreated = newPokemon.getId();
        Writer.writeToJson(newPokemon);
        System.out.println(
                "Pokemon Created: \n"
                + "Name: " + newPokemon.getPokemonName() +  "\n"
                + "Hit points:" + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
                + "ID: " + idPokemonCreated);
        return 0;
    }

    public String getIdPokemonCreated() {
        return idPokemonCreated;
    }
}