package org.fundacionjala.at15.pokemon.commands;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":trainer", description = "create a trainer")
public class TrainerCommands implements Callable<Integer> {

    @Option(names = {"-name", "-n"}, description = "trainer name")
    @Parameters(paramLabel = "NAME")
    private String trainerName;

    @Option(names = {"-pokeID", "-pID"}, description = "add pokemon to trainer")
    @Parameters(paramLabel = "POKEMON-ID")
    private Pokemon pokemon;

    @Override
    public Integer call() {
        Trainer trainer = new Trainer(pokemon, trainerName);
<<<<<<< HEAD
        String hCode = Identifier.generateIdTrainer(trainer);
=======
        Identifier identifier = new Identifier();
        String hCode = identifier.generateIdTrainer(trainer);
>>>>>>> f5d1903 (commands/TownCommands.java added)
        System.out.println(
                "Trainer " + trainer.getName() + " created" + "\n"
                        + pokemon.hashCode() + " added to pokemon team" + "\n"
                        + "ID: " + hCode
        );
        return 0;
    }
}
