package org.fundacionjala.at15.pokemon;

import org.fundacionjala.at15.pokemon.ID.Prefixer;
import org.fundacionjala.at15.pokemon.io.EntityType;

public abstract class Entity implements Prefixer {
    protected String id;
    protected EntityType type;

    public String getId() {
        return this.id;
    }

    public EntityType getType() {
        return this.type;
    }
}
