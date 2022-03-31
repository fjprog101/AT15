package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.io.Writer;
import org.fundacionjala.at15.pokemon.Pokemon;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "pokemon", description = "Entry point to create objects in Pokemon world")
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
        return 0;
    }

    public String getIdPokemonCreated() {
        return idPokemonCreated;
    }
}