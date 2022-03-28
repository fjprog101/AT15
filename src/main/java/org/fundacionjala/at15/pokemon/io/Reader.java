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
}
