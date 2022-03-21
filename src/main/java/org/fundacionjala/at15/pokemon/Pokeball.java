package org.fundacionjala.at15.pokemon;

public class Pokeball extends Item {

    private final double hpPercent = 0.2;
    Pokemon pokemon = new Pokemon(200);

    public Pokeball() {
        checkPokemonHP(pokemon);
    }

    // pokemon will be the instance of the wildBattle

    public boolean checkPokemonHP(Pokemon poke) {
        return (poke.hp * hpPercent > 20);
    }
}