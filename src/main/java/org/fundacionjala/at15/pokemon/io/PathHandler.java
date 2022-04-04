package org.fundacionjala.at15.pokemon.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import static org.fundacionjala.at15.pokemon.io.Query.*;

public class PathHandler {
    private static final int THREE = 3;
    public static String getTypeFile(String name) {
        String path = getSubPath(name);
        ArrayList<String> fileNames = getFiles(path);
        String selectedFile = "";
        for (String names : fileNames) {
            if (names.contains(name)) {
                selectedFile = names;
            }
        }
        String result = "";
        if (selectedFile.contains(".json")) {
            result = "json";
        }
        if (selectedFile.contains(".xml")) {
            result = "xml";
        }
        return result;
    }

    public static File getPath(String fileName) {
        String path = getSubPath(fileName);
        return new File(path + "/" + fileName + ".json");
    }

    public static File getPathXML(String fileName) {
        String path = getSubPath(fileName);
        return new File(path + "/" + fileName + ".xml");
    }

    public static String getSubPath(String name) {
        String subName = name.substring(0, THREE);
        switch (subName) {
            case "pkm":
                return POKEMON.getPath();
            case "trn":
                return TRAINER.getPath();
            case "btt":
                return BATTLE.getPath();
            case "twn":
                return TOWN.getPath();
            case "crt":
                return CURRENT.getPath();
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
