package org.fundacionjala.at15.pokemon;

public class Pokeball extends Item {

    public Pokeball() {
        checkPokemonHP();
    }

    // pokemon will be the instance of the wildBattle 

    public boolean checkPokemonHP() {
        return (pokemon.hp / pokemon.maxHP) * 100 <= 100;
    }
}
