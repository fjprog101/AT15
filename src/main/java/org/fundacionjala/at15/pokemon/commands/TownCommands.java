package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.Town;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":town", description = "Create a Pokemon Town")
public class TownCommands implements Callable<Integer> {

    @Option(names = {"-wildpok#", "-wpkm#"}, description = "Number of wild Pokemons in town", defaultValue = "50")
    @Parameters(paramLabel = "WILD-POKEMON")
    private int wildPokemonsTotal;

    @Option(names = {"-trainers#"}, description = "Number of trainers in town", defaultValue = "10")
    @Parameters(paramLabel = "TRAINERS-TOWN")
    private int trainersTotal;

    @Override
    public Integer call() {
        Town newTown = new Town();
        Identifier identifier = new Identifier();
        String hCode = identifier.generateIdTown(newTown);
        newTown.addWildPokemonsToTown(wildPokemonsTotal);
        newTown.addTrainersToTown(trainersTotal);
        System.out.println(
                "Town created: \n"
                        + "WildPokemons: " + newTown.getWildPokemons().size() + "\n"
                        + "Trainers: " + newTown.getTrainers().size() + "\n"
                        + "ID" + hCode + "\n"
                        + "Store\nPokemon Center\nPokemon Gym");
        return 0;
    }

}
