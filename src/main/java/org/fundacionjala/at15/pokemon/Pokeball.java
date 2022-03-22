package org.fundacionjala.at15.pokemon;

public class Pokeball extends Item {
    static final int COST = 20;

    public Pokeball() {
        this.cost = COST;
    }

    public boolean catchPokemon(Pokemon poke) {
        return poke.is20Percent();
    }

}