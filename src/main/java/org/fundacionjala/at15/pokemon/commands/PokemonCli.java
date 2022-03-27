package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.ID.Identifier;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "pkm admin", subcommands = { PokemonCommand.class,
    CommandLine.HelpCommand.class }, description = "Create data for the Pokemon World")
public class PokemonCli {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new PokemonCli()).execute(args);
        System.exit(exitCode);
    }
}

@Command(name = "pokemon", description = "Create Pokemons data")
class PokemonCommand implements Runnable {

    @Option(names = { "-name" }, required = true, description = "Pokemon name")
    private String name;

    @Option(names = { "-hitpoints" }, required = true, description = "Pokemon HitPoints")
    private int hitpoints;

    @Override
    public void run() {
        Pokemon newPokemon = new Pokemon(hitpoints, name);
        String hCode = Identifier.generateIdPokemon(newPokemon);
        System.out.println(
            "Pokemon created: \n"
            + "Name: " + newPokemon.getPokemonName() + "\n"
            + "HitPoints: " + newPokemon.getHitPoints().getCurrentHitPoints() + "\n"
            + "ID: " + hCode);
    }
}