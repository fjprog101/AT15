package org.fundacionjala.at15.pokemon;

public class Pokeball extends Item {

    public Pokeball() {
        checkPokemonHP();
    }

    public boolean checkPokemonHP() {
        return (pokemon.hp / pokemon.maxHP) * 100 <= 20;
    }
}
