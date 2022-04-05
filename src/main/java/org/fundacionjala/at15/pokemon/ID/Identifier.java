package org.fundacionjala.at15.pokemon.ID;

import java.util.UUID;

import org.fundacionjala.at15.pokemon.Entity;

public final class Identifier {
    static final int NUMBER_CUT = 23;
    public static String generateId(Entity entity) {
        String uuid = UUID.randomUUID().toString().substring(NUMBER_CUT);

        return entity.getPrefix() + uuid;
    }
}