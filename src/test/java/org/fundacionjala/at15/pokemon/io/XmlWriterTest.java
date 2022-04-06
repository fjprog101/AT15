package org.fundacionjala.at15.pokemon.io;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.*;

import org.fundacionjala.at15.pokemon.Move;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Store;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.exceptions.WalletException;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import org.junit.Test;

public class XmlWriterTest {
    @Test
    public void itShouldCreateAXmlFileFromAPokemon() {
        Pokemon pokemon = new Pokemon(200, "Mewto");
        pokemon.setMoveToList(new Move());
        pokemon.write(new XmlWriter());

        File inputFile = new File(POKEMON.getPath() + "/" + pokemon.getId() + ".xml");
        String line = "";
        String stringContent = "";
        try {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            line = input.readLine();
            while (line != null) {
                stringContent += line + "\n";
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        FileEraser.eraseFile(pokemon);
        assertTrue(stringContent.contains(pokemon.getId()));
    }

    @Test
    public void itShouldCreateAXmlFileFromATrainer() throws WalletException {
        Pokemon pokemon = new Pokemon(200, "Mewto");
        pokemon.setMoveToList(new Move());
        Trainer trainer = new Trainer(pokemon, "Misty");
        Store.buyHealingPotion(trainer);
        trainer.write(new XmlWriter());

        File inputFile = new File(TRAINER.getPath() + "/" + trainer.getId() + ".xml");
        String line = "";
        String stringContent = "";
        try {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            line = input.readLine();
            while (line != null) {
                stringContent += line + "\n";
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        FileEraser.eraseFile(trainer);
        assertTrue(stringContent.contains(trainer.getId()));
    }

    @Test
    public void itShouldCreateAXmlFileFromATown() {
        Town town = new Town("Town");
        town.write(new XmlWriter());

        File inputFile = new File(TRAINER.getPath() + "/" + town.getId() + ".xml");
        String line = "";
        String stringContent = "";
        try {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            line = input.readLine();
            while (line != null) {
                stringContent += line + "\n";
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        assertEquals("", stringContent);
    }
}
