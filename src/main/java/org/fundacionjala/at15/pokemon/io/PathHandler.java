package org.fundacionjala.at15.pokemon.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;

public class PathHandler {
    private static final int THREE = 3;
    public static File getPath(String fileName) {
        String subName = fileName.substring(0, THREE);
        switch (subName) {
            case "pkm":
                return new File(POKEMON.getPath() + "/" + fileName + ".json");
            case "trn":
                return new File(TRAINER.getPath() + "/" + fileName + ".json");
            case "btt":
                return new File(BATTLE.getPath() + "/" + fileName + ".json");
            case "twn":
                return new File(TOWN.getPath() + "/" + fileName + ".json");
            case "crt":
                return new File(CURRENT.getPath() + "/" + fileName + ".json");
            default:
                return null;
        }
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
}
