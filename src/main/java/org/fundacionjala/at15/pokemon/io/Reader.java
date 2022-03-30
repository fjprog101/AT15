package org.fundacionjala.at15.pokemon.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import org.fundacionjala.at15.pokemon.*;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class Reader {
    private static String result = "";
    private static final int THREE = 3;

    public static Entity readJson(String fileName) {
        File path = getPath(fileName);
        String subName = fileName.substring(0, THREE);
        JSONParser jsonParser = new JSONParser();
        String line = jSonStringReader(path);
        try (FileReader reader = new FileReader(path)) {
            Object obj = jsonParser.parse(reader);
            if (subName.equals("pkm")) {
                parsePokemonObject((JSONObject) obj);
                Pokemon entity = new Gson().fromJson(line, Pokemon.class);
                return entity;
            }
            if (subName.equals("trn")) {
                parseTrainerObject((JSONObject) obj);
                Trainer entity = new Gson().fromJson(line, Trainer.class);
                return entity;
            }
            if (subName.equals("btt")) {
                parseTrainerBattleObject((JSONObject) obj);
                TrainerBattle entity = new Gson().fromJson(line, TrainerBattle.class);
                return entity;
            }
            if (subName.equals("twn")) {
                parseTownObject((JSONObject) obj);
                Town entity = new Gson().fromJson(line, Town.class);
                return entity;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String jSonStringReader(File path) {
        String line = "";
        try {
            BufferedReader input = new BufferedReader(new FileReader(path));
            line = input.readLine();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return line;
    }

    public static File getPath(String fileName) {
        String subName = fileName.substring(0, THREE);
        switch (subName) {
            case "pkm":
                return new File(System.getProperty("user.home") + "/" + POKEMON.getPath() + "/" + fileName + ".json");
            case "trn":
                return new File(System.getProperty("user.home") + "/" + TRAINER.getPath() + "/" + fileName + ".json");
            case "btt":
                return new File(System.getProperty("user.home") + "/" + BATTLE.getPath() + "/" + fileName + ".json");
            case "twn":
                return new File(System.getProperty("user.home") + "/" + TOWN.getPath() + "/" + fileName + ".json");
            default:
                return null;
        }
    }

    private static void parsePokemonObject(JSONObject entity) {
        System.out.println();
        String identifier = (String) entity.get("identifier");
        System.out.println("id: " + identifier);

        String name = (String) entity.get("pokemonName");
        System.out.println("name: " + name);

        JSONObject pokemonObject = (JSONObject) entity.get("hitPoints");
        Long currentHitPoints = (Long) pokemonObject.get("currentHitPoints");
        Long maxHitPoints = (Long) pokemonObject.get("maxHitPoints");
        System.out.println("hitpoints: " + currentHitPoints + "/" + maxHitPoints);

        result = "id: " + identifier + " name: " + name + " hitpoints: " + currentHitPoints + "/" + maxHitPoints;
    }

    private static void parseTrainerObject(JSONObject entity) {
        System.out.println();
        String identifier = (String) entity.get("identifier");
        System.out.println("id: " + identifier);

        String name = (String) entity.get("name");
        System.out.println("name: " + name);

        Long badges = (Long) entity.get("badge");
        System.out.println("badges: " + badges);

        JSONObject walletObject = (JSONObject) entity.get("wallet");
        Long moneyInWallet = (Long) walletObject.get("moneyInWallet");
        System.out.println("money: " + moneyInWallet);
        result = "id: " + identifier + " name: " + name + " badges: " + badges + " money: " + moneyInWallet;
    }

    private static void parseTrainerBattleObject(JSONObject entity) {
        System.out.println();
        String identifier = (String) entity.get("identifier");
        System.out.println("id: " + identifier);

        JSONObject trainer1Object = (JSONObject) entity.get("trainer1");
        String name = (String) trainer1Object.get("name");
        System.out.println("trainer1 name: " + name);

        JSONObject trainer2Object = (JSONObject) entity.get("trainer2");
        String name2 = (String) trainer2Object.get("name");
        System.out.println("trainer2 name: " + name2);

        Boolean battleOver = (Boolean) entity.get("battleOver");
        System.out.println("isBattleOver: " + battleOver);
        result = "id: " + identifier + " trainer1 name: " + name + " trainer2 name: " + name2 + " isBattleOver: " + battleOver;
    }

    private static void parseTownObject(JSONObject entity) {
        System.out.println();
        String identifier = (String) entity.get("identifier");
        System.out.println("id: " + identifier);

        JSONObject gym = (JSONObject) entity.get("gym");
        JSONObject gymLeader = (JSONObject) gym.get("gymLeader");
        String leaderName = (String) gymLeader.get("name");
        System.out.println("town's gym leader name: " + leaderName);
        result = "id: " + identifier + " town's gym leader name: " + leaderName;
    }

    public static String getResult() {
        return Reader.result;
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(1, "Pikachu");
        Trainer ash = new Trainer(pikachu, "Ash");
        Writer.writeToJson(ash);
        Entity entity = readJson(ash.getIdentifier());
        Trainer trainer = (Trainer) entity;
        System.out.println(trainer.getName());
    }
}
