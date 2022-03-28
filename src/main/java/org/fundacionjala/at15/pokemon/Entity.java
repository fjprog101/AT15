package org.fundacionjala.at15.pokemon;

import org.fundacionjala.at15.pokemon.io.Path;

public abstract class Entity {
    protected String identifier;
    protected Path path;

    public String getIdentifier() {
        return this.identifier;
    }

    public Path getPath() {
        return this.path;
    }
}
