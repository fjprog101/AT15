package org.fundacionjala.at15.pokemon.io;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.*;

import org.fundacionjala.at15.pokemon.Pokemon;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import org.junit.Test;

public class XmlWriterTest {
    @Test
    public void itShouldCreateAXmlFileFromAnEntity() {
        Pokemon pokemon = new Pokemon(200, "Mewto");
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

        assertTrue(stringContent.contains(pokemon.getId()));
    }
}
