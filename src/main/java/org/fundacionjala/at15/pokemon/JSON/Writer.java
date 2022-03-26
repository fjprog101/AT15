package org.fundacionjala.at15.pokemon.JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Writer {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        final int hitpoi = 100;
        Pokemon poke = new Pokemon(hitpoi, "Pikachu");
        //First Employee
        JSONObject pokemon = new JSONObject();
        pokemon.put("Name", poke.getPokemonName());
        pokemon.put("CurrentHitPoints", poke.getHitPoints().getCurrentHitPoints());
        pokemon.put("MaxHitPoints", poke.getHitPoints().getMaxHitPoints());

        JSONObject pokemonObject = new JSONObject();
        pokemonObject.put("pokemon", pokemon);

        //Second Employee
        /*JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);*/

        //Add employees to list
        JSONArray pokemonList = new JSONArray();
        pokemonList.add(pokemonObject);

        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(pokemonList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}