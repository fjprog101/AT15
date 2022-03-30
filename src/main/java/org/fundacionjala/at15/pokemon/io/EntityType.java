package org.fundacionjala.at15.pokemon.io;

public enum EntityType {
    POKEMON("/.pkm/pokemon"),
    TRAINER("/.pkm/trainer"),
    BATTLE("/.pkm/battle"),
    TOWN("/.pkm/town");

    private final String pathString;

    EntityType(String pathString) {
        this.pathString = pathString;
    }

    public String getPathString() {
        return this.pathString;
    }
}
