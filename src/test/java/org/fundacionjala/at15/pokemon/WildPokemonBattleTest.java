package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WildPokemonBattleTest {
    @Test
    public void itShouldCapturePokemon() {
        Pokemon pikachu = new Pokemon(400,"pikachu");
        Pokemon wildPokemon = new Pokemon(200,"bullbasur");
        Trainer trainer = new Trainer(pikachu,"ash");
        WildPokemonBattle battle = new WildPokemonBattle(trainer, wildPokemon);
        battle.fight();
        boolean wildPokemonIsCapture = battle.isCaptured();
        assertEquals(true, wildPokemonIsCapture);
    }
    @Test
    public void itShouldGetActualPokemon() {
        Pokemon pokemon = new Pokemon(100, "pikachu");
        Trainer trainer = new Trainer(pokemon, "ash");
        Pokemon wildPokemon = new Pokemon(100, "bullbasur");
        WildPokemonBattle battle = new WildPokemonBattle(trainer, wildPokemon);
        Pokemon actualPokemon = battle.getActualPokemon(trainer);
        String actual = actualPokemon.getPokemonName();
        assertEquals("pikachu", actual);
    }
}