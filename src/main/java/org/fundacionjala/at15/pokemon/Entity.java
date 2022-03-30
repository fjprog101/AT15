package org.fundacionjala.at15.pokemon;

import org.fundacionjala.at15.pokemon.ID.Prefixer;
import org.fundacionjala.at15.pokemon.io.EntityType;

public abstract class Entity implements Prefixer {
    protected String identifier;
    protected EntityType type;

    public String getIdentifier() {
        return this.identifier;
    }

    public EntityType getType() {
        return this.type;
    }
}
