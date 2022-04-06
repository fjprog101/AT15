package org.fundacionjala.at15.pokemon.io;

import org.fundacionjala.at15.pokemon.*;
import org.fundacionjala.at15.pokemon.commands.exceptions.WalletException;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReaderXMLTest {

    @Test
    public void itShouldReadAPokemonXMLFile() {
        Pokemon pokemon = new Pokemon(100, "Chikorita");
        pokemon.write(new XmlWriter());
        Entity entity = Reader.read(pokemon.getId());
        FileEraser.eraseFile(pokemon);
        assertEquals("class org.fundacionjala.at15.pokemon.Pokemon", entity.getClass().toString());

        String expected = "id: " + pokemon.getId() + " name: Chikorita hitpoints: 100.0/100.0";
        assertEquals(expected, Reader.getResult());
    }

    @Test
    public void itShouldReadeATrainerXmlFile() throws WalletException {
        Pokemon pokemon = new Pokemon(150, "Miau");
        pokemon.setMoveToList(new Move());
        Trainer trainer = new Trainer(pokemon, "Cesar");
        Store.buyHealingPotion(trainer);
        trainer.write(new XmlWriter());
        Entity entity = Reader.read(trainer.getId());
        FileEraser.eraseFile(entity);
        assertEquals("class org.fundacionjala.at15.pokemon.Trainer", entity.getClass().toString());

        String expected = "id: " + trainer.getId() + " name: Cesar badges: 0 money: 60";
        assertEquals(expected, Reader.getResult());
    }

    @Test
    public void itShouldReadeATownXmlFile() {
        Town town = new Town("Town");
        town.write(new XmlWriter());
        Entity entity = Reader.read(town.getId());
        FileEraser.eraseFile(town);
        assertEquals("class org.fundacionjala.at15.pokemon.Town", entity.getClass().toString());

        String expected = "id: " + town.getId() + " town's gym leader name: gymLeader";
        assertEquals(expected, Reader.getResult());
    }

    @Test
    public void itShouldReadeATrainerBattleXMLFile() {
        Pokemon pokemon1 = new Pokemon(200, "Mewto");
        pokemon1.setMoveToList(new Move());
        Trainer trainer1 = new Trainer(pokemon1, "James");
        Pokemon pokemon2 = new Pokemon(100, "Ivisaur");
        pokemon2.setMoveToList(new Move());
        Trainer trainer2 = new Trainer(pokemon2, "Ash");
        TrainerBattle trainerBattle = new TrainerBattle(trainer1, trainer2);
        trainerBattle.write(new XmlWriter());
        Entity entity = Reader.read(trainerBattle.getId());
        FileEraser.eraseFile(trainerBattle);
        assertEquals("class org.fundacionjala.at15.pokemon.TrainerBattle", entity.getClass().toString());

        String expected = "id: " + trainerBattle.getId() + " trainer1 name: James trainer2 name: Ash isBattleOver: false";
        assertEquals(expected, Reader.getResult());
    }
}
