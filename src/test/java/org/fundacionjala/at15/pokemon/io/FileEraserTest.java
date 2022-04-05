package org.fundacionjala.at15.pokemon.io;

import static org.junit.Assert.assertTrue;
import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.junit.Test;
import picocli.CommandLine;

public class FileEraserTest {
    @Test
    public void itShouldEraseAFileFromAEntity() {
        Town town = new Town();
        town.write(new JsonWriter());

        assertTrue(FileEraser.eraseFile(town));
    }

    @Test
    public void itShouldEraseAFileFromAnId() throws IncompleteArguments {
        CreatePokemon pokemon = new CreatePokemon();
        new CommandLine(pokemon).parseArgs("-n", "squirtle", "-hp", "100");
        pokemon.call();
        String nameID = pokemon.getIdPokemonCreated();
        assertTrue(FileEraser.eraseFile(nameID));
    }
}
