package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.junit.Test;

public class CenterTest {
    @Test
    public void itShouldFullRestoreHP() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(1000, "name");
        PokemonTeam team = new PokemonTeam(pokemon);
        pokemon.getHitPoints().setCurrentHitPoints(0);
        Center center = new Center();
        center.healTeam(team);
        assertEquals(1000, pokemon.getHitPoints().getCurrentHitPoints());
    }
}