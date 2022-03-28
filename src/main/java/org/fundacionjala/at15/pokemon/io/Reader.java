package org.fundacionjala.at15.pokemon.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.fundacionjala.at15.pokemon.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class Reader {
    public static void readJson(Entity entity) {
        JSONParser jsonParser = new JSONParser();
        File inputFile = new File(System.getProperty("user.home") + "/" + entity.getPath().getPathString() + "/" + entity.getIdentifier() + ".json");

        try (FileReader reader = new FileReader(inputFile)) {
            Object obj = jsonParser.parse(reader);
            if (entity.getPath().getPathString() == "/.pkm/pokemon") {
                parsePokemonObject((JSONObject) obj);
            }
            if (entity.getPath().getPathString() == "/.pkm/trainer") {
                parseTrainerObject((JSONObject) obj);
            }
            if (entity.getPath().getPathString() == "/.pkm/battle") {
                parseBattleObject((JSONObject) obj);
            }
            if (entity.getPath().getPathString() == "/.pkm/town") {
                parseTownObject((JSONObject) obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Writer.writeToJson(pokemon);
        readJson(pokemon);

        Trainer trainer = new Trainer(pokemon, "Ash");
        Writer.writeToJson(trainer);
        readJson(trainer);

        Trainer trainer2 = new Trainer(pokemon, "Brooke");
        TrainerBattle battle = new TrainerBattle(trainer, trainer2);
        Writer.writeToJson(battle);
        readJson(battle);

        Town town = new Town();
        Writer.writeToJson(town);
        readJson(town);
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
    }

    private static void parseBattleObject(JSONObject entity) {
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
    }

    private static void parseTownObject(JSONObject entity) {
        System.out.println();
        String identifier = (String) entity.get("identifier");
        System.out.println("id: " + identifier);

        JSONObject gym = (JSONObject) entity.get("gym");
        JSONObject gymLeader = (JSONObject) gym.get("gymLeader");
        String leaderName = (String) gymLeader.get("name");
        System.out.println("town's gym leader name: " + leaderName);
    }
}
