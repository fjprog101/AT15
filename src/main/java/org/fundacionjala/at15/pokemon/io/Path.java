package org.fundacionjala.at15.pokemon.io;

public enum Path {
    POKEMON("/.pkm/pokemon"),
    TRAINER("/.pkm/trainer"),
    BATTLE("/.pkm/battle"),
    TOWN("/.pkm/town");

    private final String pathString;

    Path(String pathString) {
        this.pathString = pathString;
    }

    public String getPathString() {
        return this.pathString;
    }
}
