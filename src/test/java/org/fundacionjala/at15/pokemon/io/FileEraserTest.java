package org.fundacionjala.at15.pokemon.io;

import static org.fundacionjala.at15.pokemon.io.Writer.*;
import static org.junit.Assert.assertTrue;
import org.fundacionjala.at15.pokemon.Town;
import org.junit.Test;

public class FileEraserTest {
    @Test
    public void itShouldEraseAFile() {
        Town town = new Town();
        writeToJson(town);

        assertTrue(FileEraser.eraseFile(town));
    }
}
