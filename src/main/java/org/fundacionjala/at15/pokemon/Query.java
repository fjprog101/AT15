package org.fundacionjala.at15.pokemon;

import java.io.File;
import static org.fundacionjala.at15.pokemon.io.Reader.*;

import org.fundacionjala.at15.pokemon.io.Path;
import java.util.ArrayList;

public class Query {
    public static ArrayList<String> getFiles(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> listFile = new ArrayList<String>();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                listFile.add(file.getName());
            }
        }
        return listFile;
    }

    public static ArrayList<String> getMatches(Path entityType, String name) {
        String path = System.getProperty("user.home") + entityType.getPathString();
        ArrayList<String> fileNames = getFiles(path);
        ArrayList<String> selectedFiles = new ArrayList<String>();
        for (String names : fileNames) {
            File file = new File(path + "/" + names);
            String content = jSonStringReader(file);
            if (content.contains(name)) {
                selectedFiles.add(names);
            }
        }
        return selectedFiles;
    }
}