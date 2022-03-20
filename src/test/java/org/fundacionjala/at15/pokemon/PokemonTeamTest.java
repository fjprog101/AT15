package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokemonTeamTest {
    @Test
    public void theTeamPokemonShouldStartWithOnePokemon() {
        PokemonTeam team = new PokemonTeam("Pikachu");
        assertEquals("Pikachu", team.getPokemonTeam().get(0));
    }

    @Test
    public void itShouldAddAPokemonOnlyIfTheTeamHasLessThanSixPokemons() {
        PokemonTeam team = new PokemonTeam("Pikachu");
        team.addPokemon("pokemon3");
        team.addPokemon("pokemon3");
        team.addPokemon("pokemon4");
        team.addPokemon("pokemon5");
        team.addPokemon("Charmander");
        assertEquals("Charmander", team.getPokemonTeam().get(5));
        team.addPokemon("pokemon7");
        assertEquals(6, team.getPokemonTeam().size());
    }
}
