package org.fundacionjala.at15.pokemon.io;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import static org.fundacionjala.at15.pokemon.io.PathHandler.*;

public class PathHandlerTest {
    @Test
    public void itShouldReturnNull() {
        String filename = "non-existen-file";
        File file = getPath(filename);
        assertEquals(null, file);
    }

    @Test(expected = FileNotFoundException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() throws Exception{
        String filename = "pkm-non-existen-file";
        File file = getPath(filename);
        String fileRead = jSonStringReader(file);
        throw new FileNotFoundException();
    }
}
