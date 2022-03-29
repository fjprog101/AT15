package org.fundacionjala.at15.pokemon.io;

import static org.fundacionjala.at15.pokemon.io.Reader.*;
import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.*;
import org.junit.Test;

public class ReaderTest {
    @Test
    public void itShouldReadAPokemonFile() {
        Pokemon pokemon = new Pokemon(100, "Charizard");

        Writer.writeToJson(pokemon);
        readJson(pokemon);
        String expected = "id: " + pokemon.getIdentifier() + " name: Charizard hitpoints: 100/100";
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadATrainerFile() {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Writer.writeToJson(trainer);
        readJson(trainer);
        String expected = "id: " + trainer.getIdentifier() + " name: Ash badges: 0 money: 100";
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadABattle() {
        final int hitPoints = 100;
        Pokemon pokemon = new Pokemon(hitPoints, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Trainer trainer2 = new Trainer(pokemon, "Brooke");

        TrainerBattle battle = new TrainerBattle(trainer, trainer2);
        Writer.writeToJson(battle);
        readJson(battle);

        String expected = "id: " + battle.getIdentifier() + " trainer1 name: Ash trainer2 name: Brooke isBattleOver: false";
        assertEquals(expected, getResult());
    }

    @Test
    public void itShouldReadATown() {

        Town town = new Town();
        Writer.writeToJson(town);
        readJson(town);

        String expected = "id: " + town.getIdentifier() + " town's gym leader name: gymLeader";
        assertEquals(expected, getResult());
    }
}
