package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":create", description = "Entry point to create objects in Pokemon world")
public class PokemonCommands implements Callable<Integer> {

    @Option(names = {"-name", "-n"}, description = "pokemon name", defaultValue = "Pikachu")
    @Parameters(paramLabel = "NAME") String pokemonName;

    @Option(names = {"-hitPoints", "-hp"}, description = "pokemon Hit-Points", defaultValue = "100")
    @Parameters(paramLabel = "HIT-POINTS") int hitPoints;

    @Override
    public Integer call() {
        org.fundacionjala.at15.pokemon.Pokemon newPokemon = new org.fundacionjala.at15.pokemon.Pokemon(hitPoints, pokemonName);
        String hCode = Identifier.generateIdPokemon(newPokemon);
        System.out.println(
                "Pokemon created: \n"
                        + "Name: " + newPokemon.getPokemonName() + "\n"
                        + "HitPoints: " + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
                        + "ID: " + hCode);
        return 0;
    }

}