package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PokemonTeamTest {
    @Test
    public void theTeamPokemonShouldStartWithOnePokemon() {
        Pokemon pikachu = new Pokemon(100, "pikachu");
        PokemonTeam team = new PokemonTeam(pikachu);
        assertEquals(pikachu, team.getPokemonsOfTeam().get(0));
    }

    @Test
    public void itShouldAddAPokemonOnlyIfTheTeamHasLessThanSixPokemons() {
        PokemonTeam team = new PokemonTeam(new Pokemon(1, "pikachu"));
        team.addPokemon(new Pokemon(2, "pikachu"));
        team.addPokemon(new Pokemon(3, "pikachu"));
        team.addPokemon(new Pokemon(4, "pikachu"));
        team.addPokemon(new Pokemon(5, "pikachu"));
        Pokemon charmander = new Pokemon(150, "pikachu");
        team.addPokemon(charmander);
        assertEquals(charmander, team.getPokemonsOfTeam().get(5));
        team.addPokemon(new Pokemon(7, "pikachu"));
        assertEquals(6, team.getPokemonsOfTeam().size());
    }
}
