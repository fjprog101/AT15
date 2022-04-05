package org.fundacionjala.at15.pokemon.io;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.junit.Test;
import static org.fundacionjala.at15.pokemon.io.PathHandler.*;

public class PathHandlerTest {
    @Test
    public void getFileTest() {
        Pokemon pokemon = new Pokemon(100, "Test");
        Writer.writeToJson(pokemon);
        String result = getTypeFile(pokemon.getId());
        FileEraser.eraseFile(pokemon);
        assertEquals("json", result);
    }

    @Test
    public void itShouldReturnNull() {
        String filename = "non-existen-file";
        String file = getSubPath(filename);
        assertEquals(null, file);
    }

    @Test(expected = FileNotFoundException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() throws Exception{
        String filename = "pkm-non-existen-file";
        File file = getPath(filename);
        String fileRead = jSonStringReader(file);
        throw new FileNotFoundException();
    }

    @Test
    public void itShouldCreateANewFolder() {
        File file = new File(EntityType.BATTLE.getPath() + "/test");
        checkFolder(file);

        assertTrue(file.delete());
    }
}
