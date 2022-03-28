package org.fundacionjala.at15.pokemon.ID;

import org.fundacionjala.at15.pokemon.Entity;

public class Identifier {

    public static String generateId(Entity entity) {
        int hCode = entity.hashCode();
        String identifier = Integer.toString(hCode);
        return entity.getPrefix() + identifier;
    }
}