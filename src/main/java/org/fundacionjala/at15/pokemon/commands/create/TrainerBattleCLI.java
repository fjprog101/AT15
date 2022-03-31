package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.io.*;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.TrainerBattle;

import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = ":trainerBattle", description = "Create a battle against a trainer")
public class TrainerBattleCLI implements Callable<Integer> {
    private String idCreateTrainerBattle;

    @Option(names = { "-trainerID1", "-tID1" }, description = "trainer 1 ID")
    private String trainerID1;

    @Option(names = { "-trainerID2", "-tID2" }, description = "trainer 2 ID")
    private String trainerID2;

    @Override
    public Integer call() {

        Trainer trainer1 = (Trainer) Reader.readJson(trainerID1);
        Trainer trainer2 = (Trainer) Reader.readJson(trainerID2);
        TrainerBattle trainerBattle = new TrainerBattle(trainer1, trainer2);

        Writer.writeToJson(trainerBattle);
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
