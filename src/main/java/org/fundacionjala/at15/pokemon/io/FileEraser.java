package org.fundacionjala.at15.pokemon.io;

import java.io.File;

import org.fundacionjala.at15.pokemon.Entity;

public final class FileEraser {
    public static boolean eraseFile(Entity entity) {
        String path = entity.getType().getPath() + "/" + entity.getId() + ".json";
        return new File(path).delete();
    }
}