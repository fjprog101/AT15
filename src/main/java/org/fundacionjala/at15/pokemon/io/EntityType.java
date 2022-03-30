package org.fundacionjala.at15.pokemon.io;

public enum EntityType {
    POKEMON(System.getProperty("user.home") + "/.pkm/pokemon"),
    TRAINER(System.getProperty("user.home") + "/.pkm/trainer"),
    BATTLE(System.getProperty("user.home") + "/.pkm/battle"),
    TOWN(System.getProperty("user.home") + "/.pkm/town");

    private final String path;

    EntityType(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
