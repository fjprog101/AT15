package org.fundacionjala.at15.pokemon.io;

public enum EntityType {
    POKEMON("/.pkm/pokemon"),
    TRAINER("/.pkm/trainer"),
    BATTLE("/.pkm/battle"),
    TOWN("/.pkm/town");

    private final String path;

    EntityType(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
