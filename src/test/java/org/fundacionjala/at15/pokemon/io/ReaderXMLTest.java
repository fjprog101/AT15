package org.fundacionjala.at15.pokemon.io;

import org.fundacionjala.at15.pokemon.*;
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

        String expected = "id: " + pokemon.getId() + " name: Chikorita hitpoints: 100/100";
        assertEquals(expected, Reader.getResult());
    }

    @Test
    public void itShouldReadeATrainerXmlFile() {
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
}
