package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.TrainerBattle;
import org.fundacionjala.at15.pokemon.commands.exceptions.BattleCommandException;
import org.fundacionjala.at15.pokemon.io.XmlWriter;

import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":trainerBattle", description = "Create a battle against a trainer")
public class CreateTrainerBattle implements Callable<Integer> {
    private String idCreateTrainerBattle;

    @Option(names = { "-trainerID1", "-tID1" }, description = "trainer 1 ID")
    private String trainerID1;

    @Option(names = { "-trainerID2", "-tID2" }, description = "trainer 2 ID")
    private String trainerID2;

    @Option(names = { "--xml" }, description = "create the object in xml format")
    private boolean xml;

    @Override
    public Integer call() throws BattleCommandException {

        if (trainerID1 == null || trainerID2 == null) {
            throw new BattleCommandException(
                    "Error. Incomplete arguments to create a battle command. Required arguments: -tID1 -tID2.",
                    null, true, false);
        }

        Trainer trainer1 = (Trainer) Reader.read(trainerID1);
        Trainer trainer2 = (Trainer) Reader.read(trainerID2);
        TrainerBattle trainerBattle = new TrainerBattle(trainer1, trainer2);

        if (!xml) {
            trainerBattle.write();
        } else {
            trainerBattle.write(new XmlWriter());
        }


        idCreateTrainerBattle = trainerBattle.getId();
        System.out.println(
                "Battle Created: \n"
                        + trainer1.getId() + " trainer added to battle" + "\n"
                        + trainer2.getId() + " trainer added to battle" + "\n"
                        + "ID: " + idCreateTrainerBattle);
        return 0;
    }

    public String getIdCreateTrainerBattle() {
        return idCreateTrainerBattle;
    }
}
