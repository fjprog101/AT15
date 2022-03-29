package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":town", description = "Create a Pokemon Town")
public class TownCommands implements Callable<Integer> {

    @Option(names = {"-addwpok", "-addwpkm"}, description = "Add a Wild Pokemon in town")
    private Pokemon wildPokemon;

    @Option(names = {"-addtrainers#"}, description = "Add a trainer in town")
    private Trainer trainer;

    @Override
    public Integer call() {
        Town newTown = new Town();
        Identifier identifier = new Identifier();
        String hCode = identifier.generateId(newTown);
        newTown.addWildPokemonsToTown(wildPokemon);
        newTown.addTrainersToTown(trainer);
        System.out.println("Town created: \n"
                + "WildPokemonsList: ");
        for (int ind = 0; ind < newTown.getWildPokemons().size(); ind++) {
            System.out.println(newTown.getWildPokemons().get(ind).getPokemonName() + " "
                    + newTown.getWildPokemons().get(ind).getIdentifier());
        }
        System.out.println("Trainers: ");
        for (int ind2 = 0; ind2 < newTown.getTrainers().size(); ind2++) {
            System.out.println(newTown.getTrainers().get(ind2).getName() + " "
                    + newTown.getTrainers().get(ind2).getIdentifier());
        }
        System.out.println("ID" + hCode + "\n"
                + "Store\nPokemon Center\nPokemon Gym");
        return 0;
    }

}
