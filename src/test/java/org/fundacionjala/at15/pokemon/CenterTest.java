package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CenterTest {
    @Test
    public void itShouldFullRestoreHP() {
        Pokemon pokemon = new Pokemon(1000, "name");
        PokemonTeam team = new PokemonTeam(pokemon);
        pokemon.getHitPoints().setCurrentHitPoints(0);
        Center center = new Center();
        center.healTeam(team);
        double expected = 1000;
        assertEquals(expected, pokemon.getHitPoints().getCurrentHitPoints(), 0);
    }
}