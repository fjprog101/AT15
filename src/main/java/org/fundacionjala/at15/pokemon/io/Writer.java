package org.fundacionjala.at15.pokemon.io;

import java.io.*;

import com.google.gson.Gson;

import org.fundacionjala.at15.pokemon.Entity;

public final class Writer {
    public static void writeToJson(Entity entity, Path entityPath) {
        File path = new File(System.getProperty("user.home") + entityPath.getPath());
        checkFolder(path);
        String fileName = entity.getIdentifier();
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

    private static void checkFolder(File path) {
        if (path.exists()) {
            System.out.println(path + " already exists");
        } else if (path.mkdirs()) {
            System.out.println(path + " was created");
        } else {
            System.out.println(path + " was not created");
        }
    }
}
