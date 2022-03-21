package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokemonTeamTest {
    @Test
    public void theTeamPokemonShouldStartWithOnePokemon() {
        Pokemon pikachu = new Pokemon(100);
        PokemonTeam team = new PokemonTeam(pikachu);
        assertEquals(pikachu, team.getPokemonTeam().get(0));
    }

    @Test
    public void itShouldAddAPokemonOnlyIfTheTeamHasLessThanSixPokemons() {
        PokemonTeam team = new PokemonTeam(new Pokemon(1));
        team.addPokemon(new Pokemon(2));
        team.addPokemon(new Pokemon(3));
        team.addPokemon(new Pokemon(4));
        team.addPokemon(new Pokemon(5));
        Pokemon charmander = new Pokemon(150);
        team.addPokemon(charmander);
        assertEquals(charmander, team.getPokemonTeam().get(5));
        team.addPokemon(new Pokemon(7));
        assertEquals(6, team.getPokemonTeam().size());
    }
}
