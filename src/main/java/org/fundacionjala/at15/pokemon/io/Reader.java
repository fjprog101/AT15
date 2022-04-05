package org.fundacionjala.at15.pokemon.io;

import java.io.File;

import org.fundacionjala.at15.pokemon.*;

public class Reader {
    private static String result = "";
    private static final int THREE = 3;
    public static Entity read(String fileName) {
        String subName = fileName.substring(0, THREE);
        if (PathHandler.getTypeFile(fileName).equals("json")) {
            File path = PathHandler.getPath(fileName);
            String text = PathHandler.stringReader(path);
            return ReaderJSON.readJSON(subName, text);
        }
        return null;
    }

    public static void parsePokemonObject(Pokemon pokemon) {
        System.out.println();
        String identifier = pokemon.getId();
        System.out.println("id: " + identifier);

        String name = pokemon.getPokemonName();
        System.out.println("name: " + name);

        int currentHitPoints = pokemon.getHitPoints().getCurrentHitPoints();
        int maxHitPoints = pokemon.getHitPoints().getMaxHitPoints();
        System.out.println("hitpoints: " + currentHitPoints + "/" + maxHitPoints);

        result = "id: " + identifier + " name: " + name + " hitpoints: " + currentHitPoints + "/" + maxHitPoints;
    }

    public static void parseTrainerObject(Trainer trainer) {
        System.out.println();
        String identifier = trainer.getId();
        System.out.println("id: " + identifier);

        String name = trainer.getName();
        System.out.println("name: " + name);

        int badges = trainer.getBadge();
        System.out.println("badges: " + badges);

        int moneyInWallet = trainer.getWallet().getMoneyInWallet();
        System.out.println("money: " + moneyInWallet);
        result = "id: " + identifier + " name: " + name + " badges: " + badges + " money: " + moneyInWallet;
    }

    public static void parseTrainerBattleObject(TrainerBattle trainerBattle) {
        System.out.println();
        String identifier = trainerBattle.getId();
        System.out.println("id: " + identifier);

        String name = trainerBattle.getTrainer1().getName();
        System.out.println("trainer1 name: " + name);

        String name2 = trainerBattle.getTrainer2().getName();
        System.out.println("trainer2 name: " + name2);

        Boolean battleOver = trainerBattle.getBattleOver();
        System.out.println("isBattleOver: " + battleOver);
        result = "id: " + identifier + " trainer1 name: " + name + " trainer2 name: " + name2 + " isBattleOver: "
                + battleOver;
    }

    public static void parseTownObject(Town town) {
        System.out.println();
        String identifier = town.getId();
        System.out.println("id: " + identifier);

        String leaderName = town.getGym().getGymLeader().getName();
        System.out.println("town's gym leader name: " + leaderName);
        result = "id: " + identifier + " town's gym leader name: " + leaderName;
    }

    public static String getResult() {
        return Reader.result;
    }
}
