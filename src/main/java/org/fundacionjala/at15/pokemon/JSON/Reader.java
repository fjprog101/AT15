package org.fundacionjala.at15.pokemon.JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("employees.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray pokemonList = (JSONArray) obj;
            //System.out.println(employeeList);

            //Iterate over employee array
            pokemonList.forEach(emp -> parseEmployeeObject((JSONObject) emp));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject pokemon) {
        System.out.println();
        //Get employee object within list
        JSONObject pokemonObject = (JSONObject) pokemon.get("pokemon");

        //Get employee first name
        String firstName = (String) pokemonObject.get("Name");
        System.out.println(firstName);

        //Get employee last name
        Long lastName = (Long) pokemonObject.get("CurrentHitPoints");
        System.out.println(lastName);

        //Get employee website name
        Long website = (Long) pokemonObject.get("MaxHitPoints");
        System.out.println(website);
    }
}
