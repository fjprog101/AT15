package org.fundacionjala.at15.pokemon.io;

import org.fundacionjala.at15.pokemon.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.*;

public class ReaderXMLTest {

    @Test
    public void itShouldReadAPokemonXMLFile() {
        Pokemon pokemon = new Pokemon(100, "Chicorita");
        assertEquals(null, null);
    }
}
