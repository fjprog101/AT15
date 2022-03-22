package org.fundacionjala.at15.pokemon;

public class Pokeball extends Item {
    static final int POKEBALL_COST = 20;

    public Pokeball() {
        this.cost = POKEBALL_COST;
    }

    public boolean catchPokemon(Pokemon poke) {
        return poke.getHitPoints().is20Percent();
    }

}