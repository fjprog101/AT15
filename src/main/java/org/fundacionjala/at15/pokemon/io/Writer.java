package org.fundacionjala.at15.pokemon.io;

import java.io.*;

import com.google.gson.Gson;

import org.fundacionjala.at15.pokemon.Entity;

public final class Writer {
    public static void writeToJson(Entity entity) {
        File path = new File(entity.getType().getPath());
        PathHandler.checkFolder(path);
        String fileName = entity.getId();
        String jsonString = new Gson().toJson(entity);
        try {
            FileWriter file = new FileWriter(path + "/" + fileName + ".json");
            file.write(jsonString);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
