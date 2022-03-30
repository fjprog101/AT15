package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "town", description = "Create a Pokemon Town")
public class TownCLI implements Callable<Integer> {

<<<<<<< HEAD

    @Option(names = {"-addwpok", "-tp"}, description = "Add a Wild Pokemon in town")
    private String wildPokemon;

    @Option(names = {"-addtrainer", "-tt"}, description = "Add a trainer in town")
    private String trainerID;
=======
    @Option(names = { "-addwpok1",
            "-addwpkm1" }, description = "Add a Wild Pokemon in town", defaultValue = "pkm1334675172")
    private String wildPokemon1;

    @Option(names = { "-addwpok2",
            "-addwpkm2" }, description = "Add a Wild Pokemon in town", defaultValue = "pkm1334675172")
    private String wildPokemon2;

    @Option(names = { "-addwpok3",
            "-addwpkm3" }, description = "Add a Wild Pokemon in town", defaultValue = "pkm1334675172")
    private String wildPokemon3;

    @Option(names = { "-addwpok4",
            "-addwpkm4" }, description = "Add a Wild Pokemon in town", defaultValue = "pkm1334675172")
    private String wildPokemon4;

    @Option(names = { "-addtrainer1#" }, description = "Add a trainer in town", defaultValue = "trn1787913218")
    private String trainerID1;

    @Option(names = { "-addtrainer2#" }, description = "Add a trainer in town", defaultValue = "trn1787913218")
    private String trainerID2;

    @Option(names = { "-addtrainer3#" }, description = "Add a trainer in town", defaultValue = "trn1787913218")
    private String trainerID3;

    @Option(names = { "-addtrainer4#" }, description = "Add a trainer in town", defaultValue = "trn1787913218")
    private String trainerID4;
>>>>>>> dev/pokemon

    @Override
    public Integer call() {
        Town newTown = new Town();

        Pokemon poke = (Pokemon) Reader.readJson(wildPokemon);
        newTown.addWildPokemonsToTown(poke);
        Trainer trainer = (Trainer) Reader.readJson(trainerID);
        newTown.addTrainersToTown(trainer);
        Writer.writeToJson(newTown);
<<<<<<< HEAD
=======
        // System.out.println("Town created: \n"
        // + "WildPokemonsList: ");
        // for (int ind = 0; ind < newTown.getWildPokemons().size(); ind++) {
        // System.out.println(newTown.getWildPokemons().get(ind).getPokemonName() + " "
        // + newTown.getWildPokemons().get(ind).getIdentifier());
        // }
        // System.out.println("Trainers: ");
        // for (int ind2 = 0; ind2 < newTown.getTrainers().size(); ind2++) {
        // System.out.println(newTown.getTrainers().get(ind2).getName() + " "
        // + newTown.getTrainers().get(ind2).getIdentifier());
        // }
        // System.out.println("ID" + hCode + "\n"
        // + "Store\nPokemon Center\nPokemon Gym");
>>>>>>> dev/pokemon

        return 0;
    }

}
