package org.fundacionjala.at15.pokemon.io;

import java.io.File;
import static org.fundacionjala.at15.pokemon.io.PathHandler.*;
import java.util.ArrayList;

public class Query {
    public static ArrayList<String> getFiles(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> listFile = new ArrayList<String>();
        for (File file : listOfFiles) {
            listFile.add(file.getName());
        }
        return listFile;
    }

    public static ArrayList<String> getMatches(EntityType entityType, String name) {
        String path = entityType.getPath();
        ArrayList<String> fileNames = getFiles(path);
        ArrayList<String> selectedFiles = new ArrayList<String>();
        for (String names : fileNames) {
            File file = new File(path + "/" + names);
            String content = stringReader(file);
            if (content.contains(name)) {
                String onlyName = names.replace(".json", "");
                selectedFiles.add(onlyName);
            }
        }
        return selectedFiles;
    }
}